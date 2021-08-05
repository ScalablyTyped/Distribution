package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleAliasMod {
  
  @JSImport("@pulumi/aws/iot/roleAlias", "RoleAlias")
  @js.native
  class RoleAlias protected () extends CustomResource {
    /**
      * Create a RoleAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAliasArgs) = this()
    def this(name: String, args: RoleAliasArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the role alias.
      */
    val alias: Output_[String] = js.native
    
    /**
      * The ARN assigned by AWS to this role alias.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
      */
    val credentialDuration: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The identity of the role to which the alias refers.
      */
    val roleArn: Output_[String] = js.native
  }
  /* static members */
  object RoleAlias {
    
    @JSImport("@pulumi/aws/iot/roleAlias", "RoleAlias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RoleAlias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RoleAlias]
    inline def get(name: String, id: Input[ID], state: RoleAliasState): RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RoleAlias]
    inline def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): RoleAlias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RoleAlias]
    
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean]
  }
  
  trait RoleAliasArgs extends StObject {
    
    /**
      * The name of the role alias.
      */
    val alias: Input[String]
    
    /**
      * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
      */
    val credentialDuration: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The identity of the role to which the alias refers.
      */
    val roleArn: Input[String]
  }
  object RoleAliasArgs {
    
    inline def apply(alias: Input[String], roleArn: Input[String]): RoleAliasArgs = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleAliasArgs]
    }
    
    extension [Self <: RoleAliasArgs](x: Self) {
      
      inline def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setCredentialDuration(value: Input[Double]): Self = StObject.set(x, "credentialDuration", value.asInstanceOf[js.Any])
      
      inline def setCredentialDurationUndefined: Self = StObject.set(x, "credentialDuration", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoleAliasState extends StObject {
    
    /**
      * The name of the role alias.
      */
    val alias: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN assigned by AWS to this role alias.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The duration of the credential, in seconds. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 900 seconds (15 minutes) to 3600 seconds (60 minutes).
      */
    val credentialDuration: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The identity of the role to which the alias refers.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object RoleAliasState {
    
    inline def apply(): RoleAliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleAliasState]
    }
    
    extension [Self <: RoleAliasState](x: Self) {
      
      inline def setAlias(value: Input[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCredentialDuration(value: Input[Double]): Self = StObject.set(x, "credentialDuration", value.asInstanceOf[js.Any])
      
      inline def setCredentialDurationUndefined: Self = StObject.set(x, "credentialDuration", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    }
  }
}
