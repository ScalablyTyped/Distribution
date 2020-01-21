package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
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
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutStack]
  }
}

