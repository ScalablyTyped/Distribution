package typings.raygun4js

import typings.raygun4js.mod.RaygunStackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var ClassName: String
  var Message: String
  var StackTrace: js.Array[RaygunStackTrace]
}

object AnonClassName {
  @scala.inline
  def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): AnonClassName = {
    val __obj = js.Dynamic.literal(ClassName = ClassName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], StackTrace = StackTrace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassName]
  }
}

