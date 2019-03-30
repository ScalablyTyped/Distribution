package typings
package rashaLib.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportOptions extends js.Object {
  var format: java.lang.String
  var jwk: Jwk
  var public: scala.Boolean
}

object ExportOptions {
  @scala.inline
  def apply(format: java.lang.String, jwk: Jwk, public: scala.Boolean): ExportOptions = {
    val __obj = js.Dynamic.literal(format = format, jwk = jwk, public = public)
  
    __obj.asInstanceOf[ExportOptions]
  }
}

