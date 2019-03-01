package typings
package promisedDashLdapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entries extends js.Object {
  var entries: js.Array[_]
  var references: js.Array[_]
}

object Anon_Entries {
  @scala.inline
  def apply(entries: js.Array[_], references: js.Array[_]): Anon_Entries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[Anon_Entries]
  }
}

