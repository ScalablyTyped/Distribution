package typings.promisedLdap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries extends js.Object {
  var entries: js.Array[_]
  var references: js.Array[_]
}

object AnonEntries {
  @scala.inline
  def apply(entries: js.Array[_], references: js.Array[_]): AnonEntries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntries]
  }
}

