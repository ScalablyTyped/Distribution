package typings.reactDashOnclickoutside.reactDashOnclickoutsideMod

import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigObject extends js.Object {
  var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
  var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object ConfigObject {
  @scala.inline
  def apply(
    excludeScrollbar: js.UndefOr[Boolean] = js.undefined,
    handleClickOutside: MouseEventHandler[_] = null
  ): ConfigObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeScrollbar)) __obj.updateDynamic("excludeScrollbar")(excludeScrollbar)
    if (handleClickOutside != null) __obj.updateDynamic("handleClickOutside")(handleClickOutside)
    __obj.asInstanceOf[ConfigObject]
  }
}

