package typings
package reduxDashTestDashUtilsLib.reduxDashTestDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait mockDispatch[S] extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: reduxLib.reduxMod.Dispatch[S] = js.native
  def dispatch[T /* <: S */](action: T): T = js.native
  def getAction(`type`: js.Any): js.UndefOr[reduxLib.reduxMod.AnyAction] = js.native
  def getActions(): js.Array[reduxLib.reduxMod.AnyAction] = js.native
  def isActionDispatched(action: reduxLib.reduxMod.AnyAction): scala.Boolean = js.native
  def isActionTypeDispatched(`type`: js.Any): scala.Boolean = js.native
}

