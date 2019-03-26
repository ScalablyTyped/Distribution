package typings
package reduxDashTestDashUtilsLib.reduxDashTestDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reduxDashTestDashUtilsLib.reduxDashTestDashUtilsMod.mockDispatch because var conflicts: dispatch_Original. Inlined getActions, getAction, isActionTypeDispatched, isActionDispatched */ @js.native
trait mockStore[S]
  extends reduxLib.reduxMod.Store[S, reduxLib.reduxMod.AnyAction] {
  def getAction(`type`: js.Any): js.UndefOr[reduxLib.reduxMod.AnyAction] = js.native
  def getActions(): js.Array[reduxLib.reduxMod.AnyAction] = js.native
  def isActionDispatched(action: reduxLib.reduxMod.AnyAction): scala.Boolean = js.native
  def isActionTypeDispatched(`type`: js.Any): scala.Boolean = js.native
}

