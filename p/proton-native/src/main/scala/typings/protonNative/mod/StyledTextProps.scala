package typings.protonNative.mod

import typings.protonNative.anon.BackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledTextProps extends js.Object {
  var style: js.UndefOr[BackgroundColor] = js.undefined
  /**
    * The x coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var x: js.UndefOr[Double | String] = js.undefined
  /**
    * The y coordinate of the text's top left corner. (Only in a top level text component.)
    */
  var y: js.UndefOr[Double | String] = js.undefined
}

object StyledTextProps {
  @scala.inline
  def apply(style: BackgroundColor = null, x: Double | String = null, y: Double | String = null): StyledTextProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledTextProps]
  }
}

