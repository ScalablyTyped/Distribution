package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutComponent[P] extends js.Object {
  /**
    * Component reference id, Auto generated if empty
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of your component
    */
  var name: java.lang.String | scala.Double
  /**
    * Styling options
    */
  var options: js.UndefOr[reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options] = js.undefined
  /**
    * Properties to pass down to the component
    */
  var passProps: js.UndefOr[P] = js.undefined
}

