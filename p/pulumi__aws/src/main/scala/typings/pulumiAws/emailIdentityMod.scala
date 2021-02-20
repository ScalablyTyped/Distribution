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

object emailIdentityMod {
  
  @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity")
  @js.native
  class EmailIdentity protected () extends CustomResource {
    /**
      * Create a EmailIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailIdentityArgs) = this()
    def this(name: String, args: EmailIdentityArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the email identity.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The email address to assign to SES
      */
    val email: Output_[String] = js.native
  }
  /* static members */
  object EmailIdentity {
    
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState): EmailIdentity = js.native
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): EmailIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = js.native
  }
  
  @js.native
  trait EmailIdentityArgs extends StObject {
    
    /**
      * The email address to assign to SES
      */
    val email: Input[String] = js.native
  }
  object EmailIdentityArgs {
    
    @scala.inline
    def apply(email: Input[String]): EmailIdentityArgs = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailIdentityArgs]
    }
    
    @scala.inline
    implicit class EmailIdentityArgsMutableBuilder[Self <: EmailIdentityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmailIdentityState extends StObject {
    
    /**
      * The ARN of the email identity.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The email address to assign to SES
      */
    val email: js.UndefOr[Input[String]] = js.native
  }
  object EmailIdentityState {
    
    @scala.inline
    def apply(): EmailIdentityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailIdentityState]
    }
    
    @scala.inline
    implicit class EmailIdentityStateMutableBuilder[Self <: EmailIdentityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
}
