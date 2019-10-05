package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObjectCollection
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.StringCollection")
@js.native
class StringCollection protected () extends ClientObjectCollection[String] {
  def this(context: ClientContext) = this()
  def add(property: String): Unit = js.native
  def clear(): Unit = js.native
  def get_childItemType(): StringConstructor = js.native
  def get_item(index: Double): String = js.native
  def itemAt(index: Double): String = js.native
}

