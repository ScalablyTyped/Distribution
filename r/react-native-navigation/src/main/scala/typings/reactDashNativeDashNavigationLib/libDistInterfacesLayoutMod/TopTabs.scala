package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopTabs extends js.Object {
  /**
    * Set the children screens
    */
  var children: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Set the layout's id so Navigation.mergeOptions can be used to update options
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Configure top tabs
    */
  var options: js.UndefOr[reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options] = js.undefined
}

object TopTabs {
  @scala.inline
  def apply(
    children: js.Array[_] = null,
    id: java.lang.String = null,
    options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options = null
  ): TopTabs = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TopTabs]
  }
}

