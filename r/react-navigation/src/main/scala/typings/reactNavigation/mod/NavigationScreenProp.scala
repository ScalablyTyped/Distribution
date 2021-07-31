package typings.reactNavigation.mod

import typings.reactNavigation.anon.RouteName
import typings.reactNavigation.anon.`1`
import typings.reactNavigation.reactNavigationStrings.refocus
import typings.std.NonNullable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationScreenProp[S, P] extends StObject {
  
  def addListener(eventName: String, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  
  def dangerouslyGetParent(): js.UndefOr[NavigationScreenProp[S, NavigationParams]] = js.native
  
  def dismiss(): Boolean = js.native
  
  var dispatch: NavigationDispatch = js.native
  
  @JSName("emit")
  def emit_refocus(eventName: refocus): Unit = js.native
  
  def getParam[T /* <: /* keyof P */ String */](param: T): /* import warning: importer.ImportType#apply Failed type conversion: P[T] */ js.Any = js.native
  def getParam[T /* <: /* keyof P */ String */](
    param: T,
    fallback: NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: P[T] */ js.Any
    ]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: P[T] */ js.Any
  ] = js.native
  
  def goBack(): Boolean = js.native
  def goBack(routeKey: String): Boolean = js.native
  
  def isFirstRouteInParent(): Boolean = js.native
  
  def isFocused(): Boolean = js.native
  
  def navigate[T /* <: NavigationParams */](options: RouteName[T]): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: T, action: NavigationAction): Boolean = js.native
  def navigate[T /* <: NavigationParams */](routeNameOrOptions: String, params: Unit, action: NavigationAction): Boolean = js.native
  
  var router: js.UndefOr[NavigationRouter[NavigationState, js.Object]] = js.native
  
  def setParams(newParams: Partial[P]): Boolean = js.native
  
  var state: S & `1`[P] = js.native
}
