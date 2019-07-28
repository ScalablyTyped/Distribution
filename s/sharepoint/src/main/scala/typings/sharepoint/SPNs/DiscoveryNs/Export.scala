package typings.sharepoint.SPNs.DiscoveryNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Discovery.Export")
@js.native
class Export protected () extends ClientObject {
  def this(context: ClientRuntimeContext, item: typings.sharepoint.SPNs.ListItem[_]) = this()
  def getExportContent(): StringResult = js.native
  def get_status(): ExportStatus = js.native
  def set_status(value: ExportStatus): ExportStatus = js.native
  def update(): Unit = js.native
}

