package typings.reactDashNativeDashNavigation.libDistInterfacesLayoutMod

import typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutStack extends js.Object {
  /**
    * Set children screens
    */
  var children: js.UndefOr[js.Array[LayoutStackChildren]] = js.undefined
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set options
    */
  var options: js.UndefOr[Options] = js.undefined
}

object LayoutStack {
  @scala.inline
  def apply(children: js.Array[LayoutStackChildren] = null, id: String = null, options: Options = null): LayoutStack = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[LayoutStack]
  }
}

