package typings
package reactDashPlyrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Controls extends js.Object {
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var seek: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Controls {
  @scala.inline
  def apply(controls: js.UndefOr[scala.Boolean] = js.undefined, seek: js.UndefOr[scala.Boolean] = js.undefined): Anon_Controls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(seek)) __obj.updateDynamic("seek")(seek)
    __obj.asInstanceOf[Anon_Controls]
  }
}

