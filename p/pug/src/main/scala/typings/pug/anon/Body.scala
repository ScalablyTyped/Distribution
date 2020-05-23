package typings.pug.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var dependencies: js.Array[String]
}

object Body {
  @scala.inline
  def apply(body: String, dependencies: js.Array[String]): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

