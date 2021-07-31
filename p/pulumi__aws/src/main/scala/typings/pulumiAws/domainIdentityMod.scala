package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainIdentityMod {
  
  @JSImport("@pulumi/aws/ses/domainIdentity", "DomainIdentity")
  @js.native
  class DomainIdentity protected () extends CustomResource {
    /**
      * Create a DomainIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityArgs) = this()
    def this(name: String, args: DomainIdentityArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the domain identity.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The domain name to assign to SES
      */
    val domain: Output_[String] = js.native
    
    /**
      * A code which when added to the domain as a TXT record
      * will signal to SES that the owner of the domain has authorised SES to act on
      * their behalf. The domain identity will be in state "verification pending"
      * until this is done. See below for an example of how this might be achieved
      * when the domain is hosted in Route 53 and managed by this provider.  Find out
      * more about verifying domains in Amazon SES in the [AWS SES
      * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
      */
    val verificationToken: Output_[String] = js.native
  }
  /* static members */
  object DomainIdentity {
    
    @JSImport("@pulumi/aws/ses/domainIdentity", "DomainIdentity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityState): DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainIdentity]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): DomainIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainIdentity]
    
    /**
      * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean]
  }
  
  trait DomainIdentityArgs extends StObject {
    
    /**
      * The domain name to assign to SES
      */
    val domain: Input[String]
  }
  object DomainIdentityArgs {
    
    @scala.inline
    def apply(domain: Input[String]): DomainIdentityArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainIdentityArgs]
    }
    
    @scala.inline
    implicit class DomainIdentityArgsMutableBuilder[Self <: DomainIdentityArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainIdentityState extends StObject {
    
    /**
      * The ARN of the domain identity.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name to assign to SES
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A code which when added to the domain as a TXT record
      * will signal to SES that the owner of the domain has authorised SES to act on
      * their behalf. The domain identity will be in state "verification pending"
      * until this is done. See below for an example of how this might be achieved
      * when the domain is hosted in Route 53 and managed by this provider.  Find out
      * more about verifying domains in Amazon SES in the [AWS SES
      * docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/verify-domains.html).
      */
    val verificationToken: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainIdentityState {
    
    @scala.inline
    def apply(): DomainIdentityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainIdentityState]
    }
    
    @scala.inline
    implicit class DomainIdentityStateMutableBuilder[Self <: DomainIdentityState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setVerificationToken(value: Input[String]): Self = StObject.set(x, "verificationToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationTokenUndefined: Self = StObject.set(x, "verificationToken", js.undefined)
    }
  }
}
