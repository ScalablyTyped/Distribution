package typings.reactColor.checkboardMod

import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboardProps extends ClassAttributes[Checkboard] {
  var grey: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var white: js.UndefOr[String] = js.undefined
}

object CheckboardProps {
  @scala.inline
  def apply(
    grey: String = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[Checkboard]] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    white: String = null
  ): CheckboardProps = {
    val __obj = js.Dynamic.literal()
    if (grey != null) __obj.updateDynamic("grey")(grey.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboardProps]
  }
}

