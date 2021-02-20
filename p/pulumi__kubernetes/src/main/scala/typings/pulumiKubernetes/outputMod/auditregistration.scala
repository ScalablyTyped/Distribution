package typings.pulumiKubernetes.outputMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditregistration {
  
  object v1alpha1 {
    
    /**
      * AuditSink represents a cluster level audit sink
      */
    @js.native
    trait AuditSink extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: auditregistrationDotk8sDotioSlashv1alpha1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSink = js.native
      
      var metadata: ObjectMeta = js.native
      
      /**
        * Spec defines the audit configuration spec
        */
      var spec: AuditSinkSpec = js.native
    }
    object AuditSink {
      
      @scala.inline
      def apply(
        apiVersion: auditregistrationDotk8sDotioSlashv1alpha1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSink,
        metadata: ObjectMeta,
        spec: AuditSinkSpec
      ): AuditSink = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSink]
      }
      
      @scala.inline
      implicit class AuditSinkMutableBuilder[Self <: AuditSink] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: auditregistrationDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSink): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: AuditSinkSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * AuditSinkSpec holds the spec for the audit sink
      */
    @js.native
    trait AuditSinkSpec extends StObject {
      
      /**
        * Policy defines the policy for selecting which events should be sent to the webhook required
        */
      var policy: Policy = js.native
      
      /**
        * Webhook to send events required
        */
      var webhook: Webhook = js.native
    }
    object AuditSinkSpec {
      
      @scala.inline
      def apply(policy: Policy, webhook: Webhook): AuditSinkSpec = {
        val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], webhook = webhook.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuditSinkSpec]
      }
      
      @scala.inline
      implicit class AuditSinkSpecMutableBuilder[Self <: AuditSinkSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Policy defines the configuration of how audit events are logged
      */
    @js.native
    trait Policy extends StObject {
      
      /**
        * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
        */
      var level: String = js.native
      
      /**
        * Stages is a list of stages for which events are created.
        */
      var stages: js.Array[String] = js.native
    }
    object Policy {
      
      @scala.inline
      def apply(level: String, stages: js.Array[String]): Policy = {
        val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], stages = stages.asInstanceOf[js.Any])
        __obj.asInstanceOf[Policy]
      }
      
      @scala.inline
      implicit class PolicyMutableBuilder[Self <: Policy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStages(value: js.Array[String]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStagesVarargs(value: String*): Self = StObject.set(x, "stages", js.Array(value :_*))
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    @js.native
    trait ServiceReference extends StObject {
      
      /**
        * `name` is the name of the service. Required
        */
      var name: String = js.native
      
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: String = js.native
      
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: String = js.native
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: Double = js.native
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
      * Webhook holds the configuration of the webhook
      */
    @js.native
    trait Webhook extends StObject {
      
      /**
        * ClientConfig holds the connection parameters for the webhook required
        */
      var clientConfig: WebhookClientConfig = js.native
      
      /**
        * Throttle holds the options for throttling the webhook
        */
      var throttle: WebhookThrottleConfig = js.native
    }
    object Webhook {
      
      @scala.inline
      def apply(clientConfig: WebhookClientConfig, throttle: WebhookThrottleConfig): Webhook = {
        val __obj = js.Dynamic.literal(clientConfig = clientConfig.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
        __obj.asInstanceOf[Webhook]
      }
      
      @scala.inline
      implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientConfig(value: WebhookClientConfig): Self = StObject.set(x, "clientConfig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottle(value: WebhookThrottleConfig): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * WebhookClientConfig contains the information to make a connection with the webhook
      */
    @js.native
    trait WebhookClientConfig extends StObject {
      
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: String = js.native
      
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: ServiceReference = js.native
      
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
      var url: String = js.native
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
    
    /**
      * WebhookThrottleConfig holds the configuration for throttling events
      */
    @js.native
    trait WebhookThrottleConfig extends StObject {
      
      /**
        * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
        */
      var burst: Double = js.native
      
      /**
        * ThrottleQPS maximum number of batches per second default 10 QPS
        */
      var qps: Double = js.native
    }
    object WebhookThrottleConfig {
      
      @scala.inline
      def apply(burst: Double, qps: Double): WebhookThrottleConfig = {
        val __obj = js.Dynamic.literal(burst = burst.asInstanceOf[js.Any], qps = qps.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebhookThrottleConfig]
      }
      
      @scala.inline
      implicit class WebhookThrottleConfigMutableBuilder[Self <: WebhookThrottleConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBurst(value: Double): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQps(value: Double): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
      }
    }
  }
}
