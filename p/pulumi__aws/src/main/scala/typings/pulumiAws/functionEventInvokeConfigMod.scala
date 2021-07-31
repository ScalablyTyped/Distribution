package typings.pulumiAws

import typings.pulumiAws.outputMod.lambda.FunctionEventInvokeConfigDestinationConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionEventInvokeConfigMod {
  
  @JSImport("@pulumi/aws/lambda/functionEventInvokeConfig", "FunctionEventInvokeConfig")
  @js.native
  class FunctionEventInvokeConfig protected () extends CustomResource {
    /**
      * Create a FunctionEventInvokeConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FunctionEventInvokeConfigArgs) = this()
    def this(name: String, args: FunctionEventInvokeConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Configuration block with destination configuration. See below for details.
      */
    val destinationConfig: Output_[js.UndefOr[FunctionEventInvokeConfigDestinationConfig]] = js.native
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
      */
    val functionName: Output_[String] = js.native
    
    /**
      * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
      */
    val maximumEventAgeInSeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
      */
    val maximumRetryAttempts: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Lambda Function published version, `$LATEST`, or Lambda Alias name.
      */
    val qualifier: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object FunctionEventInvokeConfig {
    
    @JSImport("@pulumi/aws/lambda/functionEventInvokeConfig", "FunctionEventInvokeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[FunctionEventInvokeConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FunctionEventInvokeConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState): FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[FunctionEventInvokeConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState, opts: CustomResourceOptions): FunctionEventInvokeConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FunctionEventInvokeConfig]
    
    /**
      * Returns true if the given object is an instance of FunctionEventInvokeConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean]
  }
  
  trait FunctionEventInvokeConfigArgs extends StObject {
    
    /**
      * Configuration block with destination configuration. See below for details.
      */
    val destinationConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig]
      ] = js.undefined
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
      */
    val functionName: Input[String]
    
    /**
      * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
      */
    val maximumEventAgeInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
      */
    val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Lambda Function published version, `$LATEST`, or Lambda Alias name.
      */
    val qualifier: js.UndefOr[Input[String]] = js.undefined
  }
  object FunctionEventInvokeConfigArgs {
    
    @scala.inline
    def apply(functionName: Input[String]): FunctionEventInvokeConfigArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionEventInvokeConfigArgs]
    }
    
    @scala.inline
    implicit class FunctionEventInvokeConfigArgsMutableBuilder[Self <: FunctionEventInvokeConfigArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationConfig(value: Input[typings.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumEventAgeInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumEventAgeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumEventAgeInSecondsUndefined: Self = StObject.set(x, "maximumEventAgeInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRetryAttempts(value: Input[Double]): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      @scala.inline
      def setQualifier(value: Input[String]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
  
  trait FunctionEventInvokeConfigState extends StObject {
    
    /**
      * Configuration block with destination configuration. See below for details.
      */
    val destinationConfig: js.UndefOr[
        Input[typings.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig]
      ] = js.undefined
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
      */
    val functionName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
      */
    val maximumEventAgeInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
      */
    val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Lambda Function published version, `$LATEST`, or Lambda Alias name.
      */
    val qualifier: js.UndefOr[Input[String]] = js.undefined
  }
  object FunctionEventInvokeConfigState {
    
    @scala.inline
    def apply(): FunctionEventInvokeConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionEventInvokeConfigState]
    }
    
    @scala.inline
    implicit class FunctionEventInvokeConfigStateMutableBuilder[Self <: FunctionEventInvokeConfigState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationConfig(value: Input[typings.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setMaximumEventAgeInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumEventAgeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumEventAgeInSecondsUndefined: Self = StObject.set(x, "maximumEventAgeInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRetryAttempts(value: Input[Double]): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      @scala.inline
      def setQualifier(value: Input[String]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
}
