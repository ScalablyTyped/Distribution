package typings.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportOptions extends js.Object {
  var format: String
  var jwk: Jwk
  var public: Boolean
}

object ExportOptions {
  @scala.inline
  def apply(format: String, jwk: Jwk, public: Boolean): ExportOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jwk = jwk.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportOptions]
  }
}

