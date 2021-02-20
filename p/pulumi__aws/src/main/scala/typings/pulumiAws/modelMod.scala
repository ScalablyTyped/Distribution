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
    
    /**
      * Get an existing Model resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model.get")
    @js.native
    def get(name: String, id: Input[ID]): Model = js.native
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Model = js.native
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState): Model = js.native
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model.get")
    @js.native
    def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): Model = js.native
    
    /**
      * Returns true if the given object is an instance of Model.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigatewayv2/model", "Model.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/model.Model */ Boolean = js.native
  }
  
  @js.native
  trait ModelArgs extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: Input[String] = js.native
    
    /**
      * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
      */
    val contentType: Input[String] = js.native
    
    /**
      * The description of the model. Must be between 1 and 128 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
      */
    val schema: Input[String] = js.native
  }
  object ModelArgs {
    
    @scala.inline
    def apply(apiId: Input[String], contentType: Input[String], schema: Input[String]): ModelArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelArgs]
    }
    
    @scala.inline
    implicit class ModelArgsMutableBuilder[Self <: ModelArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModelState extends StObject {
    
    /**
      * The API identifier.
      */
    val apiId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
      */
    val contentType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the model. Must be between 1 and 128 characters in length.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
      */
    val schema: js.UndefOr[Input[String]] = js.native
  }
  object ModelState {
    
    @scala.inline
    def apply(): ModelState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelState]
    }
    
    @scala.inline
    implicit class ModelStateMutableBuilder[Self <: ModelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setContentType(value: Input[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSchema(value: Input[String]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
