package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ListItem
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledItem
  extends StObject
     with ClientObject {
  
  def get_endDate(): Date = js.native
  
  def get_listItem(): ListItem[js.Any] = js.native
  
  def get_startDate(): Date = js.native
  
  def schedule(approvalComment: String): Unit = js.native
  
  def set_endDate(value: Date): Date = js.native
  
  def set_startDate(value: Date): Date = js.native
}
