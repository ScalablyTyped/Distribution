package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.elasticsearchDomainMod.DomainArgs
import typings.atPulumiAws.elasticsearchDomainMod.DomainState
import typings.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicyArgs
import typings.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicyState
import typings.atPulumiAws.elasticsearchGetDomainMod.GetDomainArgs
import typings.atPulumiAws.elasticsearchGetDomainMod.GetDomainResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticsearch")
@js.native
object elasticsearch extends js.Object {
  @js.native
  class Domain protected ()
    extends typings.atPulumiAws.elasticsearchMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainPolicy protected ()
    extends typings.atPulumiAws.elasticsearchMod.DomainPolicy {
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
  
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] with GetDomainResult = js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] with GetDomainResult = js.native
  /* static members */
  @js.native
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typings.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typings.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainPolicy extends js.Object {
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState): typings.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
  }
  
}

