package typings.rootAsn1.anon

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.rootAsn1.rootAsn1Booleans.`true`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Der extends js.Object {
  var der: Uint8Array
  var json: js.UndefOr[`true`] = js.undefined
  var verbose: js.UndefOr[`false`] = js.undefined
}

object Der {
  @scala.inline
  def apply(der: Uint8Array, json: `true` = null, verbose: `false` = null): Der = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Der]
  }
}

