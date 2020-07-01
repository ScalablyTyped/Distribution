package typings.rootAsn1.anon

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.rootAsn1.rootAsn1Booleans.`true`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonVerbose extends js.Object {
  var der: Uint8Array
  var json: `false`
  var verbose: `true`
}

object JsonVerbose {
  @scala.inline
  def apply(der: Uint8Array, json: `false`, verbose: `true`): JsonVerbose = {
    val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonVerbose]
  }
}

