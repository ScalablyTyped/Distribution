package typings
package reactDashColorLib.libComponentsCommonCheckboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboardProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[Checkboard] {
  var grey: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var white: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboardProps {
  @scala.inline
  def apply(
    grey: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[Checkboard] = null,
    size: scala.Int | scala.Double = null,
    white: java.lang.String = null
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

