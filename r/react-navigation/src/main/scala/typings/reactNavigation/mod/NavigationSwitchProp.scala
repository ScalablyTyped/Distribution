package typings.reactNavigation.mod

import typings.reactNavigation.anon.Key
import typings.reactNavigation.anon.`0`
import typings.reactNavigation.reactNavigationStrings.refocus
import typings.std.NonNullable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {jumpTo (routeName : string, key : string | undefined): void} */
@js.native
trait NavigationSwitchProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with `0`[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: /* keyof Params */ String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: /* keyof Params */ String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any
  ] = js.native
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  def isFirstRouteInParent(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def jumpTo(routeName: String): Unit = js.native
  def jumpTo(routeName: String, key: String): Unit = js.native
  def navigate[T /* <: NavigationParams */](options: Key[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: js.UndefOr[scala.Nothing], action: NavigationAction): Boolean = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
}

