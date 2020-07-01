package typings.rootAsn1.anon

import typings.rootAsn1.rootAsn1Booleans.`true`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DerJson extends js.Object {
  var der: Uint8Array
  var json: js.UndefOr[`true`] = js.undefined
  var verbose: `true`
}

object DerJson {
  @scala.inline
  def apply(der: Uint8Array, verbose: `true`, json: `true` = null): DerJson = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerJson]
  }
}

