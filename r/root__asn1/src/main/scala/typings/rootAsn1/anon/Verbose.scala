package typings.rootAsn1.anon

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verbose extends js.Object {
  var der: Uint8Array
  var json: `false`
  var verbose: js.UndefOr[`false`] = js.undefined
}

object Verbose {
  @scala.inline
  def apply(der: Uint8Array, json: `false`, verbose: `false` = null): Verbose = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verbose]
  }
}

