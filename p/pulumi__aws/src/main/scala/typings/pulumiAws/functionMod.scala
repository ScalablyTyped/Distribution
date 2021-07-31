package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionMod {
  
  @JSImport("@pulumi/aws/appsync/function", "Function")
  @js.native
  class Function protected () extends CustomResource {
    /**
      * Create a Function resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionArgs) = this()
    def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the associated AppSync API.
      */
    val apiId: Output_[String] = js.native
    
    /**
      * The ARN of the Function object.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Function DataSource name.
      */
    val dataSource: Output_[String] = js.native
    
    /**
      * The Function description.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A unique ID representing the Function object.
      */
    val functionId: Output_[String] = js.native
    
    /**
      * The version of the request mapping template. Currently the supported value is `2018-05-29`.
      */
    val functionVersion: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Function name. The function name does not have to be unique.
      */
    val name: Output_[String] = js.native
    
    /**
      * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
      */
    val requestMappingTemplate: Output_[String] = js.native
    
    /**
      * The Function response mapping template.
      */
    val responseMappingTemplate: Output_[String] = js.native
  }
  /* static members */
  object Function {
    
    @JSImport("@pulumi/aws/appsync/function", "Function")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Function resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionState): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Function]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): Function = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Function]
    
    /**
      * Returns true if the given object is an instance of Function.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appsync/function.Function */ Boolean]
  }
  
  trait FunctionArgs extends StObject {
    
    /**
      * The ID of the associated AppSync API.
      */
    val apiId: Input[String]
    
    /**
      * The Function DataSource name.
      */
    val dataSource: Input[String]
    
    /**
      * The Function description.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the request mapping template. Currently the supported value is `2018-05-29`.
      */
    val functionVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function name. The function name does not have to be unique.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
      */
    val requestMappingTemplate: Input[String]
    
    /**
      * The Function response mapping template.
      */
    val responseMappingTemplate: Input[String]
  }
  object FunctionArgs {
    
    @scala.inline
    def apply(
      apiId: Input[String],
      dataSource: Input[String],
      requestMappingTemplate: Input[String],
      responseMappingTemplate: Input[String]
    ): FunctionArgs = {
      val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], responseMappingTemplate = responseMappingTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionArgs]
    }
    
    @scala.inline
    implicit class FunctionArgsMutableBuilder[Self <: FunctionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: Input[String]): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequestMappingTemplate(value: Input[String]): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMappingTemplate(value: Input[String]): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionState extends StObject {
    
    /**
      * The ID of the associated AppSync API.
      */
    val apiId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the Function object.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function DataSource name.
      */
    val dataSource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function description.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique ID representing the Function object.
      */
    val functionId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the request mapping template. Currently the supported value is `2018-05-29`.
      */
    val functionVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function name. The function name does not have to be unique.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
      */
    val requestMappingTemplate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Function response mapping template.
      */
    val responseMappingTemplate: js.UndefOr[Input[String]] = js.undefined
  }
  object FunctionState {
    
    @scala.inline
    def apply(): FunctionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionState]
    }
    
    @scala.inline
    implicit class FunctionStateMutableBuilder[Self <: FunctionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiId(value: Input[String]): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiIdUndefined: Self = StObject.set(x, "apiId", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataSource(value: Input[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFunctionId(value: Input[String]): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: Input[String]): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequestMappingTemplate(value: Input[String]): Self = StObject.set(x, "requestMappingTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestMappingTemplateUndefined: Self = StObject.set(x, "requestMappingTemplate", js.undefined)
      
      @scala.inline
      def setResponseMappingTemplate(value: Input[String]): Self = StObject.set(x, "responseMappingTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMappingTemplateUndefined: Self = StObject.set(x, "responseMappingTemplate", js.undefined)
    }
  }
}
