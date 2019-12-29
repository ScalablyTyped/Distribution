package typings.promiseDashFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: js.UndefOr[scala.Nothing] = js.undefined, flag: String = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

