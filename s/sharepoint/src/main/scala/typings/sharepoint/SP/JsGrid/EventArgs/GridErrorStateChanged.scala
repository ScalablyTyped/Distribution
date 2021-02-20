package typings.sharepoint.SP.JsGrid.EventArgs

import typings.sharepoint.SP.JsGrid.IEventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridErrorStateChanged extends IEventArgs {
  
  var bAnyErrors: Boolean = js.native
}
object GridErrorStateChanged {
  
  @scala.inline
  def apply(bAnyErrors: Boolean): GridErrorStateChanged = {
    val __obj = js.Dynamic.literal(bAnyErrors = bAnyErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridErrorStateChanged]
  }
  
  @scala.inline
  implicit class GridErrorStateChangedMutableBuilder[Self <: GridErrorStateChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBAnyErrors(value: Boolean): Self = StObject.set(x, "bAnyErrors", value.asInstanceOf[js.Any])
  }
}
