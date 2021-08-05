package typings.pulumiAws

import typings.pulumiAws.domainPolicyMod.DomainPolicyArgs
import typings.pulumiAws.domainPolicyMod.DomainPolicyState
import typings.pulumiAws.elasticsearchDomainMod.DomainArgs
import typings.pulumiAws.elasticsearchDomainMod.DomainState
import typings.pulumiAws.getDomainMod.GetDomainArgs
import typings.pulumiAws.getDomainMod.GetDomainResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticsearchMod {
  
  @JSImport("@pulumi/aws/elasticsearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/elasticsearch", "Domain")
  @js.native
  class Domain protected ()
    extends typings.pulumiAws.elasticsearchDomainMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    @JSImport("@pulumi/aws/elasticsearch", "Domain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.elasticsearchDomainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticsearchDomainMod.Domain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.elasticsearchDomainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticsearchDomainMod.Domain]
    inline def get(name: String, id: Input[ID], state: DomainState): typings.pulumiAws.elasticsearchDomainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticsearchDomainMod.Domain]
    inline def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.pulumiAws.elasticsearchDomainMod.Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.elasticsearchDomainMod.Domain]
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean]
  }
  
  @JSImport("@pulumi/aws/elasticsearch", "DomainPolicy")
  @js.native
  class DomainPolicy protected ()
    extends typings.pulumiAws.domainPolicyMod.DomainPolicy {
    /**
      * Create a DomainPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPolicyArgs) = this()
    def this(name: String, args: DomainPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainPolicy {
    
    @JSImport("@pulumi/aws/elasticsearch", "DomainPolicy")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.domainPolicyMod.DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPolicyMod.DomainPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.domainPolicyMod.DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPolicyMod.DomainPolicy]
    inline def get(name: String, id: Input[ID], state: DomainPolicyState): typings.pulumiAws.domainPolicyMod.DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPolicyMod.DomainPolicy]
    inline def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): typings.pulumiAws.domainPolicyMod.DomainPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.domainPolicyMod.DomainPolicy]
    
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean]
  }
  
  inline def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDomainResult]]
  inline def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDomainResult]]
}
