package typings.prosemirrorDashDropcursor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[String | Null] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: String = null, width: Int | Double = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

