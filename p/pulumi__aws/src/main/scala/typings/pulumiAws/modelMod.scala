package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/model", "Model")
  @js.native
  class Model protected () extends CustomResource {
    /**
      * Create a Model resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ModelArgs) = this()
    def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The API identifier.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
      */
    val contentType: Output_[String] = js.native
    
    /**
      * The description of the model. Must be between 1 and 128 characters in length.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
      */
    val schema: Output_[String] = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: ModelState): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Model]
    inline def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Model]
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean]
  }
  
  trait ModelArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String]
    
    /**
      * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
      */
    val contentType: Input[String]
    
    /**
      * The description of the model. Must be between 1 and 128 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
      */
    val schema: Input[String]
  }
  object ModelArgs {
    
    inline def apply(apiId: Input[String], contentType: Input[String], schema: Input[String]): ModelArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelArgs]
    }
    
    extension [Self <: ModelArgs](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
      */
    val contentType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The description of the model. Must be between 1 and 128 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
      */
    val schema: js.UndefOr[Input[String]] = js.undefined
  }
  object ModelState {
    
    inline def apply(): ModelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelState]
    }
    
    extension [Self <: ModelState](x: Self) {
      
      inline def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      inline def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      inline def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
