package typings.reactDashInlinesvg.reactDashInlinesvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageItem extends js.Object {
  var content: String
  var queue: js.Array[_]
  var status: String
}

object IStorageItem {
  @scala.inline
  def apply(content: String, queue: js.Array[_], status: String): IStorageItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStorageItem]
  }
}

