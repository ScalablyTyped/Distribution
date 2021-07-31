package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.extensions.v1beta1.DaemonSetSpec
import typings.pulumiKubernetes.outputMod.extensions.v1beta1.DaemonSetStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1DaemonSetMod {
  
  @JSImport("@pulumi/kubernetes/extensions/v1beta1/daemonSet", "DaemonSet")
  @js.native
  class DaemonSet protected () extends CustomResource {
    /**
      * Create a DaemonSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated extensions/v1beta1/DaemonSet is deprecated by apps/v1/DaemonSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: DaemonSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DaemonSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[extensionsSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.DaemonSet] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output_[DaemonSetSpec] = js.native
    
    /**
      * The current status of this daemon set. This data may be out of date by some window of time. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output_[DaemonSetStatus] = js.native
  }
  /* static members */
  object DaemonSet {
    
    @JSImport("@pulumi/kubernetes/extensions/v1beta1/daemonSet", "DaemonSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DaemonSet]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DaemonSet]
    
    /**
      * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/daemonSet.DaemonSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/daemonSet.DaemonSet */ Boolean]
  }
  
  trait DaemonSetArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[extensionsSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.DaemonSet]] = js.undefined
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * The desired behavior of this daemon set. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.extensions.v1beta1.DaemonSetSpec]] = js.undefined
  }
  object DaemonSetArgs {
    
    @scala.inline
    def apply(): DaemonSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DaemonSetArgs]
    }
    
    @scala.inline
    implicit class DaemonSetArgsMutableBuilder[Self <: DaemonSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[extensionsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.DaemonSet]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiKubernetes.inputMod.extensions.v1beta1.DaemonSetSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
