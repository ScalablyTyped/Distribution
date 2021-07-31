package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationEventCallback
import typings.reactNavigation.mod.NavigationEventSubscription
import typings.reactNavigation.mod.NavigationNavigateAction
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationStack.anon.Immediate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackNavigationProp[State, Params]
  extends StObject
     with NavigationScreenProp[State, Params] {
  
  def addListener(event: NavigationStackEventName, callback: NavigationEventCallback): NavigationEventSubscription = js.native
  
  def pop(): Boolean = js.native
  def pop(n: Double): Boolean = js.native
  def pop(n: Double, params: Immediate): Boolean = js.native
  def pop(n: Unit, params: Immediate): Boolean = js.native
  
  def popToTop(): Boolean = js.native
  def popToTop(params: Immediate): Boolean = js.native
  
  def push(routeName: String): Boolean = js.native
  def push(routeName: String, params: Unit, action: NavigationNavigateAction): Boolean = js.native
  def push(routeName: String, params: NavigationParams): Boolean = js.native
  def push(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def replace(routeName: String): Boolean = js.native
  def replace(routeName: String, params: Unit, action: NavigationNavigateAction): Boolean = js.native
  def replace(routeName: String, params: NavigationParams): Boolean = js.native
  def replace(routeName: String, params: NavigationParams, action: NavigationNavigateAction): Boolean = js.native
  
  def reset(actions: js.Array[NavigationAction], index: Double): Boolean = js.native
}
