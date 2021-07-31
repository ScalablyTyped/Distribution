package typings.pulumiKubernetes.inputMod

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiregistrationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiregistration {
  
  object v1 {
    
    /**
      * APIService represents a server for a particular GroupVersion. Name must be "version.group".
      */
    trait APIService extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[apiregistrationDotk8sDotioSlashv1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Spec contains information for locating and communicating with a server
        */
      var spec: js.UndefOr[Input[APIServiceSpec]] = js.undefined
      
      /**
        * Status contains derived information about an API server
        */
      var status: js.UndefOr[Input[APIServiceStatus]] = js.undefined
    }
    object APIService {
      
      @scala.inline
      def apply(): APIService = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[APIService]
      }
      
      @scala.inline
      implicit class APIServiceMutableBuilder[Self <: APIService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[apiregistrationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setSpec(value: Input[APIServiceSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        @scala.inline
        def setStatus(value: Input[APIServiceStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * APIServiceCondition describes the state of an APIService at a particular point
      */
    trait APIServiceCondition extends StObject {
      
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Status is the status of the condition. Can be True, False, Unknown.
        */
      var status: Input[String]
      
      /**
        * Type is the type of the condition.
        */
      var `type`: Input[String]
    }
    object APIServiceCondition {
      
      @scala.inline
      def apply(status: Input[String], `type`: Input[String]): APIServiceCondition = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[APIServiceCondition]
      }
      
      @scala.inline
      implicit class APIServiceConditionMutableBuilder[Self <: APIServiceCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
        
        @scala.inline
        def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        @scala.inline
        def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
      */
    trait APIServiceSpec extends StObject {
      
      /**
        * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Group is the API group name this server hosts
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
        */
      var groupPriorityMinimum: Input[Double]
      
      /**
        * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
        */
      var insecureSkipTLSVerify: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.undefined
      
      /**
        * Version is the API version this server hosts.  For example, "v1"
        */
      var version: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
        */
      var versionPriority: Input[Double]
    }
    object APIServiceSpec {
      
      @scala.inline
      def apply(groupPriorityMinimum: Input[Double], versionPriority: Input[Double]): APIServiceSpec = {
        val __obj = js.Dynamic.literal(groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
        __obj.asInstanceOf[APIServiceSpec]
      }
      
      @scala.inline
      implicit class APIServiceSpecMutableBuilder[Self <: APIServiceSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaBundle(value: Input[String]): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaBundleUndefined: Self = StObject.set(x, "caBundle", js.undefined)
        
        @scala.inline
        def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupPriorityMinimum(value: Input[Double]): Self = StObject.set(x, "groupPriorityMinimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setInsecureSkipTLSVerify(value: Input[Boolean]): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsecureSkipTLSVerifyUndefined: Self = StObject.set(x, "insecureSkipTLSVerify", js.undefined)
        
        @scala.inline
        def setService(value: Input[ServiceReference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
        
        @scala.inline
        def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionPriority(value: Input[Double]): Self = StObject.set(x, "versionPriority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * APIServiceStatus contains derived information about an API server
      */
    trait APIServiceStatus extends StObject {
      
      /**
        * Current service state of apiService.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[APIServiceCondition]]]] = js.undefined
    }
    object APIServiceStatus {
      
      @scala.inline
      def apply(): APIServiceStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[APIServiceStatus]
      }
      
      @scala.inline
      implicit class APIServiceStatusMutableBuilder[Self <: APIServiceStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConditions(value: Input[js.Array[Input[APIServiceCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
        
        @scala.inline
        def setConditionsVarargs(value: Input[APIServiceCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends StObject {
      
      /**
        * Name is the name of the service
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Namespace is the namespace of the service
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    object ServiceReference {
      
      @scala.inline
      def apply(): ServiceReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServiceReference]
      }
      
      @scala.inline
      implicit class ServiceReferenceMutableBuilder[Self <: ServiceReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        @scala.inline
        def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * APIService represents a server for a particular GroupVersion. Name must be "version.group".
      */
    trait APIService extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[apiregistrationDotk8sDotioSlashv1beta1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Spec contains information for locating and communicating with a server
        */
      var spec: js.UndefOr[Input[APIServiceSpec]] = js.undefined
      
      /**
        * Status contains derived information about an API server
        */
      var status: js.UndefOr[Input[APIServiceStatus]] = js.undefined
    }
    object APIService {
      
      @scala.inline
      def apply(): APIService = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[APIService]
      }
      
      @scala.inline
      implicit class APIServiceMutableBuilder[Self <: APIService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[apiregistrationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.APIService]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setSpec(value: Input[APIServiceSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        @scala.inline
        def setStatus(value: Input[APIServiceStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * APIServiceCondition describes the state of an APIService at a particular point
      */
    trait APIServiceCondition extends StObject {
      
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Status is the status of the condition. Can be True, False, Unknown.
        */
      var status: Input[String]
      
      /**
        * Type is the type of the condition.
        */
      var `type`: Input[String]
    }
    object APIServiceCondition {
      
      @scala.inline
      def apply(status: Input[String], `type`: Input[String]): APIServiceCondition = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[APIServiceCondition]
      }
      
      @scala.inline
      implicit class APIServiceConditionMutableBuilder[Self <: APIServiceCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
        
        @scala.inline
        def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        @scala.inline
        def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
      */
    trait APIServiceSpec extends StObject {
      
      /**
        * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Group is the API group name this server hosts
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
        */
      var groupPriorityMinimum: Input[Double]
      
      /**
        * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
        */
      var insecureSkipTLSVerify: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Service is a reference to the service for this API server.  It must communicate on port 443. If the Service is nil, that means the handling for the API groupversion is handled locally on this server. The call will simply delegate to the normal handler chain to be fulfilled.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.undefined
      
      /**
        * Version is the API version this server hosts.  For example, "v1"
        */
      var version: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it's inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
        */
      var versionPriority: Input[Double]
    }
    object APIServiceSpec {
      
      @scala.inline
      def apply(groupPriorityMinimum: Input[Double], versionPriority: Input[Double]): APIServiceSpec = {
        val __obj = js.Dynamic.literal(groupPriorityMinimum = groupPriorityMinimum.asInstanceOf[js.Any], versionPriority = versionPriority.asInstanceOf[js.Any])
        __obj.asInstanceOf[APIServiceSpec]
      }
      
      @scala.inline
      implicit class APIServiceSpecMutableBuilder[Self <: APIServiceSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCaBundle(value: Input[String]): Self = StObject.set(x, "caBundle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaBundleUndefined: Self = StObject.set(x, "caBundle", js.undefined)
        
        @scala.inline
        def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupPriorityMinimum(value: Input[Double]): Self = StObject.set(x, "groupPriorityMinimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setInsecureSkipTLSVerify(value: Input[Boolean]): Self = StObject.set(x, "insecureSkipTLSVerify", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsecureSkipTLSVerifyUndefined: Self = StObject.set(x, "insecureSkipTLSVerify", js.undefined)
        
        @scala.inline
        def setService(value: Input[ServiceReference]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
        
        @scala.inline
        def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionPriority(value: Input[Double]): Self = StObject.set(x, "versionPriority", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * APIServiceStatus contains derived information about an API server
      */
    trait APIServiceStatus extends StObject {
      
      /**
        * Current service state of apiService.
        */
      var conditions: js.UndefOr[Input[js.Array[Input[APIServiceCondition]]]] = js.undefined
    }
    object APIServiceStatus {
      
      @scala.inline
      def apply(): APIServiceStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[APIServiceStatus]
      }
      
      @scala.inline
      implicit class APIServiceStatusMutableBuilder[Self <: APIServiceStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConditions(value: Input[js.Array[Input[APIServiceCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
        
        @scala.inline
        def setConditionsVarargs(value: Input[APIServiceCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
      }
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends StObject {
      
      /**
        * Name is the name of the service
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Namespace is the namespace of the service
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    object ServiceReference {
      
      @scala.inline
      def apply(): ServiceReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ServiceReference]
      }
      
      @scala.inline
      implicit class ServiceReferenceMutableBuilder[Self <: ServiceReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        @scala.inline
        def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      }
    }
  }
}
