package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigation.AnonKey
import typings.reactNavigation.AnonParamsP
import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationDispatch
import typings.reactNavigation.mod.NavigationEventCallback
import typings.reactNavigation.mod.NavigationEventSubscription
import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.AnonImmediate
import typings.reactNavigationStack.reactNavigationStackStrings.refocus
import typings.std.NonNullable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {push (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, replace (routeName : string, params ? : react-navigation.react-navigation.NavigationParams, action ? : react-navigation.react-navigation.NavigationNavigateAction): boolean, reset (actions : std.Array<react-navigation.react-navigation.NavigationAction>, index : number): boolean, pop (n ? : number, params ? : {  immediate ? :boolean}): boolean, popToTop (params ? : {  immediate ? :boolean}): boolean, addListener (event : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.NavigationStackEventName, callback : react-navigation.react-navigation.NavigationEventCallback): react-navigation.react-navigation.NavigationEventSubscription} */
@js.native
trait StackNavigationProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with AnonParamsP[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  def dismiss(): Boolean = js.native
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  def getParam[T /* <: String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: Params[T] */ js.Any = js.native
  def getParam[T /* <: String */](
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
  def navigate[T /* <: NavigationParams */](options: AnonKey[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: AnonImmediate): Boolean = js.native
  def popToTop(): Boolean = js.native
  def popToTop(params: AnonImmediate): Boolean = js.native
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
}

