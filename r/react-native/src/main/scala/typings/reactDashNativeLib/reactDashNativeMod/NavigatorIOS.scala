package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "NavigatorIOS")
@js.native
class NavigatorIOS ()
  extends reactLib.reactMod.Component[NavigatorIOSProps, js.Object, js.Any] {
  /**
    * Go back one page
    */
  def pop(): scala.Unit = js.native
  /**
    * Go back N pages at once. When N=1, behavior matches pop()
    */
  def popN(n: scala.Double): scala.Unit = js.native
  /**
    * Go back to the item for a particular route object
    */
  def popToRoute(route: Route): scala.Unit = js.native
  /**
    * Go back to the top item
    */
  def popToTop(): scala.Unit = js.native
  /**
    * Navigate forward to a new route
    */
  def push(route: Route): scala.Unit = js.native
  /**
    * Replace the route for the current page and immediately load the view for the new route
    */
  def replace(route: Route): scala.Unit = js.native
  /**
    * Replace the route/view for the previous page
    */
  def replacePrevious(route: Route): scala.Unit = js.native
  /**
    * Replaces the previous route/view and transitions back to it
    */
  def replacePreviousAndPop(route: Route): scala.Unit = js.native
  /**
    * Replaces the top item and popToTop
    */
  def resetTo(route: Route): scala.Unit = js.native
}

