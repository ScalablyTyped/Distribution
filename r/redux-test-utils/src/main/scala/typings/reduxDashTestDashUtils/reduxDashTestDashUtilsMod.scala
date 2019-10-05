package typings.reduxDashTestDashUtils

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import typings.redux.reduxMod.Store
import typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod.mockDispatch
import typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod.mockStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-test-utils", JSImport.Namespace)
@js.native
object reduxDashTestDashUtilsMod extends js.Object {
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.reduxDashTestDashUtils.reduxDashTestDashUtilsMod.mockDispatch because var conflicts: dispatch_Original. Inlined getActions, getAction, isActionTypeDispatched, isActionDispatched */ @js.native
  trait mockStore[S] extends Store[S, AnyAction] {
    def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
    def getActions(): js.Array[AnyAction] = js.native
    def isActionDispatched(action: AnyAction): Boolean = js.native
    def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
  }
  
  def createMockDispatch(): mockDispatch[_] = js.native
  def createMockStore(): mockStore[_] = js.native
  def createMockStore(state: js.Any): mockStore[_] = js.native
}

