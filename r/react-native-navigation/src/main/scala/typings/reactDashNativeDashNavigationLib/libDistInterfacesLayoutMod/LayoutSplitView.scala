package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutSplitView extends js.Object {
  /**
    * Set detail layout (the larger screen, flexes)
    */
  var detail: js.UndefOr[Layout[js.Object]] = js.undefined
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set master layout (the smaller screen, sidebar)
    */
  var master: js.UndefOr[Layout[js.Object]] = js.undefined
  /**
    * Configure split view
    */
  var options: js.UndefOr[reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options] = js.undefined
}

object LayoutSplitView {
  @scala.inline
  def apply(
    detail: Layout[js.Object] = null,
    id: java.lang.String = null,
    master: Layout[js.Object] = null,
    options: reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod.Options = null
  ): LayoutSplitView = {
    val __obj = js.Dynamic.literal()
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (id != null) __obj.updateDynamic("id")(id)
    if (master != null) __obj.updateDynamic("master")(master)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LayoutSplitView]
  }
}

