package typings.reactDashColor.libComponentsCommonCheckboardMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
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
    ref: LegacyRef[Checkboard] = null,
    size: Int | Double = null,
    white: String = null
  ): CheckboardProps = {
    val __obj = js.Dynamic.literal()
    if (grey != null) __obj.updateDynamic("grey")(grey)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white)
    __obj.asInstanceOf[CheckboardProps]
  }
}

