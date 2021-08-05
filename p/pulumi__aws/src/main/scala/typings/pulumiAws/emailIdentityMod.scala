package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ses/emailIdentity", "EmailIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EmailIdentity]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EmailIdentity]
    inline def get(name: String, id: Input[ID], state: EmailIdentityState): EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EmailIdentity]
    inline def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): EmailIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EmailIdentity]
    
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean]
  }
  
  trait EmailIdentityArgs extends StObject {
    
    /**
      * The email address to assign to SES
      */
    val email: Input[String]
  }
  object EmailIdentityArgs {
    
    inline def apply(email: Input[String]): EmailIdentityArgs = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailIdentityArgs]
    }
    
    extension [Self <: EmailIdentityArgs](x: Self) {
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailIdentityState extends StObject {
    
    /**
      * The ARN of the email identity.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The email address to assign to SES
      */
    val email: js.UndefOr[Input[String]] = js.undefined
  }
  object EmailIdentityState {
    
    inline def apply(): EmailIdentityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailIdentityState]
    }
    
    extension [Self <: EmailIdentityState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
}
