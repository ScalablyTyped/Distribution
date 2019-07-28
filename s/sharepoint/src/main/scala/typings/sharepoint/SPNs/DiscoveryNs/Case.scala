package typings.sharepoint.SPNs.DiscoveryNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.ClientRuntimeContext
import typings.sharepoint.SPNs.StringResult
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Discovery.Case")
@js.native
class Case protected () extends ClientObject {
  def this(context: ClientRuntimeContext, web: Web) = this()
  def getExportContent(sourceIds: js.Array[Double]): StringResult = js.native
}

