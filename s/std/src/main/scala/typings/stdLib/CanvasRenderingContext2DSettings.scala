package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRenderingContext2DSettings extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
}

object CanvasRenderingContext2DSettings {
  @scala.inline
  def apply(alpha: js.UndefOr[scala.Boolean] = js.undefined): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
}

