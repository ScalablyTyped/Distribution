package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var ClassName: java.lang.String
  var Message: java.lang.String
  var StackTrace: js.Array[raygun4jsLib.raygun4jsMod.RaygunStackTrace]
}

object Anon_ClassName {
  @scala.inline
  def apply(
    ClassName: java.lang.String,
    Message: java.lang.String,
    StackTrace: js.Array[raygun4jsLib.raygun4jsMod.RaygunStackTrace]
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClassName")(ClassName)
    __obj.updateDynamic("Message")(Message)
    __obj.updateDynamic("StackTrace")(StackTrace)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

