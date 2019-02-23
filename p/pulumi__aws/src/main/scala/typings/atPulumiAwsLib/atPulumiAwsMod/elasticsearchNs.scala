package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "elasticsearch")
@js.native
object elasticsearchNs extends js.Object {
  @js.native
  class Domain protected ()
    extends atPulumiAwsLib.elasticsearchMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticsearchDomainMod.DomainArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticsearchDomainMod.DomainArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainPolicy protected ()
    extends atPulumiAwsLib.elasticsearchMod.DomainPolicy {
    /**
      * Create a DomainPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticsearchDomainMod.DomainState
    ): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticsearchDomainMod.DomainState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicyState
    ): atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.elasticsearchDomainPolicyMod.DomainPolicy = js.native
  }
  
}

