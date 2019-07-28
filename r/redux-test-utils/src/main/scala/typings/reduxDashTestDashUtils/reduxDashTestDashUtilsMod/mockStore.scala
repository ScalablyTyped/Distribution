package typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod.mockDispatch because var conflicts: dispatch_Original. Inlined getActions, getAction, isActionTypeDispatched, isActionDispatched */ @js.native
trait mockStore[S] extends Store[S, AnyAction] {
  def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
  def getActions(): js.Array[AnyAction] = js.native
  def isActionDispatched(action: AnyAction): Boolean = js.native
  def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
}

