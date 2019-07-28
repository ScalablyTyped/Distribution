package typings.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var headers: js.Any
  var status: Double
}

object Anon_Body {
  @scala.inline
  def apply(body: String, headers: js.Any, status: Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

