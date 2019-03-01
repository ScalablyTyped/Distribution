package typings
package reactDashTableLib.libHocSelectTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectTableHOCOptions extends js.Object {
  /**
    * Default: false
    */
  var floatingLeft: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectTableHOCOptions {
  @scala.inline
  def apply(floatingLeft: js.UndefOr[scala.Boolean] = js.undefined): SelectTableHOCOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(floatingLeft)) __obj.updateDynamic("floatingLeft")(floatingLeft)
    __obj.asInstanceOf[SelectTableHOCOptions]
  }
}

