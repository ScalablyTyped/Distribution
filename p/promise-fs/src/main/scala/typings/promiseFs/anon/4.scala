package typings.promiseFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
}

object `4` {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined): `4` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
}

