package typings.rasha.rashaMod

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
    val __obj = js.Dynamic.literal(format = format, jwk = jwk, public = public)
  
    __obj.asInstanceOf[ExportOptions]
  }
}

