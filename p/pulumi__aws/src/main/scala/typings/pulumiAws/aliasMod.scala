package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.AliasRoutingStrategy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasMod {
  
  @JSImport("@pulumi/aws/gamelift/alias", "Alias")
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
      * Alias ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the alias.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Name of the alias.
      */
    val name: Output_[String] = js.native
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: Output_[AliasRoutingStrategy] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Alias {
    
    @JSImport("@pulumi/aws/gamelift/alias", "Alias")
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
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean]
  }
  
  trait AliasArgs extends StObject {
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the alias.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: Input[typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AliasArgs {
    
    inline def apply(routingStrategy: Input[typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): AliasArgs = {
      val __obj = js.Dynamic.literal(routingStrategy = routingStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasArgs]
    }
    
    extension [Self <: AliasArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoutingStrategy(value: Input[typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): Self = StObject.set(x, "routingStrategy", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AliasState extends StObject {
    
    /**
      * Alias ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the alias.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the fleet and/or routing type to use for the alias.
      */
    val routingStrategy: js.UndefOr[Input[typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AliasState {
    
    inline def apply(): AliasState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasState]
    }
    
    extension [Self <: AliasState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoutingStrategy(value: Input[typings.pulumiAws.inputMod.gamelift.AliasRoutingStrategy]): Self = StObject.set(x, "routingStrategy", value.asInstanceOf[js.Any])
      
      inline def setRoutingStrategyUndefined: Self = StObject.set(x, "routingStrategy", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
