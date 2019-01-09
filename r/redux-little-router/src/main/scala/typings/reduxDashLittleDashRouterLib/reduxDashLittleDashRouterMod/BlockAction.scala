package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockAction extends js.Object {
  @JSName("payload")
  var payload_Original: reduxDashLittleDashRouterLib.BlockCallback = js.native
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_BLOCK = js.native
  def payload(location: stdLib.Location): java.lang.String = js.native
  def payload(location: stdLib.Location, action: reduxDashLittleDashRouterLib.HistoryAction): java.lang.String = js.native
}

