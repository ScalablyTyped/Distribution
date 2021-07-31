package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailFromMod {
  
  @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom")
  @js.native
  class MailFrom protected () extends CustomResource {
    /**
      * Create a MailFrom resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MailFromArgs) = this()
    def this(name: String, args: MailFromArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: Output_[String] = js.native
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: Output_[String] = js.native
  }
  /* static members */
  object MailFrom {
    
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MailFrom resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: MailFromState): MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MailFrom]
    @scala.inline
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): MailFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MailFrom]
    
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean]
  }
  
  trait MailFromArgs extends StObject {
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: Input[String]
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: Input[String]
  }
  object MailFromArgs {
    
    @scala.inline
    def apply(domain: Input[String], mailFromDomain: Input[String]): MailFromArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], mailFromDomain = mailFromDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailFromArgs]
    }
    
    @scala.inline
    implicit class MailFromArgsMutableBuilder[Self <: MailFromArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviorOnMxFailure(value: Input[String]): Self = StObject.set(x, "behaviorOnMxFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorOnMxFailureUndefined: Self = StObject.set(x, "behaviorOnMxFailure", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailFromDomain(value: Input[String]): Self = StObject.set(x, "mailFromDomain", value.asInstanceOf[js.Any])
    }
  }
  
  trait MailFromState extends StObject {
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: js.UndefOr[Input[String]] = js.undefined
  }
  object MailFromState {
    
    @scala.inline
    def apply(): MailFromState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailFromState]
    }
    
    @scala.inline
    implicit class MailFromStateMutableBuilder[Self <: MailFromState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviorOnMxFailure(value: Input[String]): Self = StObject.set(x, "behaviorOnMxFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorOnMxFailureUndefined: Self = StObject.set(x, "behaviorOnMxFailure", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setMailFromDomain(value: Input[String]): Self = StObject.set(x, "mailFromDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailFromDomainUndefined: Self = StObject.set(x, "mailFromDomain", js.undefined)
    }
  }
}
