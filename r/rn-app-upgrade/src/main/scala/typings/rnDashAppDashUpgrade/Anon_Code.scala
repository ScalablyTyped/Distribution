package typings.rnDashAppDashUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var msg: String
  var version: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, msg: String, version: js.UndefOr[scala.Nothing] = js.undefined): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

