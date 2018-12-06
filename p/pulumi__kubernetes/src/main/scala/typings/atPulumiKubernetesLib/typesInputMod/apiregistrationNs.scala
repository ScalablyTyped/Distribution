package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "apiregistration")
@js.native
object apiregistrationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
             * APIService represents a server for a particular GroupVersion. Name must be "version.group".
             */
    
    trait APIService extends js.Object {
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
                   * Spec contains information for locating and communicating with a server
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[APIServiceSpec]] = js.undefined
      /**
                   * Status contains derived information about an API server
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[APIServiceStatus]] = js.undefined
    }
    
    
    trait APIServiceCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Human-readable message indicating details about last transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Unique, one-word, CamelCase reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status is the status of the condition. Can be True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type is the type of the condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * APIServiceList is a list of APIService objects.
             */
    
    trait APIServiceList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[APIService]]
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
             * APIServiceSpec contains information for locating and communicating with a server. Only https
             * is supported, though you are able to disable certificate verification.
             */
    
    trait APIServiceSpec extends js.Object {
      /**
                   * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving
                   * certificate. If unspecified, system trust roots on the apiserver are used.
                   */
      var caBundle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Group is the API group name this server hosts
                   */
      var group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * GroupPriorityMininum is the priority this group should have at least. Higher priority means
                   * that the group is preferred by clients over lower priority ones. Note that other versions
                   * of this group might specify even higher GroupPriorityMininum values such that the whole
                   * group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered
                   * highest number to lowest (20 before 10). The secondary sort is based on the alphabetical
                   * comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something
                   * like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to
                   * be in the 2000s
                   */
      var groupPriorityMinimum: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this
                   * server. This is strongly discouraged.  You should use the CABundle instead.
                   */
      var insecureSkipTLSVerify: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Service is a reference to the service for this API server.  It must communicate on port 443
                   * If the Service is nil, that means the handling for the API groupversion is handled locally
                   * on this server. The call will simply delegate to the normal handler chain to be fulfilled.
                   */
      var service: atPulumiPulumiLib.resourceMod.Input[ServiceReference]
      /**
                   * Version is the API version this server hosts.  For example, "v1"
                   */
      var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VersionPriority controls the ordering of this API version inside of its group.  Must be
                   * greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest
                   * (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s.
                   * In case of equal version priorities, the version string will be used to compute the order
                   * inside a group. If the version string is "kube-like", it will sort above non "kube-like"
                   * version strings, which are ordered lexicographically. "Kube-like" versions start with a
                   * "v", then are followed by a number (the major version), then optionally the string "alpha"
                   * or "beta" and another number (the minor version). These are sorted first by GA > beta >
                   * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing
                   * major version, then minor version. An example sorted list of versions: v10, v2, v1,
                   * v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
                   */
      var versionPriority: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * APIServiceStatus contains derived information about an API server
             */
    
    trait APIServiceStatus extends js.Object {
      /**
                   * Current service state of apiService.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[APIServiceCondition]]] = js.undefined
    }
    
    /**
             * ServiceReference holds a reference to Service.legacy.k8s.io
             */
    
    trait ServiceReference extends js.Object {
      /**
                   * Name is the name of the service
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Namespace is the namespace of the service
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isAPIService(o: js.Any): /* is APIService */scala.Boolean = js.native
    def isAPIServiceList(o: js.Any): /* is APIServiceList */scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * APIService represents a server for a particular GroupVersion. Name must be "version.group".
             */
    
    trait APIService extends js.Object {
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
                   * Spec contains information for locating and communicating with a server
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[APIServiceSpec]] = js.undefined
      /**
                   * Status contains derived information about an API server
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[APIServiceStatus]] = js.undefined
    }
    
    
    trait APIServiceCondition extends js.Object {
      /**
                   * Last time the condition transitioned from one status to another.
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Human-readable message indicating details about last transition.
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Unique, one-word, CamelCase reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Status is the status of the condition. Can be True, False, Unknown.
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Type is the type of the condition.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * APIServiceList is a list of APIService objects.
             */
    
    trait APIServiceList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[APIService]]
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
             * APIServiceSpec contains information for locating and communicating with a server. Only https
             * is supported, though you are able to disable certificate verification.
             */
    
    trait APIServiceSpec extends js.Object {
      /**
                   * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving
                   * certificate. If unspecified, system trust roots on the apiserver are used.
                   */
      var caBundle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Group is the API group name this server hosts
                   */
      var group: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * GroupPriorityMininum is the priority this group should have at least. Higher priority means
                   * that the group is preferred by clients over lower priority ones. Note that other versions
                   * of this group might specify even higher GroupPriorityMininum values such that the whole
                   * group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered
                   * highest number to lowest (20 before 10). The secondary sort is based on the alphabetical
                   * comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something
                   * like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to
                   * be in the 2000s
                   */
      var groupPriorityMinimum: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this
                   * server. This is strongly discouraged.  You should use the CABundle instead.
                   */
      var insecureSkipTLSVerify: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Service is a reference to the service for this API server.  It must communicate on port 443
                   * If the Service is nil, that means the handling for the API groupversion is handled locally
                   * on this server. The call will simply delegate to the normal handler chain to be fulfilled.
                   */
      var service: atPulumiPulumiLib.resourceMod.Input[ServiceReference]
      /**
                   * Version is the API version this server hosts.  For example, "v1"
                   */
      var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * VersionPriority controls the ordering of this API version inside of its group.  Must be
                   * greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest
                   * (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s.
                   * In case of equal version priorities, the version string will be used to compute the order
                   * inside a group. If the version string is "kube-like", it will sort above non "kube-like"
                   * version strings, which are ordered lexicographically. "Kube-like" versions start with a
                   * "v", then are followed by a number (the major version), then optionally the string "alpha"
                   * or "beta" and another number (the minor version). These are sorted first by GA > beta >
                   * alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing
                   * major version, then minor version. An example sorted list of versions: v10, v2, v1,
                   * v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
                   */
      var versionPriority: atPulumiPulumiLib.resourceMod.Input[scala.Double]
    }
    
    /**
             * APIServiceStatus contains derived information about an API server
             */
    
    trait APIServiceStatus extends js.Object {
      /**
                   * Current service state of apiService.
                   */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[APIServiceCondition]]] = js.undefined
    }
    
    /**
             * ServiceReference holds a reference to Service.legacy.k8s.io
             */
    
    trait ServiceReference extends js.Object {
      /**
                   * Name is the name of the service
                   */
      var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Namespace is the namespace of the service
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isAPIService(o: js.Any): /* is APIService */scala.Boolean = js.native
    def isAPIServiceList(o: js.Any): /* is APIServiceList */scala.Boolean = js.native
  }
  
}

