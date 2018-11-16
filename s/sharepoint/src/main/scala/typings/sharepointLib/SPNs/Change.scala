package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Change")
@js.native
class Change () extends ClientObject {
  def get_changeToken(): ChangeToken = js.native
  def get_changeType(): ChangeType = js.native
  def get_siteId(): Guid = js.native
  def get_time(): stdLib.Date = js.native
}

