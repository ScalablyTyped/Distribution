package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.Anon_Message
  - typings.reactDashNative.Anon_Title
*/
trait ShareContent extends js.Object

object ShareContent {
  @scala.inline
  def Anon_Message(message: String, title: String = null): ShareContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def Anon_Title(url: String, title: String = null): ShareContent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

