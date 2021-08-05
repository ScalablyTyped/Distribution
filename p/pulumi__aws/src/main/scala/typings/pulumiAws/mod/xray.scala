package typings.pulumiAws.mod

import typings.pulumiAws.encryptionConfigMod.EncryptionConfigArgs
import typings.pulumiAws.encryptionConfigMod.EncryptionConfigState
import typings.pulumiAws.samplingRuleMod.SamplingRuleArgs
import typings.pulumiAws.samplingRuleMod.SamplingRuleState
import typings.pulumiAws.xrayGroupMod.GroupArgs
import typings.pulumiAws.xrayGroupMod.GroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xray {
  
  @JSImport("@pulumi/aws", "xray.EncryptionConfig")
  @js.native
  class EncryptionConfig protected ()
    extends typings.pulumiAws.xrayMod.EncryptionConfig {
    /**
      * Create a EncryptionConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EncryptionConfigArgs) = this()
    def this(name: String, args: EncryptionConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EncryptionConfig {
    
    @JSImport("@pulumi/aws", "xray.EncryptionConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EncryptionConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.encryptionConfigMod.EncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionConfigMod.EncryptionConfig]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.encryptionConfigMod.EncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionConfigMod.EncryptionConfig]
    inline def get(name: String, id: Input[ID], state: EncryptionConfigState): typings.pulumiAws.encryptionConfigMod.EncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionConfigMod.EncryptionConfig]
    inline def get(name: String, id: Input[ID], state: EncryptionConfigState, opts: CustomResourceOptions): typings.pulumiAws.encryptionConfigMod.EncryptionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.encryptionConfigMod.EncryptionConfig]
    
    /**
      * Returns true if the given object is an instance of EncryptionConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/encryptionConfig.EncryptionConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/xray/encryptionConfig.EncryptionConfig */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "xray.Group")
  @js.native
  class Group protected ()
    extends typings.pulumiAws.xrayMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Group {
    
    @JSImport("@pulumi/aws", "xray.Group")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.xrayGroupMod.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.xrayGroupMod.Group]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.xrayGroupMod.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.xrayGroupMod.Group]
    inline def get(name: String, id: Input[ID], state: GroupState): typings.pulumiAws.xrayGroupMod.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.xrayGroupMod.Group]
    inline def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typings.pulumiAws.xrayGroupMod.Group = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.xrayGroupMod.Group]
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/group.Group */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/xray/group.Group */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "xray.SamplingRule")
  @js.native
  class SamplingRule protected ()
    extends typings.pulumiAws.xrayMod.SamplingRule {
    /**
      * Create a SamplingRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SamplingRuleArgs) = this()
    def this(name: String, args: SamplingRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SamplingRule {
    
    @JSImport("@pulumi/aws", "xray.SamplingRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SamplingRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.samplingRuleMod.SamplingRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.samplingRuleMod.SamplingRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.samplingRuleMod.SamplingRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.samplingRuleMod.SamplingRule]
    inline def get(name: String, id: Input[ID], state: SamplingRuleState): typings.pulumiAws.samplingRuleMod.SamplingRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.samplingRuleMod.SamplingRule]
    inline def get(name: String, id: Input[ID], state: SamplingRuleState, opts: CustomResourceOptions): typings.pulumiAws.samplingRuleMod.SamplingRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.samplingRuleMod.SamplingRule]
    
    /**
      * Returns true if the given object is an instance of SamplingRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean]
  }
}
