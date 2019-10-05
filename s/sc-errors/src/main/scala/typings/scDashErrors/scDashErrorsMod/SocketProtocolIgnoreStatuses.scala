package typings.scDashErrors.scDashErrorsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketProtocolIgnoreStatuses extends js.Object {
  var `1000`: String
  var `1001`: String
}

object SocketProtocolIgnoreStatuses {
  @scala.inline
  def apply(`1000`: String, `1001`: String): SocketProtocolIgnoreStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1000")(`1000`)
    __obj.updateDynamic("1001")(`1001`)
    __obj.asInstanceOf[SocketProtocolIgnoreStatuses]
  }
}

@JSImport("sc-errors", "socketProtocolIgnoreStatuses")
@js.native
object socketProtocolIgnoreStatuses extends TopLevel[SocketProtocolIgnoreStatuses]

