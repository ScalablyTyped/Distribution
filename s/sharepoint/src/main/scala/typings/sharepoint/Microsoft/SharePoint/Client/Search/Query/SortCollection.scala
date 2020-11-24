package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.Instantiable0
import typings.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCollection extends ClientObjectCollection[Sort] {
  
  def add(strProperty: String, sortDirection: SortDirection): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get_childItemType(): Instantiable0[Sort] = js.native
  
  def get_item(index: Double): Sort = js.native
  
  def itemAt(index: Double): Sort = js.native
}
