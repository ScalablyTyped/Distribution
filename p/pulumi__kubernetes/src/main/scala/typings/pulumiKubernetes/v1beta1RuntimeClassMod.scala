package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.node.v1beta1.Overhead
import typings.pulumiKubernetes.outputMod.node.v1beta1.Scheduling
import typings.pulumiKubernetes.pulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1RuntimeClassMod {
  
  @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClass", "RuntimeClass")
  @js.native
  class RuntimeClass protected () extends CustomResource {
    /**
      * Create a RuntimeClass resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RuntimeClassArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RuntimeClassArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[nodeDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
      */
    val handler: Output_[String] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass] = js.native
    
    /**
      * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
      */
    val overhead: Output_[Overhead] = js.native
    
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
      */
    val scheduling: Output_[Scheduling] = js.native
  }
  /* static members */
  object RuntimeClass {
    
    /**
      * Get an existing RuntimeClass resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClass", "RuntimeClass.get")
    @js.native
    def get(name: String, id: Input[ID]): RuntimeClass = js.native
    @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClass", "RuntimeClass.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): RuntimeClass = js.native
    
    /**
      * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/node/v1beta1/runtimeClass", "RuntimeClass.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/runtimeClass.RuntimeClass */ Boolean = js.native
  }
  
  @js.native
  trait RuntimeClassArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.native
    
    /**
      * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and is immutable.
      */
    val handler: Input[String] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RuntimeClass]] = js.native
    
    /**
      * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the PodOverhead feature.
      */
    val overhead: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.node.v1beta1.Overhead]] = js.native
    
    /**
      * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
      */
    val scheduling: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.node.v1beta1.Scheduling]] = js.native
  }
  object RuntimeClassArgs {
    
    @scala.inline
    def apply(handler: Input[String]): RuntimeClassArgs = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeClassArgs]
    }
    
    @scala.inline
    implicit class RuntimeClassArgsMutableBuilder[Self <: RuntimeClassArgs] (val x: Self) extends AnyVal {
      
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
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOverhead(value: Input[typings.pulumiKubernetes.inputMod.node.v1beta1.Overhead]): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
      
      @scala.inline
      def setScheduling(value: Input[typings.pulumiKubernetes.inputMod.node.v1beta1.Scheduling]): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    }
  }
}
