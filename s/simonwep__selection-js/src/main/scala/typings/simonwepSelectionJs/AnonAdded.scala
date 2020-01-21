package typings.simonwepSelectionJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: js.Array[Element]
  var removed: js.Array[Element]
}

object AnonAdded {
  @scala.inline
  def apply(added: js.Array[Element], removed: js.Array[Element]): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdded]
  }
}

