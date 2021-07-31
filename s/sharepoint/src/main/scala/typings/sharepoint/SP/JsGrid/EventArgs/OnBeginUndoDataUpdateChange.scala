package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBeginUndoDataUpdateChange
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object OnBeginUndoDataUpdateChange {
  
  @scala.inline
  def apply(changeKey: IChangeKey): OnBeginUndoDataUpdateChange = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeginUndoDataUpdateChange]
  }
  
  @scala.inline
  implicit class OnBeginUndoDataUpdateChangeMutableBuilder[Self <: OnBeginUndoDataUpdateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
