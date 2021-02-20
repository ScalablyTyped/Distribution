package typings.pulumiKubernetes.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.inputMod.core.v1.Toleration
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1alpha1
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
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
      var podFixed: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    }
    object Overhead {
      
      @scala.inline
      def apply(): Overhead = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Overhead]
      }
      
      @scala.inline
      implicit class OverheadMutableBuilder[Self <: Overhead] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPodFixed(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPodFixedUndefined: Self = StObject.set(x, "podFixed", js.undefined)
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
      var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1alpha1]] = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]] = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
      
      /**
        * Specification of the RuntimeClass More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: Input[RuntimeClassSpec] = js.native
    }
    object RuntimeClass {
      
      @scala.inline
      def apply(spec: Input[RuntimeClassSpec]): RuntimeClass = {
        val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClass]
      }
      
      @scala.inline
      implicit class RuntimeClassMutableBuilder[Self <: RuntimeClass] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[nodeDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setSpec(value: Input[RuntimeClassSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
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
      var overhead: js.UndefOr[Input[Overhead]] = js.native
      
      /**
        * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
        */
      var runtimeHandler: Input[String] = js.native
      
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: js.UndefOr[Input[Scheduling]] = js.native
    }
    object RuntimeClassSpec {
      
      @scala.inline
      def apply(runtimeHandler: Input[String]): RuntimeClassSpec = {
        val __obj = js.Dynamic.literal(runtimeHandler = runtimeHandler.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClassSpec]
      }
      
      @scala.inline
      implicit class RuntimeClassSpecMutableBuilder[Self <: RuntimeClassSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOverhead(value: Input[Overhead]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
        
        @scala.inline
        def setRuntimeHandler(value: Input[String]): Self = StObject.set(x, "runtimeHandler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduling(value: Input[Scheduling]): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
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
      var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
      
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
        */
      var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.native
    }
    object Scheduling {
      
      @scala.inline
      def apply(): Scheduling = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scheduling]
      }
      
      @scala.inline
      implicit class SchedulingMutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
        
        @scala.inline
        def setTolerations(value: Input[js.Array[Input[Toleration]]]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerationsUndefined: Self = StObject.set(x, "tolerations", js.undefined)
        
        @scala.inline
        def setTolerationsVarargs(value: Input[Toleration]*): Self = StObject.set(x, "tolerations", js.Array(value :_*))
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
      var podFixed: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    }
    object Overhead {
      
      @scala.inline
      def apply(): Overhead = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Overhead]
      }
      
      @scala.inline
      implicit class OverheadMutableBuilder[Self <: Overhead] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPodFixed(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "podFixed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPodFixedUndefined: Self = StObject.set(x, "podFixed", js.undefined)
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
      var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.native
      
      /**
        * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
        */
      var handler: Input[String] = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]] = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
      
      /**
        * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
        */
      var overhead: js.UndefOr[Input[Overhead]] = js.native
      
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: js.UndefOr[Input[Scheduling]] = js.native
    }
    object RuntimeClass {
      
      @scala.inline
      def apply(handler: Input[String]): RuntimeClass = {
        val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
        __obj.asInstanceOf[RuntimeClass]
      }
      
      @scala.inline
      implicit class RuntimeClassMutableBuilder[Self <: RuntimeClass] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: Input[nodeDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        @scala.inline
        def setHandler(value: Input[String]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        @scala.inline
        def setOverhead(value: Input[Overhead]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
        
        @scala.inline
        def setScheduling(value: Input[Scheduling]): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
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
      var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
      
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
        */
      var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.native
    }
    object Scheduling {
      
      @scala.inline
      def apply(): Scheduling = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scheduling]
      }
      
      @scala.inline
      implicit class SchedulingMutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNodeSelector(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeSelectorUndefined: Self = StObject.set(x, "nodeSelector", js.undefined)
        
        @scala.inline
        def setTolerations(value: Input[js.Array[Input[Toleration]]]): Self = StObject.set(x, "tolerations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTolerationsUndefined: Self = StObject.set(x, "tolerations", js.undefined)
        
        @scala.inline
        def setTolerationsVarargs(value: Input[Toleration]*): Self = StObject.set(x, "tolerations", js.Array(value :_*))
      }
    }
  }
}
