package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.apps.v1beta1.StatefulSetSpec
import typings.pulumiKubernetes.outputMod.apps.v1beta1.StatefulSetStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulSetMod {
  
  @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet")
  @js.native
  class StatefulSet protected () extends CustomResource {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated apps/v1beta1/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[appsSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Spec defines the desired identities of pods in this set.
      */
    val spec: Output_[StatefulSetSpec] = js.native
    
    /**
      * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
      */
    val status: Output_[StatefulSetStatus] = js.native
  }
  /* static members */
  object StatefulSet {
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID]): StatefulSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): StatefulSet = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1beta1/statefulSet", "StatefulSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta1/statefulSet.StatefulSet */ Boolean = js.native
  }
  
  @js.native
  trait StatefulSetArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet]] = js.native
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Spec defines the desired identities of pods in this set.
      */
    val spec: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSetSpec]] = js.native
  }
  object StatefulSetArgs {
    
    @scala.inline
    def apply(): StatefulSetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulSetArgs]
    }
    
    @scala.inline
    implicit class StatefulSetArgsMutableBuilder[Self <: StatefulSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[appsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(value: Input[typings.pulumiKubernetes.inputMod.apps.v1beta1.StatefulSetSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    }
  }
}
