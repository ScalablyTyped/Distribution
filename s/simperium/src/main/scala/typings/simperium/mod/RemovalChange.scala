package typings.simperium.mod

import typings.simperium.simperiumStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovalChange
  extends Change[js.Any] {
  var ccid: String
  var id: String
  var o: `-_`
}

object RemovalChange {
  @scala.inline
  def apply(ccid: String, id: String, o: `-_`): RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalChange]
  }
}

