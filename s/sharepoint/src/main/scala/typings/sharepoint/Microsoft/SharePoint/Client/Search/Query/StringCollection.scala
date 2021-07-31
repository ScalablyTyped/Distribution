package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typings.sharepoint.SP.ClientObjectCollection
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringCollection
  extends StObject
     with ClientObjectCollection[String] {
  
  def add(property: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get_childItemType(): StringConstructor = js.native
  
  def get_item(index: Double): String = js.native
  
  def itemAt(index: Double): String = js.native
}
