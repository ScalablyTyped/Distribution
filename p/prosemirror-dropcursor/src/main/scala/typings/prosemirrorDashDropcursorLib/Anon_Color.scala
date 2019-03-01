package typings
package prosemirrorDashDropcursorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var width: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: java.lang.String = null, width: scala.Int | scala.Double = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

