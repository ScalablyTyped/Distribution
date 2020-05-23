package typings.promisedLdap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entries extends js.Object {
  var entries: js.Array[_]
  var references: js.Array[_]
}

object Entries {
  @scala.inline
  def apply(entries: js.Array[_], references: js.Array[_]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
}

