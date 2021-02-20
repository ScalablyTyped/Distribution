package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainPolicyMod {
  
  @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy")
  @js.native
  class DomainPolicy protected () extends CustomResource {
    /**
      * Create a DomainPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPolicyArgs) = this()
    def this(name: String, args: DomainPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: Output_[String] = js.native
    
    /**
      * Name of the domain.
      */
    val domainName: Output_[String] = js.native
  }
  /* static members */
  object DomainPolicy {
    
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): DomainPolicy = js.native
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainPolicy = js.native
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState): DomainPolicy = js.native
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): DomainPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
  }
  
  @js.native
  trait DomainPolicyArgs extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: Input[String | PolicyDocument] = js.native
    
    /**
      * Name of the domain.
      */
    val domainName: Input[String] = js.native
  }
  object DomainPolicyArgs {
    
    @scala.inline
    def apply(accessPolicies: Input[String | PolicyDocument], domainName: Input[String]): DomainPolicyArgs = {
      val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainPolicyArgs]
    }
    
    @scala.inline
    implicit class DomainPolicyArgsMutableBuilder[Self <: DomainPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomainPolicyState extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.native
    
    /**
      * Name of the domain.
      */
    val domainName: js.UndefOr[Input[String]] = js.native
  }
  object DomainPolicyState {
    
    @scala.inline
    def apply(): DomainPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainPolicyState]
    }
    
    @scala.inline
    implicit class DomainPolicyStateMutableBuilder[Self <: DomainPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    }
  }
}
