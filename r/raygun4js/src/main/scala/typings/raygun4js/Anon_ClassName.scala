package typings.raygun4js

import typings.raygun4js.raygun4jsMod.RaygunStackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var ClassName: String
  var Message: String
  var StackTrace: js.Array[RaygunStackTrace]
}

object Anon_ClassName {
  @scala.inline
  def apply(ClassName: String, Message: String, StackTrace: js.Array[RaygunStackTrace]): Anon_ClassName = {
    val __obj = js.Dynamic.literal(ClassName = ClassName, Message = Message, StackTrace = StackTrace)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

