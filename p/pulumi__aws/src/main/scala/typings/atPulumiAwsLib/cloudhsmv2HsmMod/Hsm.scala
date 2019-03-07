package typings
package atPulumiAwsLib.cloudhsmv2HsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2/hsm", "Hsm")
@js.native
class Hsm protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Hsm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: HsmArgs) = this()
  def this(name: java.lang.String, args: HsmArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the ENI interface allocated for HSM module.
    */
  val hsmEniId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the HSM module.
    */
  val hsmId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The state of the HSM module.
    */
  val hsmState: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudhsmv2/hsm", "Hsm")
@js.native
object Hsm extends js.Object {
  /**
    * Get an existing Hsm resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState
  ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudhsmv2HsmMod.HsmState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudhsmv2HsmMod.Hsm = js.native
}

