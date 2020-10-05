package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigation.anon.Key
import typings.reactNavigation.anon.`2`
import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationDispatch
import typings.reactNavigation.mod.NavigationEventCallback
import typings.reactNavigation.mod.NavigationEventSubscription
import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRouter
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.anon.Immediate
import typings.reactNavigationStack.reactNavigationStackStrings.refocus
import typings.std.NonNullable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.NavigationScreenProp<State, Params> & {push (routeName : string, params : react-navigation.react-navigation.NavigationParams | undefined, action : react-navigation.react-navigation.NavigationNavigateAction | undefined): boolean, replace (routeName : string, params : react-navigation.react-navigation.NavigationParams | undefined, action : react-navigation.react-navigation.NavigationNavigateAction | undefined): boolean, reset (actions : std.Array<react-navigation.react-navigation.NavigationAction>, index : number): boolean, pop (n : number | undefined, params : {  immediate :boolean | undefined} | undefined): boolean, popToTop (params : {  immediate :boolean | undefined} | undefined): boolean, addListener (event : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.NavigationStackEventName, callback : react-navigation.react-navigation.NavigationEventCallback): react-navigation.react-navigation.NavigationEventSubscription} */
@js.native
trait StackNavigationProp[State, Params] extends js.Object {
  var dispatch: NavigationDispatch = js.native
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  var state: State with `2`[Params] = js.native
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
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
  def navigate[T /* <: NavigationParams */](options: Key[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: js.UndefOr[scala.Nothing], action: NavigationAction): Boolean = js.native
  def pop(): Boolean = js.native
  def pop(n: js.UndefOr[scala.Nothing], params: Immediate): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Immediate): Boolean = js.native
  def popToTop(): Boolean = js.native
  def popToTop(params: Immediate): Boolean = js.native
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: js.UndefOr[scala.Nothing], action: NavigationNavigateAction): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: js.UndefOr[scala.Nothing], action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
  def setParams(newParams: Partial[Params]): Boolean = js.native
}

