package typings.raygun4js.anon

import typings.raygun4js.mod.RaygunStackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var ClassName: String
  var Message: String
  var StackTrace: js.Array[RaygunStackTrace]
}

object ClassName {
  @scala.inline
  def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): ClassName = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StackTrace = StackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

