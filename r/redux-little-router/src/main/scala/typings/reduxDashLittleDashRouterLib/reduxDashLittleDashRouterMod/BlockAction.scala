package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockAction extends RouterActions {
  @JSName("payload")
  var payload_Original: BlockCallback = js.native
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_BLOCK = js.native
  def payload(location: Location): java.lang.String = js.native
  def payload(location: Location, action: HistoryAction): java.lang.String = js.native
}

