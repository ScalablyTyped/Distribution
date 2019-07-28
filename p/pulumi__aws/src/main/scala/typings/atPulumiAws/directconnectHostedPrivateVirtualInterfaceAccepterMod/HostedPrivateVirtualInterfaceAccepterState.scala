package typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPrivateVirtualInterfaceAccepterState extends js.Object {
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the virtual private gateway to which to connect the virtual interface.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
}

object HostedPrivateVirtualInterfaceAccepterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    dxGatewayId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualInterfaceId: Input[String] = null,
    vpnGatewayId: Input[String] = null
  ): HostedPrivateVirtualInterfaceAccepterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (dxGatewayId != null) __obj.updateDynamic("dxGatewayId")(dxGatewayId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPrivateVirtualInterfaceAccepterState]
  }
}

