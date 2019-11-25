package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var contentType: String
}

object Anon_Body {
  @scala.inline
  def apply(body: String, contentType: String): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

