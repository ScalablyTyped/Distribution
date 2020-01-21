package typings.promiseSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEcho extends js.Object {
  /** Whether the user's input should be displayed on-screen */
  var echo: Boolean
  /** The query to pose to the user */
  var prompt: String
}

object AnonEcho {
  @scala.inline
  def apply(echo: Boolean, prompt: String): AnonEcho = {
    val __obj = js.Dynamic.literal(echo = echo.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEcho]
  }
}

