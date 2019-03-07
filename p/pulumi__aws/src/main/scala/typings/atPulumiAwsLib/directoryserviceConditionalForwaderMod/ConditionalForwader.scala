package typings
package atPulumiAwsLib.directoryserviceConditionalForwaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader")
@js.native
class ConditionalForwader protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ConditionalForwader resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ConditionalForwaderArgs) = this()
  def this(name: java.lang.String, args: ConditionalForwaderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The id of directory.
    */
  val directoryId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader")
@js.native
object ConditionalForwader extends js.Object {
  /**
    * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directoryserviceConditionalForwaderMod.ConditionalForwaderState
  ): atPulumiAwsLib.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directoryserviceConditionalForwaderMod.ConditionalForwaderState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
}

