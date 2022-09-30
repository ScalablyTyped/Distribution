package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/rntypes", "NavigatorIOS")
@js.native
open class NavigatorIOS protected ()
  extends Component[NavigatorIOSProps, js.Object, Any] {
  def this(props: NavigatorIOSProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NavigatorIOSProps, context: Any) = this()
  
  /**
    * Go back one page
    */
  def pop(): Unit = js.native
  
  /**
    * Go back N pages at once. When N=1, behavior matches pop()
    */
  def popN(n: Double): Unit = js.native
  
  /**
    * Go back to the item for a particular route object
    */
  def popToRoute(route: Route): Unit = js.native
  
  /**
    * Go back to the top item
    */
  def popToTop(): Unit = js.native
  
  /**
    * Navigate forward to a new route
    */
  def push(route: Route): Unit = js.native
  
  /**
    * Replace the route for the current page and immediately load the view for the new route
    */
  def replace(route: Route): Unit = js.native
  
  /**
    * Replace the route/view for the previous page
    */
  def replacePrevious(route: Route): Unit = js.native
  
  /**
    * Replaces the previous route/view and transitions back to it
    */
  def replacePreviousAndPop(route: Route): Unit = js.native
  
  /**
    * Replaces the top item and popToTop
    */
  def resetTo(route: Route): Unit = js.native
}
