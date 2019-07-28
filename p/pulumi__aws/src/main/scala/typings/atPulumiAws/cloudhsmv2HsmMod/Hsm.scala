package typings.atPulumiAws.cloudhsmv2HsmMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2/hsm", "Hsm")
@js.native
class Hsm protected () extends CustomResource {
  /**
    * Create a Hsm resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HsmArgs) = this()
  def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
  /**
    * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The ID of Cloud HSM v2 cluster to which HSM will be added.
    */
  val clusterId: Output[String] = js.native
  /**
    * The id of the ENI interface allocated for HSM module.
    */
  val hsmEniId: Output[String] = js.native
  /**
    * The id of the HSM module.
    */
  val hsmId: Output[String] = js.native
  /**
    * The state of the HSM module.
    */
  val hsmState: Output[String] = js.native
  /**
    * The IP address of HSM module. Must be within the CIDR of selected subnet.
    */
  val ipAddress: Output[String] = js.native
  /**
    * The ID of subnet in which HSM module will be located.
    */
  val subnetId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): Hsm = js.native
  def get(name: String, id: Input[ID], state: HsmState): Hsm = js.native
  def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): Hsm = js.native
  /**
    * Returns true if the given object is an instance of Hsm.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = js.native
}

