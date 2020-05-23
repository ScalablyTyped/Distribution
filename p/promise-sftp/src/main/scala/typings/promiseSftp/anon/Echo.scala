package typings.promiseSftp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Echo extends js.Object {
  /** Whether the user's input should be displayed on-screen */
  var echo: Boolean
  /** The query to pose to the user */
  var prompt: String
}

object Echo {
  @scala.inline
  def apply(echo: Boolean, prompt: String): Echo = {
    val __obj = js.Dynamic.literal(echo = echo.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Echo]
  }
}

