package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var contentType: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, contentType: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, contentType = contentType)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

