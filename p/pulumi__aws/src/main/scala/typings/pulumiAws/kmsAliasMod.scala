package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmsAliasMod {
  
  @JSImport("@pulumi/aws/kms/alias", "Alias")
  @js.native
  class Alias protected () extends CustomResource {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the key alias.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates an unique alias beginning with the specified prefix.
      * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the target key identifier.
      */
    val targetKeyArn: Output_[String] = js.native
    
    /**
      * Identifier for the key for which the alias is for, can be either an ARN or key_id.
      */
    val targetKeyId: Output_[String] = js.native
  }
  /* static members */
  object Alias {
    
    @JSImport("@pulumi/aws/kms/alias", "Alias")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Alias]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Alias]
    inline def get(name: String, id: Input[ID], state: AliasState): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Alias]
    inline def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Alias]
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean]
  }
  
  trait AliasArgs extends StObject {
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates an unique alias beginning with the specified prefix.
      * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier for the key for which the alias is for, can be either an ARN or key_id.
      */
    val targetKeyId: Input[String]
  }
  object AliasArgs {
    
    inline def apply(targetKeyId: Input[String]): AliasArgs = {
      val __obj = js.Dynamic.literal(targetKeyId = targetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasArgs]
    }
    
    extension [Self <: AliasArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetKeyId(value: Input[String]): Self = StObject.set(x, "targetKeyId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AliasState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the key alias.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates an unique alias beginning with the specified prefix.
      * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the target key identifier.
      */
    val targetKeyArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier for the key for which the alias is for, can be either an ARN or key_id.
      */
    val targetKeyId: js.UndefOr[Input[String]] = js.undefined
  }
  object AliasState {
    
    inline def apply(): AliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasState]
    }
    
    extension [Self <: AliasState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetKeyArn(value: Input[String]): Self = StObject.set(x, "targetKeyArn", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyArnUndefined: Self = StObject.set(x, "targetKeyArn", js.undefined)
      
      inline def setTargetKeyId(value: Input[String]): Self = StObject.set(x, "targetKeyId", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyIdUndefined: Self = StObject.set(x, "targetKeyId", js.undefined)
    }
  }
}
