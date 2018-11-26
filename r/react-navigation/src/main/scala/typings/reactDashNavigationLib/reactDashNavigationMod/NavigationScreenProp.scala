package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationScreenProp[S, P] extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: S with reactDashNavigationLib.Anon_Params[P] = js.native
  @JSName("addListener")
  def addListener_didBlur(
    eventName: reactDashNavigationLib.reactDashNavigationLibStrings.didBlur,
    callback: NavigationEventCallback
  ): NavigationEventSubscription = js.native
  @JSName("addListener")
  def addListener_didFocus(
    eventName: reactDashNavigationLib.reactDashNavigationLibStrings.didFocus,
    callback: NavigationEventCallback
  ): NavigationEventSubscription = js.native
  @JSName("addListener")
  def addListener_willBlur(
    eventName: reactDashNavigationLib.reactDashNavigationLibStrings.willBlur,
    callback: NavigationEventCallback
  ): NavigationEventSubscription = js.native
  @JSName("addListener")
  def addListener_willFocus(
    eventName: reactDashNavigationLib.reactDashNavigationLibStrings.willFocus,
    callback: NavigationEventCallback
  ): NavigationEventSubscription = js.native
  def closeDrawer(): js.Any = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[S, NavigationParams]] = js.native
  def dismiss(): scala.Boolean = js.native
  def dispatch(action: NavigationAction): scala.Boolean = js.native
  def getParam[T /* <: java.lang.String */](param: T): /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List()),Left(TsIdentSimple(T))) */js.Any = js.native
  def getParam[T /* <: java.lang.String */](
    param: T,
    fallback: stdLib.NonNullable[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List()),Left(TsIdentSimple(T))) */js.Any
    ]
  ): stdLib.NonNullable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(P))),List()),Left(TsIdentSimple(T))) */js.Any
  ] = js.native
  def goBack(): scala.Boolean = js.native
  def goBack(routeKey: java.lang.String): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def navigate(options: reactDashNavigationLib.Anon_ActionKey): scala.Boolean = js.native
  def navigate(routeNameOrOptions: java.lang.String): scala.Boolean = js.native
  def navigate(routeNameOrOptions: java.lang.String, params: NavigationParams): scala.Boolean = js.native
  def navigate(routeNameOrOptions: java.lang.String, params: NavigationParams, action: NavigationAction): scala.Boolean = js.native
  def openDrawer(): js.Any = js.native
  def pop(): scala.Boolean = js.native
  def pop(n: scala.Double): scala.Boolean = js.native
  def pop(n: scala.Double, params: reactDashNavigationLib.Anon_Immediate): scala.Boolean = js.native
  def popToTop(): scala.Boolean = js.native
  def popToTop(params: reactDashNavigationLib.Anon_Immediate): scala.Boolean = js.native
  def push(routeName: java.lang.String): scala.Boolean = js.native
  def push(routeName: java.lang.String, params: NavigationParams): scala.Boolean = js.native
  def push(routeName: java.lang.String, params: NavigationParams, action: NavigationNavigateAction): scala.Boolean = js.native
  def replace(routeName: java.lang.String): scala.Boolean = js.native
  def replace(routeName: java.lang.String, params: NavigationParams): scala.Boolean = js.native
  def replace(routeName: java.lang.String, params: NavigationParams, action: NavigationNavigateAction): scala.Boolean = js.native
  def setParams(newParams: stdLib.Partial[P]): scala.Boolean = js.native
  def toggleDrawer(): js.Any = js.native
}

