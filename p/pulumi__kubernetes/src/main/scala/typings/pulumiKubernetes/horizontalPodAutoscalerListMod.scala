package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.autoscaling.v1.HorizontalPodAutoscaler
import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalPodAutoscalerListMod {
  
  @JSImport("@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList", "HorizontalPodAutoscalerList")
  @js.native
  class HorizontalPodAutoscalerList protected () extends CustomResource {
    /**
      * Create a HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: HorizontalPodAutoscalerListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[autoscalingSlashv1] = js.native
    
    /**
      * list of horizontal pod autoscaler objects.
      */
    val items: Output_[js.Array[HorizontalPodAutoscaler]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList] = js.native
    
    /**
      * Standard list metadata.
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object HorizontalPodAutoscalerList {
    
    @JSImport("@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList", "HorizontalPodAutoscalerList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing HorizontalPodAutoscalerList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[HorizontalPodAutoscalerList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscalerList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HorizontalPodAutoscalerList]
    
    /**
      * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v1/horizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean]
  }
  
  trait HorizontalPodAutoscalerListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[autoscalingSlashv1]] = js.undefined
    
    /**
      * list of horizontal pod autoscaler objects.
      */
    val items: Input[
        js.Array[Input[typings.pulumiKubernetes.inputMod.autoscaling.v1.HorizontalPodAutoscaler]]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList]
      ] = js.undefined
    
    /**
      * Standard list metadata.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.undefined
  }
  object HorizontalPodAutoscalerListArgs {
    
    inline def apply(
      items: Input[
          js.Array[Input[typings.pulumiKubernetes.inputMod.autoscaling.v1.HorizontalPodAutoscaler]]
        ]
    ): HorizontalPodAutoscalerListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscalerListArgs]
    }
    
    extension [Self <: HorizontalPodAutoscalerListArgs](x: Self) {
      
      inline def setApiVersion(value: Input[autoscalingSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setItems(
        value: Input[
              js.Array[Input[typings.pulumiKubernetes.inputMod.autoscaling.v1.HorizontalPodAutoscaler]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Input[typings.pulumiKubernetes.inputMod.autoscaling.v1.HorizontalPodAutoscaler]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscalerList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
