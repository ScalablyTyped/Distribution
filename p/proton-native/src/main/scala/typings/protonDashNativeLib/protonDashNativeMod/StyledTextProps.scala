package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledTextProps extends js.Object {
  var style: js.UndefOr[protonDashNativeLib.Anon_Auxiliary] = js.undefined
  /**
    * The x coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The y coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StyledTextProps {
  @scala.inline
  def apply(
    style: protonDashNativeLib.Anon_Auxiliary = null,
    x: scala.Double | java.lang.String = null,
    y: scala.Double | java.lang.String = null
  ): StyledTextProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledTextProps]
  }
}

