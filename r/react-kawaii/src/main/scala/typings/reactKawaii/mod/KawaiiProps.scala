package typings.reactKawaii.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KawaiiProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var mood: js.UndefOr[KawaiiMood] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object KawaiiProps {
  @scala.inline
  def apply(color: String = null, mood: KawaiiMood = null, size: Int | Double = null): KawaiiProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (mood != null) __obj.updateDynamic("mood")(mood.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KawaiiProps]
  }
}

