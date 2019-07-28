package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNavigation.Anon_ActionKey
import typings.reactDashNavigation.Anon_Immediate
import typings.reactDashNavigation.Anon_ParamsP
import typings.std.NonNullable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationScreenProp[S, P] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: S with Anon_ParamsP[P] = js.native
  def addListener(eventName: EventType, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def closeDrawer(): js.Any = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[S, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  def getParam[T /* <: String */](param: T): /* import warning: ImportType.apply Failed type conversion: P[T] */ js.Any = js.native
  def getParam[T /* <: String */](
    param: T,
    fallback: NonNullable[/* import warning: ImportType.apply Failed type conversion: P[T] */ js.Any]
  ): NonNullable[/* import warning: ImportType.apply Failed type conversion: P[T] */ js.Any] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFocused(): Boolean = js.native
  def navigate(options: Anon_ActionKey): Boolean = js.native
  def navigate(routeNameOrOptions: String): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams): Boolean = js.native
  def navigate(routeNameOrOptions: String, params: NavigationParams, action: NavigationAction): Boolean = js.native
  def openDrawer(): js.Any = js.native
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Anon_Immediate): Boolean = js.native
  def popToTop(): Boolean = js.native
  def popToTop(params: Anon_Immediate): Boolean = js.native
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def setParams(newParams: Partial[P]): Boolean = js.native
  def toggleDrawer(): js.Any = js.native
}

