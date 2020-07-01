package typings.rootAsn1.anon

import typings.rootAsn1.rootAsn1Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  var json: js.UndefOr[`false`] = js.undefined
}

object Json {
  @scala.inline
  def apply(json: `false` = null): Json = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
}

