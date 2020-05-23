package typings.promiseFs.anon

import typings.promiseFs.promiseFsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object `0` {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined, withFileTypes: `false` = null): `0` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

