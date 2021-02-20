package typings.pulumiKubernetes.outputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.outputMod.core.v1.Toleration
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1alpha1
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object node {
  
  object v1alpha1 {
    
    /**
      * Overhead structure represents the resource overhead associated with running a pod.
      */
    @js.native
    trait Overhead extends StObject {
      
      /**
        * PodFixed represents the fixed resource overhead associated with running a pod.
        */
      var podFixed: StringDictionary[String] = js.native
    }
    object Overhead {
      
      @scala.inline
      def apply(podFixed: StringDictionary[String]): Overhead = {
        val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[Overhead]
      }
      
      @scala.inline
      implicit class OverheadMutableBuilder[Self <: Overhead] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPodFixed(value: StringDictionary[String]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
      */
    @js.native
    trait RuntimeClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: nodeDotk8sDotioSlashv1alpha1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the RuntimeClass More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: RuntimeClassSpec = js.native
    }
    object RuntimeClass {
      
      @scala.inline
      def apply(
        apiVersion: nodeDotk8sDotioSlashv1alpha1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass,
        metadata: ObjectMeta,
        spec: RuntimeClassSpec
      ): RuntimeClass = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClass]
      }
      
      @scala.inline
      implicit class RuntimeClassMutableBuilder[Self <: RuntimeClass] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: nodeDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: RuntimeClassSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
      */
    @js.native
    trait RuntimeClassSpec extends StObject {
      
      /**
        * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
        */
      var overhead: Overhead = js.native
      
      /**
        * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
        */
      var runtimeHandler: String = js.native
      
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: Scheduling = js.native
    }
    object RuntimeClassSpec {
      
      @scala.inline
      def apply(overhead: Overhead, runtimeHandler: String, scheduling: Scheduling): RuntimeClassSpec = {
        val __obj = js.Dynamic.literal(overhead = overhead.asInstanceOf[js.Any], runtimeHandler = runtimeHandler.asInstanceOf[js.Any], scheduling = scheduling.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClassSpec]
      }
      
      @scala.inline
      implicit class RuntimeClassSpecMutableBuilder[Self <: RuntimeClassSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOverhead(value: Overhead): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuntimeHandler(value: String): Self = StObject.set(x, "runtimeHandler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
      */
    @js.native
    trait Scheduling extends StObject {
      
      /**
        * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
        */
      var nodeSelector: StringDictionary[String] = js.native
      
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
        */
      var tolerations: js.Array[Toleration] = js.native
    }
    object Scheduling {
      
      @scala.inline
      def apply(nodeSelector: StringDictionary[String], tolerations: js.Array[Toleration]): Scheduling = {
        val __obj = js.Dynamic.literal(nodeSelector = nodeSelector.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scheduling]
      }
      
      @scala.inline
      implicit class SchedulingMutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerations(value: js.Array[Toleration]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerationsVarargs(value: Toleration*): Self = StObject.set(x, "tolerations", js.Array(value :_*))
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Overhead structure represents the resource overhead associated with running a pod.
      */
    @js.native
    trait Overhead extends StObject {
      
      /**
        * PodFixed represents the fixed resource overhead associated with running a pod.
        */
      var podFixed: StringDictionary[String] = js.native
    }
    object Overhead {
      
      @scala.inline
      def apply(podFixed: StringDictionary[String]): Overhead = {
        val __obj = js.Dynamic.literal(podFixed = podFixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[Overhead]
      }
      
      @scala.inline
      implicit class OverheadMutableBuilder[Self <: Overhead] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPodFixed(value: StringDictionary[String]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
      */
    @js.native
    trait RuntimeClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: nodeDotk8sDotioSlashv1beta1 = js.native
      
      /**
        * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
        */
      var handler: String = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
        */
      var overhead: Overhead = js.native
      
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: Scheduling = js.native
    }
    object RuntimeClass {
      
      @scala.inline
      def apply(
        apiVersion: nodeDotk8sDotioSlashv1beta1,
        handler: String,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass,
        metadata: ObjectMeta,
        overhead: Overhead,
        scheduling: Scheduling
      ): RuntimeClass = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], overhead = overhead.asInstanceOf[js.Any], scheduling = scheduling.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClass]
      }
      
      @scala.inline
      implicit class RuntimeClassMutableBuilder[Self <: RuntimeClass] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: nodeDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverhead(value: Overhead): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
      */
    @js.native
    trait Scheduling extends StObject {
      
      /**
        * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
        */
      var nodeSelector: StringDictionary[String] = js.native
      
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
        */
      var tolerations: js.Array[Toleration] = js.native
    }
    object Scheduling {
      
      @scala.inline
      def apply(nodeSelector: StringDictionary[String], tolerations: js.Array[Toleration]): Scheduling = {
        val __obj = js.Dynamic.literal(nodeSelector = nodeSelector.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any])
        __obj.asInstanceOf[Scheduling]
      }
      
      @scala.inline
      implicit class SchedulingMutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodeSelector(value: StringDictionary[String]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerations(value: js.Array[Toleration]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerationsVarargs(value: Toleration*): Self = StObject.set(x, "tolerations", js.Array(value :_*))
      }
    }
  }
}
