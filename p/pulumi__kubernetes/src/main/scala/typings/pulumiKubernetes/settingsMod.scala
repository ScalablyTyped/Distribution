package typings.pulumiKubernetes

import typings.pulumiKubernetes.podPresetListMod.PodPresetListArgs
import typings.pulumiKubernetes.podPresetMod.PodPresetArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/settings", JSImport.Namespace)
@js.native
object settingsMod extends js.Object {
  
  @js.native
  object v1alpha1 extends js.Object {
    
    @js.native
    class PodPreset protected ()
      extends typings.pulumiKubernetes.settingsV1alpha1Mod.PodPreset {
      /**
        * Create a PodPreset resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodPreset extends js.Object {
      
      /**
        * Get an existing PodPreset resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podPresetMod.PodPreset = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podPresetMod.PodPreset = js.native
      
      /**
        * Returns true if the given object is an instance of PodPreset.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean = js.native
    }
    
    @js.native
    class PodPresetList protected ()
      extends typings.pulumiKubernetes.settingsV1alpha1Mod.PodPresetList {
      /**
        * Create a PodPresetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodPresetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    @js.native
    object PodPresetList extends js.Object {
      
      /**
        * Get an existing PodPresetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podPresetListMod.PodPresetList = js.native
      
      /**
        * Returns true if the given object is an instance of PodPresetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean = js.native
    }
  }
}
