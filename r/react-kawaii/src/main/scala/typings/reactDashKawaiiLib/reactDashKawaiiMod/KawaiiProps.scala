package typings
package reactDashKawaiiLib.reactDashKawaiiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KawaiiProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var mood: js.UndefOr[KawaiiMood] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object KawaiiProps {
  @scala.inline
  def apply(color: java.lang.String = null, mood: KawaiiMood = null, size: scala.Int | scala.Double = null): KawaiiProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (mood != null) __obj.updateDynamic("mood")(mood)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KawaiiProps]
  }
}

