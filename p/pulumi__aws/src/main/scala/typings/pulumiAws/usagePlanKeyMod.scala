package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usagePlanKeyMod {
  
  @JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
  @js.native
  class UsagePlanKey protected () extends CustomResource {
    /**
      * Create a UsagePlanKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UsagePlanKeyArgs) = this()
    def this(name: String, args: UsagePlanKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The identifier of the API key resource.
      */
    val keyId: Output_[String] = js.native
    
    /**
      * The type of the API key resource. Currently, the valid key type is API_KEY.
      */
    val keyType: Output_[String] = js.native
    
    /**
      * The name of a usage plan key.
      */
    val name: Output_[String] = js.native
    
    /**
      * The Id of the usage plan resource representing to associate the key to.
      */
    val usagePlanId: Output_[String] = js.native
    
    /**
      * The value of a usage plan key.
      */
    val value: Output_[String] = js.native
  }
  /* static members */
  object UsagePlanKey {
    
    @JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UsagePlanKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[UsagePlanKey]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UsagePlanKey]
    inline def get(name: String, id: Input[ID], state: UsagePlanKeyState): UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[UsagePlanKey]
    inline def get(name: String, id: Input[ID], state: UsagePlanKeyState, opts: CustomResourceOptions): UsagePlanKey = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UsagePlanKey]
    
    /**
      * Returns true if the given object is an instance of UsagePlanKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean]
  }
  
  trait UsagePlanKeyArgs extends StObject {
    
    /**
      * The identifier of the API key resource.
      */
    val keyId: Input[String]
    
    /**
      * The type of the API key resource. Currently, the valid key type is API_KEY.
      */
    val keyType: Input[String]
    
    /**
      * The Id of the usage plan resource representing to associate the key to.
      */
    val usagePlanId: Input[String]
  }
  object UsagePlanKeyArgs {
    
    inline def apply(keyId: Input[String], keyType: Input[String], usagePlanId: Input[String]): UsagePlanKeyArgs = {
      val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsagePlanKeyArgs]
    }
    
    extension [Self <: UsagePlanKeyArgs](x: Self) {
      
      inline def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyType(value: Input[String]): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setUsagePlanId(value: Input[String]): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsagePlanKeyState extends StObject {
    
    /**
      * The identifier of the API key resource.
      */
    val keyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the API key resource. Currently, the valid key type is API_KEY.
      */
    val keyType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of a usage plan key.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Id of the usage plan resource representing to associate the key to.
      */
    val usagePlanId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value of a usage plan key.
      */
    val value: js.UndefOr[Input[String]] = js.undefined
  }
  object UsagePlanKeyState {
    
    inline def apply(): UsagePlanKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsagePlanKeyState]
    }
    
    extension [Self <: UsagePlanKeyState](x: Self) {
      
      inline def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setKeyType(value: Input[String]): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUsagePlanId(value: Input[String]): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
      
      inline def setUsagePlanIdUndefined: Self = StObject.set(x, "usagePlanId", js.undefined)
      
      inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
