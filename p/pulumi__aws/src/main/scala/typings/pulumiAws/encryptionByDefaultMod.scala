package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encryptionByDefaultMod {
  
  @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault")
  @js.native
  class EncryptionByDefault protected () extends CustomResource {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object EncryptionByDefault {
    
    @JSImport("@pulumi/aws/ebs/encryptionByDefault", "EncryptionByDefault")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EncryptionByDefault]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EncryptionByDefault]
    inline def get(name: String, id: Input[ID], state: EncryptionByDefaultState): EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EncryptionByDefault]
    inline def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): EncryptionByDefault = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EncryptionByDefault]
    
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean]
  }
  
  trait EncryptionByDefaultArgs extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EncryptionByDefaultArgs {
    
    inline def apply(): EncryptionByDefaultArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionByDefaultArgs]
    }
    
    extension [Self <: EncryptionByDefaultArgs](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait EncryptionByDefaultState extends StObject {
    
    /**
      * Whether or not default EBS encryption is enabled. Valid values are `true` or `false`. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object EncryptionByDefaultState {
    
    inline def apply(): EncryptionByDefaultState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncryptionByDefaultState]
    }
    
    extension [Self <: EncryptionByDefaultState](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
