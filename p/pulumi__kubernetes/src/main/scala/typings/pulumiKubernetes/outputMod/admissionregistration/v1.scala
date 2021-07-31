package typings.pulumiKubernetes.outputMod.admissionregistration

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait MutatingWebhook extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
      */
    var admissionReviewVersions: js.Array[String]
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: WebhookClientConfig
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
      */
    var failurePolicy: String
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Equivalent"
      */
    var matchPolicy: String
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: String
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
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
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
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
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: LabelSelector
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: LabelSelector
    
    /**
      * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation. Allowed values are "Never" and "IfNeeded".
      *
      * Never: the webhook will not be called more than once in a single admission evaluation.
      *
      * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option *must* be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
      *
      * Defaults to "Never".
      */
    var reinvocationPolicy: String
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.Array[RuleWithOperations]
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
      */
    var sideEffects: String
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
      */
    var timeoutSeconds: Double
  }
  object MutatingWebhook {
    
    @scala.inline
    def apply(
      admissionReviewVersions: js.Array[String],
      clientConfig: WebhookClientConfig,
      failurePolicy: String,
      matchPolicy: String,
      name: String,
      namespaceSelector: LabelSelector,
      objectSelector: LabelSelector,
      reinvocationPolicy: String,
      rules: js.Array[RuleWithOperations],
      sideEffects: String,
      timeoutSeconds: Double
    ): MutatingWebhook = {
      val __obj = js.Dynamic.literal(admissionReviewVersions = admissionReviewVersions.asInstanceOf[js.Any], clientConfig = clientConfig.asInstanceOf[js.Any], failurePolicy = failurePolicy.asInstanceOf[js.Any], matchPolicy = matchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], objectSelector = objectSelector.asInstanceOf[js.Any], reinvocationPolicy = reinvocationPolicy.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatingWebhook]
    }
    
    @scala.inline
    implicit class MutatingWebhookMutableBuilder[Self <: MutatingWebhook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmissionReviewVersions(value: js.Array[String]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmissionReviewVersionsVarargs(value: String*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value :_*))
      
      @scala.inline
      def setClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailurePolicy(value: String): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchPolicy(value: String): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceSelector(value: LabelSelector): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectSelector(value: LabelSelector): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReinvocationPolicy(value: String): Self = StObject.set(x, "reinvocationPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[RuleWithOperations]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: RuleWithOperations*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setSideEffects(value: String): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
    */
  trait MutatingWebhookConfiguration extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: admissionregistrationDotk8sDotioSlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    var metadata: ObjectMeta
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    var webhooks: js.Array[MutatingWebhook]
  }
  object MutatingWebhookConfiguration {
    
    @scala.inline
    def apply(metadata: ObjectMeta, webhooks: js.Array[MutatingWebhook]): MutatingWebhookConfiguration = {
      val __obj = js.Dynamic.literal(apiVersion = "admissionregistration.k8s.io/v1", kind = "MutatingWebhookConfiguration", metadata = metadata.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutatingWebhookConfiguration]
    }
    
    @scala.inline
    implicit class MutatingWebhookConfigurationMutableBuilder[Self <: MutatingWebhookConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: admissionregistrationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.MutatingWebhookConfiguration): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooks(value: js.Array[MutatingWebhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooksVarargs(value: MutatingWebhook*): Self = StObject.set(x, "webhooks", js.Array(value :_*))
    }
  }
  
  /**
    * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
    */
  trait RuleWithOperations extends StObject {
    
    /**
      * APIGroups is the API groups the resources belong to. '*' is all groups. If '*' is present, the length of the slice must be one. Required.
      */
    var apiGroups: js.Array[String]
    
    /**
      * APIVersions is the API versions the resources belong to. '*' is all versions. If '*' is present, the length of the slice must be one. Required.
      */
    var apiVersions: js.Array[String]
    
    /**
      * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If '*' is present, the length of the slice must be one. Required.
      */
    var operations: js.Array[String]
    
    /**
      * Resources is a list of resources this rule applies to.
      *
      * For example: 'pods' means pods. 'pods/log' means the log subresource of pods. '*' means all resources, but not subresources. 'pods/ *' means all subresources of pods. '*&#47;scale' means all scale subresources. '*&#47;*' means all resources and their subresources.
      *
      * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
      *
      * Depending on the enclosing object, subresources might not be allowed. Required.
      */
    var resources: js.Array[String]
    
    /**
      * scope specifies the scope of this rule. Valid values are "Cluster", "Namespaced", and "*" "Cluster" means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. "Namespaced" means that only namespaced resources will match this rule. "*" means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is "*".
      */
    var scope: String
  }
  object RuleWithOperations {
    
    @scala.inline
    def apply(
      apiGroups: js.Array[String],
      apiVersions: js.Array[String],
      operations: js.Array[String],
      resources: js.Array[String],
      scope: String
    ): RuleWithOperations = {
      val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], apiVersions = apiVersions.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleWithOperations]
    }
    
    @scala.inline
    implicit class RuleWithOperationsMutableBuilder[Self <: RuleWithOperations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiGroups(value: js.Array[String]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiGroupsVarargs(value: String*): Self = StObject.set(x, "apiGroups", js.Array(value :_*))
      
      @scala.inline
      def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value :_*))
      
      @scala.inline
      def setOperations(value: js.Array[String]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsVarargs(value: String*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ServiceReference holds a reference to Service.legacy.k8s.io
    */
  trait ServiceReference extends StObject {
    
    /**
      * `name` is the name of the service. Required
      */
    var name: String
    
    /**
      * `namespace` is the namespace of the service. Required
      */
    var namespace: String
    
    /**
      * `path` is an optional URL path which will be sent in any request to this service.
      */
    var path: String
    
    /**
      * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
      */
    var port: Double
  }
  object ServiceReference {
    
    @scala.inline
    def apply(name: String, namespace: String, path: String, port: Double): ServiceReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceReference]
    }
    
    @scala.inline
    implicit class ServiceReferenceMutableBuilder[Self <: ServiceReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
    */
  trait ValidatingWebhook extends StObject {
    
    /**
      * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy.
      */
    var admissionReviewVersions: js.Array[String]
    
    /**
      * ClientConfig defines how to communicate with the hook. Required
      */
    var clientConfig: WebhookClientConfig
    
    /**
      * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Fail.
      */
    var failurePolicy: String
    
    /**
      * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
      *
      * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
      *
      * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
      *
      * Defaults to "Equivalent"
      */
    var matchPolicy: String
    
    /**
      * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
      */
    var name: String
    
    /**
      * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
      *
      * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
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
      * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
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
      * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
      *
      * Default to the empty LabelSelector, which matches everything.
      */
    var namespaceSelector: LabelSelector
    
    /**
      * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
      */
    var objectSelector: LabelSelector
    
    /**
      * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
      */
    var rules: js.Array[RuleWithOperations]
    
    /**
      * SideEffects states whether this webhook has side effects. Acceptable values are: None, NoneOnDryRun (webhooks created via v1beta1 may also specify Some or Unknown). Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some.
      */
    var sideEffects: String
    
    /**
      * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 10 seconds.
      */
    var timeoutSeconds: Double
  }
  object ValidatingWebhook {
    
    @scala.inline
    def apply(
      admissionReviewVersions: js.Array[String],
      clientConfig: WebhookClientConfig,
      failurePolicy: String,
      matchPolicy: String,
      name: String,
      namespaceSelector: LabelSelector,
      objectSelector: LabelSelector,
      rules: js.Array[RuleWithOperations],
      sideEffects: String,
      timeoutSeconds: Double
    ): ValidatingWebhook = {
      val __obj = js.Dynamic.literal(admissionReviewVersions = admissionReviewVersions.asInstanceOf[js.Any], clientConfig = clientConfig.asInstanceOf[js.Any], failurePolicy = failurePolicy.asInstanceOf[js.Any], matchPolicy = matchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceSelector = namespaceSelector.asInstanceOf[js.Any], objectSelector = objectSelector.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatingWebhook]
    }
    
    @scala.inline
    implicit class ValidatingWebhookMutableBuilder[Self <: ValidatingWebhook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmissionReviewVersions(value: js.Array[String]): Self = StObject.set(x, "admissionReviewVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmissionReviewVersionsVarargs(value: String*): Self = StObject.set(x, "admissionReviewVersions", js.Array(value :_*))
      
      @scala.inline
      def setClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailurePolicy(value: String): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchPolicy(value: String): Self = StObject.set(x, "matchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceSelector(value: LabelSelector): Self = StObject.set(x, "namespaceSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectSelector(value: LabelSelector): Self = StObject.set(x, "objectSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[RuleWithOperations]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: RuleWithOperations*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setSideEffects(value: String): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
    */
  trait ValidatingWebhookConfiguration extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: admissionregistrationDotk8sDotioSlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    var metadata: ObjectMeta
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    var webhooks: js.Array[ValidatingWebhook]
  }
  object ValidatingWebhookConfiguration {
    
    @scala.inline
    def apply(metadata: ObjectMeta, webhooks: js.Array[ValidatingWebhook]): ValidatingWebhookConfiguration = {
      val __obj = js.Dynamic.literal(apiVersion = "admissionregistration.k8s.io/v1", kind = "ValidatingWebhookConfiguration", metadata = metadata.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatingWebhookConfiguration]
    }
    
    @scala.inline
    implicit class ValidatingWebhookConfigurationMutableBuilder[Self <: ValidatingWebhookConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: admissionregistrationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooks(value: js.Array[ValidatingWebhook]): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooksVarargs(value: ValidatingWebhook*): Self = StObject.set(x, "webhooks", js.Array(value :_*))
    }
  }
  
  /**
    * WebhookClientConfig contains the information to make a TLS connection with the webhook
    */
  trait WebhookClientConfig extends StObject {
    
    /**
      * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
      */
    var caBundle: String
    
    /**
      * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
      *
      * If the webhook is running within the cluster, then you should use `service`.
      */
    var service: ServiceReference
    
    /**
      * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
      *
      * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
      *
      * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
      *
      * The scheme must be "https"; the URL must begin with "https://".
      *
      * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
      *
      * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
      */
    var url: String
  }
  object WebhookClientConfig {
    
    @scala.inline
    def apply(caBundle: String, service: ServiceReference, url: String): WebhookClientConfig = {
      val __obj = js.Dynamic.literal(caBundle = caBundle.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookClientConfig]
    }
    
    @scala.inline
    implicit class WebhookClientConfigMutableBuilder[Self <: WebhookClientConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaBundle(value: String): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: ServiceReference): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
