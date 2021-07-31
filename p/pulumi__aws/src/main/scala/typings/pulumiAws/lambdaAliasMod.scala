package typings.pulumiAws

import typings.pulumiAws.outputMod.lambda.AliasRoutingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaAliasMod {
  
  @JSImport("@pulumi/aws/lambda/alias", "Alias")
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
      * The Amazon Resource Name (ARN) identifying your Lambda function alias.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the alias.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Lambda Function name or ARN.
      */
    val functionName: Output_[String] = js.native
    
    /**
      * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
      */
    val functionVersion: Output_[String] = js.native
    
    /**
      * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
      */
    val invokeArn: Output_[String] = js.native
    
    /**
      * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
      */
    val name: Output_[String] = js.native
    
    /**
      * The Lambda alias' route configuration settings. Fields documented below
      */
    val routingConfig: Output_[js.UndefOr[AliasRoutingConfig]] = js.native
  }
  /* static members */
  object Alias {
    
    @JSImport("@pulumi/aws/lambda/alias", "Alias")
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
    @scala.inline
    def get(name: String, id: Input[ID]): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Alias]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Alias]
    @scala.inline
    def get(name: String, id: Input[ID], state: AliasState): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Alias]
    @scala.inline
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Alias]
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean]
  }
  
  trait AliasArgs extends StObject {
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Lambda Function name or ARN.
      */
    val functionName: Input[String]
    
    /**
      * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
      */
    val functionVersion: Input[String]
    
    /**
      * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Lambda alias' route configuration settings. Fields documented below
      */
    val routingConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.lambda.AliasRoutingConfig]] = js.undefined
  }
  object AliasArgs {
    
    @scala.inline
    def apply(functionName: Input[String], functionVersion: Input[String]): AliasArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasArgs]
    }
    
    @scala.inline
    implicit class AliasArgsMutableBuilder[Self <: AliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersion(value: Input[String]): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoutingConfig(value: Input[typings.pulumiAws.inputMod.lambda.AliasRoutingConfig]): Self = StObject.set(x, "routingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingConfigUndefined: Self = StObject.set(x, "routingConfig", js.undefined)
    }
  }
  
  trait AliasState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) identifying your Lambda function alias.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the alias.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Lambda Function name or ARN.
      */
    val functionName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
      */
    val functionVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
      */
    val invokeArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Lambda alias' route configuration settings. Fields documented below
      */
    val routingConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.lambda.AliasRoutingConfig]] = js.undefined
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
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setFunctionVersion(value: Input[String]): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionVersionUndefined: Self = StObject.set(x, "functionVersion", js.undefined)
      
      @scala.inline
      def setInvokeArn(value: Input[String]): Self = StObject.set(x, "invokeArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokeArnUndefined: Self = StObject.set(x, "invokeArn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoutingConfig(value: Input[typings.pulumiAws.inputMod.lambda.AliasRoutingConfig]): Self = StObject.set(x, "routingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingConfigUndefined: Self = StObject.set(x, "routingConfig", js.undefined)
    }
  }
}
