package typings
package atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPrivateVirtualInterfaceAccepterArgs extends js.Object {
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the virtual private gateway to which to connect the virtual interface.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

