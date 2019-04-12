package typings
package reactDashSketchappLib.libComponentsSvgStopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopProps extends js.Object {
  var children: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild
  ] = js.undefined
  var stopColor: js.UndefOr[java.lang.String] = js.undefined
  var stopOpacity: js.UndefOr[reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp] = js.undefined
}

object StopProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNs.ReactChild] | reactLib.reactMod.ReactNs.ReactChild = null,
    stopColor: java.lang.String = null,
    stopOpacity: reactDashSketchappLib.libComponentsSvgPropsMod.NumberProp = null
  ): StopProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor)
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProps]
  }
}

