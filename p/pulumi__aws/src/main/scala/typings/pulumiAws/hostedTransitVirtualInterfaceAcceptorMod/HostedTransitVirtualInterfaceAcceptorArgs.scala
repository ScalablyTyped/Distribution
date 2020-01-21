package typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedTransitVirtualInterfaceAcceptorArgs extends js.Object {
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Input[String] = js.native
}

object HostedTransitVirtualInterfaceAcceptorArgs {
  @scala.inline
  def apply(
    dxGatewayId: Input[String],
    virtualInterfaceId: Input[String],
    tags: Input[StringDictionary[_]] = null
  ): HostedTransitVirtualInterfaceAcceptorArgs = {
    val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedTransitVirtualInterfaceAcceptorArgs]
  }
}

