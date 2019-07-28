package typings.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: js.Array[String]
}

object Anon_Headers {
  @scala.inline
  def apply(headers: js.Array[String]): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

