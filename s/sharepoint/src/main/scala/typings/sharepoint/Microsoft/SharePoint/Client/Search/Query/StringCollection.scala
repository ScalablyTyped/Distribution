package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.Instantiable0
import typings.sharepoint.SP.ClientObjectCollection
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringCollection extends ClientObjectCollection[String] {
  
  def add(property: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get_childItemType(): StringConstructor with Instantiable0[typings.std.global.String] = js.native
  
  def get_item(index: Double): String = js.native
  
  def itemAt(index: Double): String = js.native
}
