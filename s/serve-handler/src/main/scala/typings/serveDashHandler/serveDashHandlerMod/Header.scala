package typings.serveDashHandler.serveDashHandlerMod

import typings.serveDashHandler.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var headers: js.Array[Anon_Key]
  var source: String
}

object Header {
  @scala.inline
  def apply(headers: js.Array[Anon_Key], source: String): Header = {
    val __obj = js.Dynamic.literal(headers = headers, source = source)
  
    __obj.asInstanceOf[Header]
  }
}

