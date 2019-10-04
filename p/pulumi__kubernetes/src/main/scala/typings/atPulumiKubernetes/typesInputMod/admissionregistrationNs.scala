package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`admissionregistrationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhook
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.MutatingWebhookConfiguration
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.RuleWithOperations
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ServiceReference
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhook
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.ValidatingWebhookConfiguration
import typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1Ns.WebhookClientConfig
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelector
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "admissionregistration")
@js.native
object admissionregistrationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * MutatingWebhook describes an admission webhook and the resources and operations it applies
      * to.
      */
    trait MutatingWebhook extends js.Object {
      /**
        * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
        * Webhook expects. API server will try to use first version in the list which it supports. If
        * none of the versions specified in this list supported by API server, validation will fail
        * for this object. If a persisted webhook configuration specifies allowed versions and does
        * not include any versions known to the API Server, calls to the webhook will fail and be
        * subject to the failure policy.
        */
      var admissionReviewVersions: Input[js.Array[Input[String]]]
      /**
        * ClientConfig defines how to communicate with the hook. Required
        */
      var clientConfig: Input[WebhookClientConfig]
      /**
        * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
        * allowed values are Ignore or Fail. Defaults to Fail.
        */
      var failurePolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
        * are "Exact" or "Equivalent".
        *
        * - Exact: match a request only if it exactly matches a specified rule. For example, if
        * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
        * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
        * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
        *
        * - Equivalent: match a request if modifies a resource listed in rules, even via another API
        * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
        * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
        * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
        * converted to apps/v1 and sent to the webhook.
        *
        * Defaults to "Equivalent"
        */
      var matchPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name of the admission webhook. Name should be fully qualified, e.g.,
        * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
        * kubernetes.io is the name of the organization. Required.
        */
      var name: Input[String]
      /**
        * NamespaceSelector decides whether to run the webhook on an object based on whether the
        * namespace for that object matches the selector. If the object itself is a namespace, the
        * matching is performed on object.metadata.labels. If the object is another cluster scoped
        * resource, it never skips the webhook.
        *
        * For example, to run the webhook on any objects whose namespace is not associated with
        * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "runlevel",
        *       "operator": "NotIn",
        *       "values": [
        *         "0",
        *         "1"
        *       ]
        *     }
        *   ]
        * }
        *
        * If instead you want to only run the webhook on any objects whose namespace is associated
        * with the "environment" of "prod" or "staging"; you will set the selector as follows:
        * "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "environment",
        *       "operator": "In",
        *       "values": [
        *         "prod",
        *         "staging"
        *       ]
        *     }
        *   ]
        * }
        *
        * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more
        * examples of label selectors.
        *
        * Default to the empty LabelSelector, which matches everything.
        */
      var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * ObjectSelector decides whether to run the webhook based on if the object has matching
        * labels. objectSelector is evaluated against both the oldObject and newObject that would be
        * sent to the webhook, and is considered to match if either object matches the selector. A
        * null object (oldObject in the case of create, or newObject in the case of delete) or an
        * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
        * not considered to match. Use the object selector only if the webhook is opt-in, because end
        * users may skip the admission webhook by setting the labels. Default to the empty
        * LabelSelector, which matches everything.
        */
      var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * reinvocationPolicy indicates whether this webhook should be called multiple times as part
        * of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
        *
        * Never: the webhook will not be called more than once in a single admission evaluation.
        *
        * IfNeeded: the webhook will be called at least one additional time as part of the admission
        * evaluation if the object being admitted is modified by other admission plugins after the
        * initial webhook call. Webhooks that specify this option *must* be idempotent, able to
        * process objects they previously admitted. Note: * the number of additional invocations is
        * not guaranteed to be exactly one. * if additional invocations result in further
        * modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks
        * that use this option may be reordered to minimize the number of additional invocations. *
        * to validate an object after all mutations are guaranteed complete, use a validating
        * admission webhook instead.
        *
        * Defaults to "Never".
        */
      var reinvocationPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * Rules describes what operations on what resources/subresources the webhook cares about. The
        * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
        * state which cannot be recovered from without completely disabling the plugin,
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
        * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
        */
      var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.undefined
      /**
        * SideEffects states whether this webhook has side effects. Acceptable values are: None,
        * NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with
        * side effects MUST implement a reconciliation system, since a request may be rejected by a
        * future step in the admission change and the side effects therefore need to be undone.
        * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
        * sideEffects == Unknown or Some.
        */
      var sideEffects: Input[String]
      /**
        * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
        * webhook call will be ignored or the API call will fail based on the failure policy. The
        * timeout value must be between 1 and 30 seconds. Default to 10 seconds.
        */
      var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
      * or reject and may change the object.
      */
    trait MutatingWebhookConfiguration extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfiguration
            ]
          ] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      var webhooks: js.UndefOr[Input[js.Array[Input[MutatingWebhook]]]] = js.undefined
    }
    
    /**
      * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
      */
    trait MutatingWebhookConfigurationList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * List of MutatingWebhookConfiguration.
        */
      var items: Input[js.Array[Input[MutatingWebhookConfiguration]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfigurationList
            ]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure
      * that all the tuple expansions are valid.
      */
    trait RuleWithOperations extends js.Object {
      /**
        * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
        * the length of the slice must be one. Required.
        */
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
        * present, the length of the slice must be one. Required.
        */
      var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
        * operations. If '*' is present, the length of the slice must be one. Required.
        */
      var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.
        *
        * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all
        * resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#8205;/scale'
        * means all scale subresources. '*&#8205;/ *' means all resources and their subresources.
        *
        * If wildcard is present, the validation rule will ensure resources do not overlap with each
        * other.
        *
        * Depending on the enclosing object, subresources might not be allowed. Required.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*"
        * "Cluster" means that only cluster-scoped resources will match this rule. Namespace API
        * objects are cluster-scoped. "Namespaced" means that only namespaced resources will match
        * this rule. "*" means that there are no scope restrictions. Subresources match the scope of
        * their parent resource. Default is "*".
        */
      var scope: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends js.Object {
      /**
        * `name` is the name of the service. Required
        */
      var name: Input[String]
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: Input[String]
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward
        * compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ValidatingWebhook describes an admission webhook and the resources and operations it applies
      * to.
      */
    trait ValidatingWebhook extends js.Object {
      /**
        * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
        * Webhook expects. API server will try to use first version in the list which it supports. If
        * none of the versions specified in this list supported by API server, validation will fail
        * for this object. If a persisted webhook configuration specifies allowed versions and does
        * not include any versions known to the API Server, calls to the webhook will fail and be
        * subject to the failure policy.
        */
      var admissionReviewVersions: Input[js.Array[Input[String]]]
      /**
        * ClientConfig defines how to communicate with the hook. Required
        */
      var clientConfig: Input[WebhookClientConfig]
      /**
        * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
        * allowed values are Ignore or Fail. Defaults to Fail.
        */
      var failurePolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
        * are "Exact" or "Equivalent".
        *
        * - Exact: match a request only if it exactly matches a specified rule. For example, if
        * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
        * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
        * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
        *
        * - Equivalent: match a request if modifies a resource listed in rules, even via another API
        * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
        * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
        * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
        * converted to apps/v1 and sent to the webhook.
        *
        * Defaults to "Equivalent"
        */
      var matchPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name of the admission webhook. Name should be fully qualified, e.g.,
        * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
        * kubernetes.io is the name of the organization. Required.
        */
      var name: Input[String]
      /**
        * NamespaceSelector decides whether to run the webhook on an object based on whether the
        * namespace for that object matches the selector. If the object itself is a namespace, the
        * matching is performed on object.metadata.labels. If the object is another cluster scoped
        * resource, it never skips the webhook.
        *
        * For example, to run the webhook on any objects whose namespace is not associated with
        * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "runlevel",
        *       "operator": "NotIn",
        *       "values": [
        *         "0",
        *         "1"
        *       ]
        *     }
        *   ]
        * }
        *
        * If instead you want to only run the webhook on any objects whose namespace is associated
        * with the "environment" of "prod" or "staging"; you will set the selector as follows:
        * "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "environment",
        *       "operator": "In",
        *       "values": [
        *         "prod",
        *         "staging"
        *       ]
        *     }
        *   ]
        * }
        *
        * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more
        * examples of label selectors.
        *
        * Default to the empty LabelSelector, which matches everything.
        */
      var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * ObjectSelector decides whether to run the webhook based on if the object has matching
        * labels. objectSelector is evaluated against both the oldObject and newObject that would be
        * sent to the webhook, and is considered to match if either object matches the selector. A
        * null object (oldObject in the case of create, or newObject in the case of delete) or an
        * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
        * not considered to match. Use the object selector only if the webhook is opt-in, because end
        * users may skip the admission webhook by setting the labels. Default to the empty
        * LabelSelector, which matches everything.
        */
      var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * Rules describes what operations on what resources/subresources the webhook cares about. The
        * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
        * state which cannot be recovered from without completely disabling the plugin,
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
        * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
        */
      var rules: js.UndefOr[Input[js.Array[Input[RuleWithOperations]]]] = js.undefined
      /**
        * SideEffects states whether this webhook has side effects. Acceptable values are: None,
        * NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with
        * side effects MUST implement a reconciliation system, since a request may be rejected by a
        * future step in the admission change and the side effects therefore need to be undone.
        * Requests with the dryRun attribute will be auto-rejected if they match a webhook with
        * sideEffects == Unknown or Some.
        */
      var sideEffects: Input[String]
      /**
        * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
        * webhook call will be ignored or the API call will fail based on the failure policy. The
        * timeout value must be between 1 and 30 seconds. Default to 10 seconds.
        */
      var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
      * accept or reject and object without changing it.
      */
    trait ValidatingWebhookConfiguration extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration
            ]
          ] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      var webhooks: js.UndefOr[Input[js.Array[Input[ValidatingWebhook]]]] = js.undefined
    }
    
    /**
      * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
      */
    trait ValidatingWebhookConfigurationList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * List of ValidatingWebhookConfiguration.
        */
      var items: Input[js.Array[Input[ValidatingWebhookConfiguration]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList
            ]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * WebhookClientConfig contains the information to make a TLS connection with the webhook
      */
    trait WebhookClientConfig extends js.Object {
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server
        * certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.undefined
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
        * Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field
        * instead. The host might be resolved via external DNS in some apiservers (e.g.,
        * `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation).
        * `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take
        * great care to run this webhook on all hosts which run an apiserver which might need to make
        * calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn
        * up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the
        * path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
        * ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isMutatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1.MutatingWebhookConfiguration */ Boolean = js.native
    def isMutatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1.MutatingWebhookConfigurationList */ Boolean = js.native
    def isValidatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1.ValidatingWebhookConfiguration */ Boolean = js.native
    def isValidatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1.ValidatingWebhookConfigurationList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * MutatingWebhook describes an admission webhook and the resources and operations it applies
      * to.
      */
    trait MutatingWebhook extends js.Object {
      /**
        * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
        * Webhook expects. API server will try to use first version in the list which it supports. If
        * none of the versions specified in this list supported by API server, validation will fail
        * for this object. If a persisted webhook configuration specifies allowed versions and does
        * not include any versions known to the API Server, calls to the webhook will fail and be
        * subject to the failure policy. Default to `['v1beta1']`.
        */
      var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ClientConfig defines how to communicate with the hook. Required
        */
      var clientConfig: Input[
            typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.WebhookClientConfig
          ]
      /**
        * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
        * allowed values are Ignore or Fail. Defaults to Ignore.
        */
      var failurePolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
        * are "Exact" or "Equivalent".
        *
        * - Exact: match a request only if it exactly matches a specified rule. For example, if
        * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
        * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
        * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
        *
        * - Equivalent: match a request if modifies a resource listed in rules, even via another API
        * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
        * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
        * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
        * converted to apps/v1 and sent to the webhook.
        *
        * Defaults to "Exact"
        */
      var matchPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name of the admission webhook. Name should be fully qualified, e.g.,
        * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
        * kubernetes.io is the name of the organization. Required.
        */
      var name: Input[String]
      /**
        * NamespaceSelector decides whether to run the webhook on an object based on whether the
        * namespace for that object matches the selector. If the object itself is a namespace, the
        * matching is performed on object.metadata.labels. If the object is another cluster scoped
        * resource, it never skips the webhook.
        *
        * For example, to run the webhook on any objects whose namespace is not associated with
        * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "runlevel",
        *       "operator": "NotIn",
        *       "values": [
        *         "0",
        *         "1"
        *       ]
        *     }
        *   ]
        * }
        *
        * If instead you want to only run the webhook on any objects whose namespace is associated
        * with the "environment" of "prod" or "staging"; you will set the selector as follows:
        * "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "environment",
        *       "operator": "In",
        *       "values": [
        *         "prod",
        *         "staging"
        *       ]
        *     }
        *   ]
        * }
        *
        * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more
        * examples of label selectors.
        *
        * Default to the empty LabelSelector, which matches everything.
        */
      var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * ObjectSelector decides whether to run the webhook based on if the object has matching
        * labels. objectSelector is evaluated against both the oldObject and newObject that would be
        * sent to the webhook, and is considered to match if either object matches the selector. A
        * null object (oldObject in the case of create, or newObject in the case of delete) or an
        * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
        * not considered to match. Use the object selector only if the webhook is opt-in, because end
        * users may skip the admission webhook by setting the labels. Default to the empty
        * LabelSelector, which matches everything.
        */
      var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * reinvocationPolicy indicates whether this webhook should be called multiple times as part
        * of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
        *
        * Never: the webhook will not be called more than once in a single admission evaluation.
        *
        * IfNeeded: the webhook will be called at least one additional time as part of the admission
        * evaluation if the object being admitted is modified by other admission plugins after the
        * initial webhook call. Webhooks that specify this option *must* be idempotent, able to
        * process objects they previously admitted. Note: * the number of additional invocations is
        * not guaranteed to be exactly one. * if additional invocations result in further
        * modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks
        * that use this option may be reordered to minimize the number of additional invocations. *
        * to validate an object after all mutations are guaranteed complete, use a validating
        * admission webhook instead.
        *
        * Defaults to "Never".
        */
      var reinvocationPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * Rules describes what operations on what resources/subresources the webhook cares about. The
        * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
        * state which cannot be recovered from without completely disabling the plugin,
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
        * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
        */
      var rules: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.RuleWithOperations
                ]
              ]
            ]
          ] = js.undefined
      /**
        * SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown,
        * None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system,
        * since a request may be rejected by a future step in the admission change and the side
        * effects therefore need to be undone. Requests with the dryRun attribute will be
        * auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to
        * Unknown.
        */
      var sideEffects: js.UndefOr[Input[String]] = js.undefined
      /**
        * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
        * webhook call will be ignored or the API call will fail based on the failure policy. The
        * timeout value must be between 1 and 30 seconds. Default to 30 seconds.
        */
      var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
      * or reject and may change the object. Deprecated in v1.16, planned for removal in v1.19. Use
      * admissionregistration.k8s.io/v1 MutatingWebhookConfiguration instead.
      */
    trait MutatingWebhookConfiguration extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfiguration
            ]
          ] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      var webhooks: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhook
                ]
              ]
            ]
          ] = js.undefined
    }
    
    /**
      * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
      */
    trait MutatingWebhookConfigurationList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * List of MutatingWebhookConfiguration.
        */
      var items: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
              ]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.MutatingWebhookConfigurationList
            ]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure
      * that all the tuple expansions are valid.
      */
    trait RuleWithOperations extends js.Object {
      /**
        * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
        * the length of the slice must be one. Required.
        */
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
        * present, the length of the slice must be one. Required.
        */
      var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
        * operations. If '*' is present, the length of the slice must be one. Required.
        */
      var operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.
        *
        * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all
        * resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#8205;/scale'
        * means all scale subresources. '*&#8205;/ *' means all resources and their subresources.
        *
        * If wildcard is present, the validation rule will ensure resources do not overlap with each
        * other.
        *
        * Depending on the enclosing object, subresources might not be allowed. Required.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*"
        * "Cluster" means that only cluster-scoped resources will match this rule. Namespace API
        * objects are cluster-scoped. "Namespaced" means that only namespaced resources will match
        * this rule. "*" means that there are no scope restrictions. Subresources match the scope of
        * their parent resource. Default is "*".
        */
      var scope: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends js.Object {
      /**
        * `name` is the name of the service. Required
        */
      var name: Input[String]
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: Input[String]
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward
        * compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ValidatingWebhook describes an admission webhook and the resources and operations it applies
      * to.
      */
    trait ValidatingWebhook extends js.Object {
      /**
        * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the
        * Webhook expects. API server will try to use first version in the list which it supports. If
        * none of the versions specified in this list supported by API server, validation will fail
        * for this object. If a persisted webhook configuration specifies allowed versions and does
        * not include any versions known to the API Server, calls to the webhook will fail and be
        * subject to the failure policy. Default to `['v1beta1']`.
        */
      var admissionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ClientConfig defines how to communicate with the hook. Required
        */
      var clientConfig: Input[
            typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.WebhookClientConfig
          ]
      /**
        * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
        * allowed values are Ignore or Fail. Defaults to Ignore.
        */
      var failurePolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values
        * are "Exact" or "Equivalent".
        *
        * - Exact: match a request only if it exactly matches a specified rule. For example, if
        * deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules"
        * only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a
        * request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
        *
        * - Equivalent: match a request if modifies a resource listed in rules, even via another API
        * group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1,
        * and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"],
        * resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be
        * converted to apps/v1 and sent to the webhook.
        *
        * Defaults to "Exact"
        */
      var matchPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The name of the admission webhook. Name should be fully qualified, e.g.,
        * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
        * kubernetes.io is the name of the organization. Required.
        */
      var name: Input[String]
      /**
        * NamespaceSelector decides whether to run the webhook on an object based on whether the
        * namespace for that object matches the selector. If the object itself is a namespace, the
        * matching is performed on object.metadata.labels. If the object is another cluster scoped
        * resource, it never skips the webhook.
        *
        * For example, to run the webhook on any objects whose namespace is not associated with
        * "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "runlevel",
        *       "operator": "NotIn",
        *       "values": [
        *         "0",
        *         "1"
        *       ]
        *     }
        *   ]
        * }
        *
        * If instead you want to only run the webhook on any objects whose namespace is associated
        * with the "environment" of "prod" or "staging"; you will set the selector as follows:
        * "namespaceSelector": {
        *   "matchExpressions": [
        *     {
        *       "key": "environment",
        *       "operator": "In",
        *       "values": [
        *         "prod",
        *         "staging"
        *       ]
        *     }
        *   ]
        * }
        *
        * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more
        * examples of label selectors.
        *
        * Default to the empty LabelSelector, which matches everything.
        */
      var namespaceSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * ObjectSelector decides whether to run the webhook based on if the object has matching
        * labels. objectSelector is evaluated against both the oldObject and newObject that would be
        * sent to the webhook, and is considered to match if either object matches the selector. A
        * null object (oldObject in the case of create, or newObject in the case of delete) or an
        * object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is
        * not considered to match. Use the object selector only if the webhook is opt-in, because end
        * users may skip the admission webhook by setting the labels. Default to the empty
        * LabelSelector, which matches everything.
        */
      var objectSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * Rules describes what operations on what resources/subresources the webhook cares about. The
        * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
        * state which cannot be recovered from without completely disabling the plugin,
        * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
        * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
        */
      var rules: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.RuleWithOperations
                ]
              ]
            ]
          ] = js.undefined
      /**
        * SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown,
        * None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system,
        * since a request may be rejected by a future step in the admission change and the side
        * effects therefore need to be undone. Requests with the dryRun attribute will be
        * auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to
        * Unknown.
        */
      var sideEffects: js.UndefOr[Input[String]] = js.undefined
      /**
        * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the
        * webhook call will be ignored or the API call will fail based on the failure policy. The
        * timeout value must be between 1 and 30 seconds. Default to 30 seconds.
        */
      var timeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
      * accept or reject and object without changing it. Deprecated in v1.16, planned for removal in
      * v1.19. Use admissionregistration.k8s.io/v1 ValidatingWebhookConfiguration instead.
      */
    trait ValidatingWebhookConfiguration extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfiguration
            ]
          ] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      var webhooks: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhook
                ]
              ]
            ]
          ] = js.undefined
    }
    
    /**
      * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
      */
    trait ValidatingWebhookConfigurationList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`admissionregistrationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * List of ValidatingWebhookConfiguration.
        */
      var items: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
              ]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.ValidatingWebhookConfigurationList
            ]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * WebhookClientConfig contains the information to make a TLS connection with the webhook
      */
    trait WebhookClientConfig extends js.Object {
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server
        * certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.ServiceReference
            ]
          ] = js.undefined
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
        * Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field
        * instead. The host might be resolved via external DNS in some apiservers (e.g.,
        * `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation).
        * `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take
        * great care to run this webhook on all hosts which run an apiserver which might need to make
        * calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn
        * up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the
        * path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
        * ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isMutatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.MutatingWebhookConfiguration */ Boolean = js.native
    def isMutatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.MutatingWebhookConfigurationList */ Boolean = js.native
    def isValidatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.ValidatingWebhookConfiguration */ Boolean = js.native
    def isValidatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.ValidatingWebhookConfigurationList */ Boolean = js.native
  }
  
}

