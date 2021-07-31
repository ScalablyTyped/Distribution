package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainIdentityVerificationMod {
  
  @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
  @js.native
  class DomainIdentityVerification protected () extends CustomResource {
    /**
      * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityVerificationArgs) = this()
    def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the domain identity.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: Output_[String] = js.native
  }
  /* static members */
  object DomainIdentityVerification {
    
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainIdentityVerification]
    @scala.inline
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): DomainIdentityVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainIdentityVerification]
    
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean]
  }
  
  trait DomainIdentityVerificationArgs extends StObject {
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: Input[String]
  }
  object DomainIdentityVerificationArgs {
    
    @scala.inline
    def apply(domain: Input[String]): DomainIdentityVerificationArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainIdentityVerificationArgs]
    }
    
    @scala.inline
    implicit class DomainIdentityVerificationArgsMutableBuilder[Self <: DomainIdentityVerificationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainIdentityVerificationState extends StObject {
    
    /**
      * The ARN of the domain identity.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainIdentityVerificationState {
    
    @scala.inline
    def apply(): DomainIdentityVerificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainIdentityVerificationState]
    }
    
    @scala.inline
    implicit class DomainIdentityVerificationStateMutableBuilder[Self <: DomainIdentityVerificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
}
