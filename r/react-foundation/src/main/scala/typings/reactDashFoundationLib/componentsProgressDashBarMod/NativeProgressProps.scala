package typings
package reactDashFoundationLib.componentsProgressDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactLib.reactMod.ReactNs.ProgressHTMLAttributes because var conflicts: className. Inlined max, value */ trait NativeProgressProps
  extends reactDashFoundationLib.utilsMod.FlexboxPropTypes {
  var color: js.UndefOr[reactDashFoundationLib.enumsMod.ProgressColors] = js.undefined
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String] | scala.Double | java.lang.String] = js.undefined
}

object NativeProgressProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    ProgressHTMLAttributes: reactLib.reactMod.ReactNs.ProgressHTMLAttributes[reactLib.HTMLProgressElement] = null,
    color: reactDashFoundationLib.enumsMod.ProgressColors = null,
    max: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): NativeProgressProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, ProgressHTMLAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeProgressProps]
  }
}

