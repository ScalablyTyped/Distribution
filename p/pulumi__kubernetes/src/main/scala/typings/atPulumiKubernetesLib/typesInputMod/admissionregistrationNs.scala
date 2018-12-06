package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "admissionregistration")
@js.native
object admissionregistrationNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
             * Initializer describes the name and the failure policy of an initializer, and what resources
             * it applies to.
             */
    
    trait Initializer extends js.Object {
      /**
                   * Name is the identifier of the initializer. It will be added to the object that needs to be
                   * initialized. Name should be fully qualified, e.g., alwayspullimages.kubernetes.io, where
                   * "alwayspullimages" is the name of the webhook, and kubernetes.io is the name of the
                   * organization. Required
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Rules describes what resources/subresources the initializer cares about. The initializer
                   * cares about an operation if it matches _any_ Rule. Rule.Resources must not include
                   * subresources.
                   */
      var rules: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Rule]]] = js.undefined
    }
    
    /**
             * InitializerConfiguration describes the configuration of initializers.
             */
    
    trait InitializerConfiguration extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Initializers is a list of resources and their default initializers Order-sensitive. When
                   * merging multiple InitializerConfigurations, we sort the initializers from different
                   * InitializerConfigurations by the name of the InitializerConfigurations; the order of the
                   * initializers from the same InitializerConfiguration is preserved.
                   */
      var initializers: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Initializer]]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
             * InitializerConfigurationList is a list of InitializerConfiguration.
             */
    
    trait InitializerConfigurationList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of InitializerConfiguration.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[InitializerConfiguration]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * Rule is a tuple of APIGroups, APIVersion, and Resources.It is recommended to make sure that
             * all the tuple expansions are valid.
             */
    
    trait Rule extends js.Object {
      /**
                   * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present,
                   * the length of the slice must be one. Required.
                   */
      var apiGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
                   * present, the length of the slice must be one. Required.
                   */
      var apiVersions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    def isInitializerConfiguration(o: js.Any): /* is InitializerConfiguration */scala.Boolean = js.native
    def isInitializerConfigurationList(o: js.Any): /* is InitializerConfigurationList */scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
             * or reject and may change the object.
             */
    
    trait MutatingWebhookConfiguration extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Webhooks is a list of webhooks and the affected resources and operations.
                   */
      var webhooks: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Webhook]]] = js.undefined
    }
    
    /**
             * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
             */
    
    trait MutatingWebhookConfigurationList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of MutatingWebhookConfiguration.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[MutatingWebhookConfiguration]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
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
      var apiGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is
                   * present, the length of the slice must be one. Required.
                   */
      var apiVersions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Operations is the operations the admission hook cares about - CREATE, UPDATE, or * for all
                   * operations. If '*' is present, the length of the slice must be one. Required.
                   */
      var operations: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
    }
    
    /**
             * ServiceReference holds a reference to Service.legacy.k8s.io
             */
    
    trait ServiceReference extends js.Object {
      /**
                   * `name` is the name of the service. Required
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * `namespace` is the namespace of the service. Required
                   */
      var namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * `path` is an optional URL path which will be sent in any request to this service.
                   */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Webhooks is a list of webhooks and the affected resources and operations.
                   */
      var webhooks: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Webhook]]] = js.undefined
    }
    
    /**
             * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
             */
    
    trait ValidatingWebhookConfigurationList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of ValidatingWebhookConfiguration.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ValidatingWebhookConfiguration]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * Webhook describes an admission webhook and the resources and operations it applies to.
             */
    
    trait Webhook extends js.Object {
      /**
                   * ClientConfig defines how to communicate with the hook. Required
                   */
      var clientConfig: atPulumiPulumiLib.resourceMod.Input[WebhookClientConfig]
      /**
                   * FailurePolicy defines how unrecognized errors from the admission endpoint are handled -
                   * allowed values are Ignore or Fail. Defaults to Ignore.
                   */
      var failurePolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The name of the admission webhook. Name should be fully qualified, e.g.,
                   * imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and
                   * kubernetes.io is the name of the organization. Required.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var namespaceSelector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
                   * Rules describes what operations on what resources/subresources the webhook cares about. The
                   * webhook cares about an operation if it matches _any_ Rule. However, in order to prevent
                   * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a
                   * state which cannot be recovered from without completely disabling the plugin,
                   * ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission
                   * requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
                   */
      var rules: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[RuleWithOperations]]] = js.undefined
      /**
                   * SideEffects states whether this webhookk has side effects. Acceptable values are: Unknown,
                   * None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system,
                   * since a request may be rejected by a future step in the admission change and the side
                   * effects therefore need to be undone. Requests with the dryRun attribute will be
                   * auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to
                   * Unknown.
                   */
      var sideEffects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * WebhookClientConfig contains the information to make a TLS connection with the webhook
             */
    
    trait WebhookClientConfig extends js.Object {
      /**
                   * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server
                   * certificate. If unspecified, system trust roots on the apiserver are used.
                   */
      var caBundle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * `service` is a reference to the service for this webhook. Either `service` or `url` must be
                   * specified.
                   *
                   * If the webhook is running within the cluster, then you should use `service`.
                   *
                   * Port 443 will be used if it is open, otherwise it is an error.
                   */
      var service: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ServiceReference]] = js.undefined
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
      var url: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isMutatingWebhookConfiguration(o: js.Any): /* is MutatingWebhookConfiguration */scala.Boolean = js.native
    def isMutatingWebhookConfigurationList(o: js.Any): /* is MutatingWebhookConfigurationList */scala.Boolean = js.native
    def isValidatingWebhookConfiguration(o: js.Any): /* is ValidatingWebhookConfiguration */scala.Boolean = js.native
    def isValidatingWebhookConfigurationList(o: js.Any): /* is ValidatingWebhookConfigurationList */scala.Boolean = js.native
  }
  
}

