package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEndRenameColumn extends IEventArgs {
  
  var columnKey: String = js.native
  
  var newColumnTitle: String = js.native
  
  var originalColumnTitle: String = js.native
}
object OnEndRenameColumn {
  
  @scala.inline
  def apply(columnKey: String, newColumnTitle: String, originalColumnTitle: String): OnEndRenameColumn = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], newColumnTitle = newColumnTitle.asInstanceOf[js.Any], originalColumnTitle = originalColumnTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEndRenameColumn]
  }
  
  @scala.inline
  implicit class OnEndRenameColumnMutableBuilder[Self <: OnEndRenameColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColumnTitle(value: String): Self = StObject.set(x, "newColumnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalColumnTitle(value: String): Self = StObject.set(x, "originalColumnTitle", value.asInstanceOf[js.Any])
  }
}
