package typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait mockDispatch[S] extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: Dispatch[S] = js.native
  def dispatch[T /* <: S */](action: T): T = js.native
  def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
  def getActions(): js.Array[AnyAction] = js.native
  def isActionDispatched(action: AnyAction): Boolean = js.native
  def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
}

