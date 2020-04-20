package typings.scriptableIos.Notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var title: String
  var url: String
}

object Actions {
  @scala.inline
  def apply(title: String, url: String): Actions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

