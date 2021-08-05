package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/elasticsearch/domainPolicy", "DomainPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DomainPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainPolicy]
    inline def get(name: String, id: Input[ID], state: DomainPolicyState): DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DomainPolicy]
    inline def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DomainPolicy]
    
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean]
  }
  
  trait DomainPolicyArgs extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: Input[String | PolicyDocument]
    
    /**
      * Name of the domain.
      */
    val domainName: Input[String]
  }
  object DomainPolicyArgs {
    
    inline def apply(accessPolicies: Input[String | PolicyDocument], domainName: Input[String]): DomainPolicyArgs = {
      val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainPolicyArgs]
    }
    
    extension [Self <: DomainPolicyArgs](x: Self) {
      
      inline def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainPolicyState extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * Name of the domain.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainPolicyState {
    
    inline def apply(): DomainPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainPolicyState]
    }
    
    extension [Self <: DomainPolicyState](x: Self) {
      
      inline def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      inline def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    }
  }
}
