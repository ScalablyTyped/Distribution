package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provisionedConcurrencyConfigMod {
  
  @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig")
  @js.native
  class ProvisionedConcurrencyConfig protected () extends CustomResource {
    /**
      * Create a ProvisionedConcurrencyConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProvisionedConcurrencyConfigArgs) = this()
    def this(name: String, args: ProvisionedConcurrencyConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function.
      */
    val functionName: Output_[String] = js.native
    
    /**
      * Amount of capacity to allocate. Must be greater than or equal to `1`.
      */
    val provisionedConcurrentExecutions: Output_[Double] = js.native
    
    /**
      * Lambda Function version or Lambda Alias name.
      */
    val qualifier: Output_[String] = js.native
  }
  /* static members */
  object ProvisionedConcurrencyConfig {
    
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ProvisionedConcurrencyConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProvisionedConcurrencyConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ProvisionedConcurrencyConfig]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): ProvisionedConcurrencyConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProvisionedConcurrencyConfig]
    
    /**
      * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean]
  }
  
  trait ProvisionedConcurrencyConfigArgs extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function.
      */
    val functionName: Input[String]
    
    /**
      * Amount of capacity to allocate. Must be greater than or equal to `1`.
      */
    val provisionedConcurrentExecutions: Input[Double]
    
    /**
      * Lambda Function version or Lambda Alias name.
      */
    val qualifier: Input[String]
  }
  object ProvisionedConcurrencyConfigArgs {
    
    @scala.inline
    def apply(
      functionName: Input[String],
      provisionedConcurrentExecutions: Input[Double],
      qualifier: Input[String]
    ): ProvisionedConcurrencyConfigArgs = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], provisionedConcurrentExecutions = provisionedConcurrentExecutions.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedConcurrencyConfigArgs]
    }
    
    @scala.inline
    implicit class ProvisionedConcurrencyConfigArgsMutableBuilder[Self <: ProvisionedConcurrencyConfigArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedConcurrentExecutions(value: Input[Double]): Self = StObject.set(x, "provisionedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifier(value: Input[String]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisionedConcurrencyConfigState extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function.
      */
    val functionName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amount of capacity to allocate. Must be greater than or equal to `1`.
      */
    val provisionedConcurrentExecutions: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Lambda Function version or Lambda Alias name.
      */
    val qualifier: js.UndefOr[Input[String]] = js.undefined
  }
  object ProvisionedConcurrencyConfigState {
    
    @scala.inline
    def apply(): ProvisionedConcurrencyConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedConcurrencyConfigState]
    }
    
    @scala.inline
    implicit class ProvisionedConcurrencyConfigStateMutableBuilder[Self <: ProvisionedConcurrencyConfigState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setProvisionedConcurrentExecutions(value: Input[Double]): Self = StObject.set(x, "provisionedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedConcurrentExecutionsUndefined: Self = StObject.set(x, "provisionedConcurrentExecutions", js.undefined)
      
      @scala.inline
      def setQualifier(value: Input[String]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
}
