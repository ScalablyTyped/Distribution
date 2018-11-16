package typings
package sharepointLib.SPNs.DiscoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Discovery.Export")
@js.native
class Export protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientRuntimeContext, item: sharepointLib.SPNs.ListItem[_]) = this()
  def getExportContent(): sharepointLib.SPNs.StringResult = js.native
  def get_status(): ExportStatus = js.native
  def set_status(value: ExportStatus): ExportStatus = js.native
  def update(): scala.Unit = js.native
}

