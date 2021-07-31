package typings.pulumiAws

import typings.pulumiAws.outputMod.apigateway.AccountThrottleSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountMod {
  
  @JSImport("@pulumi/aws/apigateway/account", "Account")
  @js.native
  class Account protected () extends CustomResource {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of an IAM role for CloudWatch (to allow logging & monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
      */
    val cloudwatchRoleArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Account-Level throttle settings. See exported fields below.
      */
    val throttleSettings: Output_[AccountThrottleSettings] = js.native
  }
  /* static members */
  object Account {
    
    @JSImport("@pulumi/aws/apigateway/account", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Account]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Account]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccountState): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Account]
    @scala.inline
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Account]
    
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/account.Account */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigateway/account.Account */ Boolean]
  }
  
  trait AccountArgs extends StObject {
    
    /**
      * The ARN of an IAM role for CloudWatch (to allow logging & monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
      */
    val cloudwatchRoleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object AccountArgs {
    
    @scala.inline
    def apply(): AccountArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountArgs]
    }
    
    @scala.inline
    implicit class AccountArgsMutableBuilder[Self <: AccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchRoleArn(value: Input[String]): Self = StObject.set(x, "cloudwatchRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchRoleArnUndefined: Self = StObject.set(x, "cloudwatchRoleArn", js.undefined)
    }
  }
  
  trait AccountState extends StObject {
    
    /**
      * The ARN of an IAM role for CloudWatch (to allow logging & monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
      */
    val cloudwatchRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Account-Level throttle settings. See exported fields below.
      */
    val throttleSettings: js.UndefOr[Input[typings.pulumiAws.inputMod.apigateway.AccountThrottleSettings]] = js.undefined
  }
  object AccountState {
    
    @scala.inline
    def apply(): AccountState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountState]
    }
    
    @scala.inline
    implicit class AccountStateMutableBuilder[Self <: AccountState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchRoleArn(value: Input[String]): Self = StObject.set(x, "cloudwatchRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchRoleArnUndefined: Self = StObject.set(x, "cloudwatchRoleArn", js.undefined)
      
      @scala.inline
      def setThrottleSettings(value: Input[typings.pulumiAws.inputMod.apigateway.AccountThrottleSettings]): Self = StObject.set(x, "throttleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleSettingsUndefined: Self = StObject.set(x, "throttleSettings", js.undefined)
    }
  }
}
