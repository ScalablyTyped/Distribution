package typings.atStorybookComponents.distScrollAreaScrollAreaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollProps
  extends /* key */ StringDictionary[js.Any] {
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ScrollProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ScrollProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ScrollProps]
  }
}

