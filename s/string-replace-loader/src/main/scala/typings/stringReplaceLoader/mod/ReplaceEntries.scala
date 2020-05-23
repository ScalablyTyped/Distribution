package typings.stringReplaceLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceEntries extends Options {
  var multiple: js.Array[ReplaceEntry]
}

object ReplaceEntries {
  @scala.inline
  def apply(multiple: js.Array[ReplaceEntry]): ReplaceEntries = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceEntries]
  }
}

