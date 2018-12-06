package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "auditregistration")
@js.native
object auditregistrationNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
             * AuditSink represents a cluster level audit sink
             */
    
    trait AuditSink extends js.Object {
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
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec defines the audit configuration spec
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AuditSinkSpec]] = js.undefined
    }
    
    /**
             * AuditSinkList is a list of AuditSink items.
             */
    
    trait AuditSinkList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * List of audit configurations.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[AuditSink]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * AuditSinkSpec holds the spec for the audit sink
             */
    
    trait AuditSinkSpec extends js.Object {
      /**
                   * Policy defines the policy for selecting which events should be sent to the webhook required
                   */
      var policy: atPulumiPulumiLib.resourceMod.Input[Policy]
      /**
                   * Webhook to send events required
                   */
      var webhook: atPulumiPulumiLib.resourceMod.Input[Webhook]
    }
    
    /**
             * Policy defines the configuration of how audit events are logged
             */
    
    trait Policy extends js.Object {
      /**
                   * The Level that all requests are recorded at. available options: None, Metadata, Request,
                   * RequestResponse required
                   */
      var level: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Stages is a list of stages for which events are created.
                   */
      var stages: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
             * Webhook holds the configuration of the webhook
             */
    
    trait Webhook extends js.Object {
      /**
                   * ClientConfig holds the connection parameters for the webhook required
                   */
      var clientConfig: atPulumiPulumiLib.resourceMod.Input[WebhookClientConfig]
      /**
                   * Throttle holds the options for throttling the webhook
                   */
      var throttle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[WebhookThrottleConfig]] = js.undefined
    }
    
    /**
             * WebhookClientConfig contains the information to make a connection with the webhook
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
    
    /**
             * WebhookThrottleConfig holds the configuration for throttling events
             */
    
    trait WebhookThrottleConfig extends js.Object {
      /**
                   * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS
                   */
      var burst: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * ThrottleQPS maximum number of batches per second default 10 QPS
                   */
      var qps: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    def isAuditSink(o: js.Any): /* is AuditSink */scala.Boolean = js.native
    def isAuditSinkList(o: js.Any): /* is AuditSinkList */scala.Boolean = js.native
  }
  
}

