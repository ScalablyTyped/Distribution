package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Supported extends js.Object {
  var supported: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Supported {
  @scala.inline
  def apply(supported: js.UndefOr[scala.Boolean] = js.undefined): Anon_Supported = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(supported)) __obj.updateDynamic("supported")(supported)
    __obj.asInstanceOf[Anon_Supported]
  }
}

