package typings.pulumiAws

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestValidatorMod {
  
  @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator")
  @js.native
  class RequestValidator protected () extends CustomResource {
    /**
      * Create a RequestValidator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RequestValidatorArgs) = this()
    def this(name: String, args: RequestValidatorArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the request validator
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: Output_[String] = js.native
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: Output_[js.UndefOr[Boolean]] = js.native
  }
  /* static members */
  object RequestValidator {
    
    @JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RequestValidator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RequestValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RequestValidator]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RequestValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RequestValidator]
    @scala.inline
    def get(name: String, id: Input[ID], state: RequestValidatorState): RequestValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RequestValidator]
    @scala.inline
    def get(name: String, id: Input[ID], state: RequestValidatorState, opts: CustomResourceOptions): RequestValidator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RequestValidator]
    
    /**
      * Returns true if the given object is an instance of RequestValidator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean]
  }
  
  trait RequestValidatorArgs extends StObject {
    
    /**
      * The name of the request validator
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: Input[String | RestApi]
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object RequestValidatorArgs {
    
    @scala.inline
    def apply(restApi: Input[String | RestApi]): RequestValidatorArgs = {
      val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestValidatorArgs]
    }
    
    @scala.inline
    implicit class RequestValidatorArgsMutableBuilder[Self <: RequestValidatorArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBody(value: Input[Boolean]): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
      
      @scala.inline
      def setValidateRequestParameters(value: Input[Boolean]): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
    }
  }
  
  trait RequestValidatorState extends StObject {
    
    /**
      * The name of the request validator
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the associated Rest API
      */
    val restApi: js.UndefOr[Input[String | RestApi]] = js.undefined
    
    /**
      * Boolean whether to validate request body. Defaults to `false`.
      */
    val validateRequestBody: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether to validate request parameters. Defaults to `false`.
      */
    val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object RequestValidatorState {
    
    @scala.inline
    def apply(): RequestValidatorState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestValidatorState]
    }
    
    @scala.inline
    implicit class RequestValidatorStateMutableBuilder[Self <: RequestValidatorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRestApi(value: Input[String | RestApi]): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestApiUndefined: Self = StObject.set(x, "restApi", js.undefined)
      
      @scala.inline
      def setValidateRequestBody(value: Input[Boolean]): Self = StObject.set(x, "validateRequestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestBodyUndefined: Self = StObject.set(x, "validateRequestBody", js.undefined)
      
      @scala.inline
      def setValidateRequestParameters(value: Input[Boolean]): Self = StObject.set(x, "validateRequestParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateRequestParametersUndefined: Self = StObject.set(x, "validateRequestParameters", js.undefined)
    }
  }
}
