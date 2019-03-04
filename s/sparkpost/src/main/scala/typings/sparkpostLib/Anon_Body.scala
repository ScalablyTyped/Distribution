package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var headers: js.Any
  var status: scala.Double
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, headers: js.Any, status: scala.Double): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

