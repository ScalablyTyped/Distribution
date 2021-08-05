package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thingMod {
  
  @JSImport("@pulumi/aws/iot/thing", "Thing")
  @js.native
  class Thing protected () extends CustomResource {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the thing.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The default client ID.
      */
    val defaultClientId: Output_[String] = js.native
    
    /**
      * The name of the thing.
      */
    val name: Output_[String] = js.native
    
    /**
      * The thing type name.
      */
    val thingTypeName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The current version of the thing record in the registry.
      */
    val version: Output_[Double] = js.native
  }
  /* static members */
  object Thing {
    
    @JSImport("@pulumi/aws/iot/thing", "Thing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Thing]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Thing]
    inline def get(name: String, id: Input[ID], state: ThingState): Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Thing]
    inline def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): Thing = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Thing]
    
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean]
  }
  
  trait ThingArgs extends StObject {
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The name of the thing.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The thing type name.
      */
    val thingTypeName: js.UndefOr[Input[String]] = js.undefined
  }
  object ThingArgs {
    
    inline def apply(): ThingArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingArgs]
    }
    
    extension [Self <: ThingArgs](x: Self) {
      
      inline def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setThingTypeName(value: Input[String]): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
      
      inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
    }
  }
  
  trait ThingState extends StObject {
    
    /**
      * The ARN of the thing.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Map of attributes of the thing.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The default client ID.
      */
    val defaultClientId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the thing.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The thing type name.
      */
    val thingTypeName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The current version of the thing record in the registry.
      */
    val version: js.UndefOr[Input[Double]] = js.undefined
  }
  object ThingState {
    
    inline def apply(): ThingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThingState]
    }
    
    extension [Self <: ThingState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDefaultClientId(value: Input[String]): Self = StObject.set(x, "defaultClientId", value.asInstanceOf[js.Any])
      
      inline def setDefaultClientIdUndefined: Self = StObject.set(x, "defaultClientId", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setThingTypeName(value: Input[String]): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
      
      inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
      
      inline def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
