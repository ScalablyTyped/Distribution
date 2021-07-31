package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.Instantiable0
import typings.sharepoint.SP.ClientObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReorderingRuleCollection
  extends StObject
     with ClientObjectCollection[ReorderingRule] {
  
  def add(property: ReorderingRule): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get_childItemType(): Instantiable0[ReorderingRule] = js.native
  
  def get_item(index: Double): ReorderingRule = js.native
  
  def itemAt(index: Double): ReorderingRule = js.native
}
