package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingChangeKeyInitiallyComplete
  extends StObject
     with IEventArgs {
  
  var changeKey: IChangeKey
}
object PendingChangeKeyInitiallyComplete {
  
  inline def apply(changeKey: IChangeKey): PendingChangeKeyInitiallyComplete = {
    val __obj = js.Dynamic.literal(changeKey = changeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingChangeKeyInitiallyComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingChangeKeyInitiallyComplete] (val x: Self) extends AnyVal {
    
    inline def setChangeKey(value: IChangeKey): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
  }
}
