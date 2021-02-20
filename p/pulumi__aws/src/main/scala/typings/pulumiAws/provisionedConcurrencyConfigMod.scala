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
    
    /**
      * Get an existing ProvisionedConcurrencyConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState): ProvisionedConcurrencyConfig = js.native
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProvisionedConcurrencyConfigState, opts: CustomResourceOptions): ProvisionedConcurrencyConfig = js.native
    
    /**
      * Returns true if the given object is an instance of ProvisionedConcurrencyConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lambda/provisionedConcurrencyConfig", "ProvisionedConcurrencyConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/provisionedConcurrencyConfig.ProvisionedConcurrencyConfig */ Boolean = js.native
  }
  
  @js.native
  trait ProvisionedConcurrencyConfigArgs extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function.
      */
    val functionName: Input[String] = js.native
    
    /**
      * Amount of capacity to allocate. Must be greater than or equal to `1`.
      */
    val provisionedConcurrentExecutions: Input[Double] = js.native
    
    /**
      * Lambda Function version or Lambda Alias name.
      */
    val qualifier: Input[String] = js.native
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
  
  @js.native
  trait ProvisionedConcurrencyConfigState extends StObject {
    
    /**
      * Name or Amazon Resource Name (ARN) of the Lambda Function.
      */
    val functionName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amount of capacity to allocate. Must be greater than or equal to `1`.
      */
    val provisionedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Lambda Function version or Lambda Alias name.
      */
    val qualifier: js.UndefOr[Input[String]] = js.native
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
