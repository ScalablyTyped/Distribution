package typings.promiseFs.anon

import typings.promiseFs.promiseFsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: `true`
}

object `1` {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: js.UndefOr[Null | String] = js.undefined): `1` = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

