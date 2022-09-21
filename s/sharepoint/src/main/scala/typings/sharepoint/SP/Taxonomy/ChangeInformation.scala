package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeInformation
  extends StObject
     with ClientObject {
  
  def get_itemType(): ChangeItemType = js.native
  
  def get_operationType(): ChangeOperationType = js.native
  
  def get_startTime(): js.Date = js.native
  
  def get_withinTimeSpan(): Double = js.native
  
  def set_itemType(value: ChangeItemType): Unit = js.native
  
  def set_operationType(value: ChangeOperationType): Unit = js.native
  
  def set_startTime(value: js.Date): Unit = js.native
  
  def set_withinTimeSpan(value: Double): Unit = js.native
}
