package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridErrorStateChanged
  extends StObject
     with IEventArgs {
  
  var bAnyErrors: Boolean
}
object GridErrorStateChanged {
  
  inline def apply(bAnyErrors: Boolean): GridErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAnyErrors = bAnyErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridErrorStateChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridErrorStateChanged] (val x: Self) extends AnyVal {
    
    inline def setBAnyErrors(value: Boolean): Self = StObject.set(x, "bAnyErrors", value.asInstanceOf[js.Any])
  }
}
