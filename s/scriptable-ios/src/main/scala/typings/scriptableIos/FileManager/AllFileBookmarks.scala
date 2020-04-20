package typings.scriptableIos.FileManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllFileBookmarks extends js.Object {
  var name: String
  var source: String
}

object AllFileBookmarks {
  @scala.inline
  def apply(name: String, source: String): AllFileBookmarks = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllFileBookmarks]
  }
}

