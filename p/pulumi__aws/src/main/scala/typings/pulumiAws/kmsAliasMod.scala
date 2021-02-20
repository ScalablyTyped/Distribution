package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): Alias = js.native
    @JSImport("@pulumi/aws/kms/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Alias = js.native
    @JSImport("@pulumi/aws/kms/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): Alias = js.native
    @JSImport("@pulumi/aws/kms/alias", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms/alias", "Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = js.native
  }
  
  @js.native
  trait AliasArgs extends StObject {
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates an unique alias beginning with the specified prefix.
      * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier for the key for which the alias is for, can be either an ARN or key_id.
      */
    val targetKeyId: Input[String] = js.native
  }
  object AliasArgs {
    
    @scala.inline
    def apply(targetKeyId: Input[String]): AliasArgs = {
      val __obj = js.Dynamic.literal(targetKeyId = targetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasArgs]
    }
    
    @scala.inline
    implicit class AliasArgsMutableBuilder[Self <: AliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTargetKeyId(value: Input[String]): Self = StObject.set(x, "targetKeyId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AliasState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the key alias.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates an unique alias beginning with the specified prefix.
      * The name must start with the word "alias" followed by a forward slash (alias/).  Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the target key identifier.
      */
    val targetKeyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier for the key for which the alias is for, can be either an ARN or key_id.
      */
    val targetKeyId: js.UndefOr[Input[String]] = js.native
  }
  object AliasState {
    
    @scala.inline
    def apply(): AliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasState]
    }
    
    @scala.inline
    implicit class AliasStateMutableBuilder[Self <: AliasState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTargetKeyArn(value: Input[String]): Self = StObject.set(x, "targetKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeyArnUndefined: Self = StObject.set(x, "targetKeyArn", js.undefined)
      
      @scala.inline
      def setTargetKeyId(value: Input[String]): Self = StObject.set(x, "targetKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeyIdUndefined: Self = StObject.set(x, "targetKeyId", js.undefined)
    }
  }
}
