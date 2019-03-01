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

object LayoutComponent {
  @scala.inline
  def apply[P](
    name: java.lang.String | scala.Double,
    id: java.lang.String = null,
    options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options = null,
    passProps: P = null
  ): LayoutComponent[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    if (passProps != null) __obj.updateDynamic("passProps")(passProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutComponent[P]]
  }
}

