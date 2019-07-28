package typings.pug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String
  var dependencies: js.Array[String]
}

object Anon_Body {
  @scala.inline
  def apply(body: String, dependencies: js.Array[String]): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, dependencies = dependencies)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

