package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.anon.Message
  - typings.reactNative.anon.Title
*/
trait ShareContent extends js.Object

object ShareContent {
  @scala.inline
  def Message(message: String): ShareContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def Title(url: String): ShareContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

