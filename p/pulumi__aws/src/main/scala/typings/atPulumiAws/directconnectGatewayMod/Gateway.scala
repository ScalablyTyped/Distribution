package typings.atPulumiAws.directconnectGatewayMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/gateway", "Gateway")
@js.native
class Gateway protected () extends CustomResource {
  /**
    * Create a Gateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayArgs) = this()
  def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
    */
  val amazonSideAsn: Output[String] = js.native
  /**
    * The name of the connection.
    */
  val name: Output[String] = js.native
  /**
    * AWS Account ID of the gateway.
    */
  val ownerAccountId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/gateway", "Gateway")
@js.native
object Gateway extends js.Object {
  /**
    * Get an existing Gateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState): Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): Gateway = js.native
  /**
    * Returns true if the given object is an instance of Gateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = js.native
}

