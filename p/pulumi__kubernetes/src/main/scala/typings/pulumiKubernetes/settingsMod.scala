package typings.pulumiKubernetes

import typings.pulumiKubernetes.podPresetListMod.PodPresetListArgs
import typings.pulumiKubernetes.podPresetMod.PodPresetArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  object v1alpha1 {
    
    @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPreset")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodPreset {
      
      @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPreset")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodPreset resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podPresetMod.PodPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podPresetMod.PodPreset]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podPresetMod.PodPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podPresetMod.PodPreset]
      
      /**
        * Returns true if the given object is an instance of PodPreset.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPreset.PodPreset */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetList")
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
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodPresetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodPresetList {
      
      @JSImport("@pulumi/kubernetes/settings", "v1alpha1.PodPresetList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodPresetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podPresetListMod.PodPresetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podPresetListMod.PodPresetList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podPresetListMod.PodPresetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podPresetListMod.PodPresetList]
      
      /**
        * Returns true if the given object is an instance of PodPresetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/settings/v1alpha1/podPresetList.PodPresetList */ Boolean]
    }
  }
}
