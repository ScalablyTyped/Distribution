package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardEventInit extends EventInit {
  
  var clipboardData: js.UndefOr[DataTransfer | Null] = js.native
}
object ClipboardEventInit {
  
  @scala.inline
  def apply(): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipboardEventInit]
  }
  
  @scala.inline
  implicit class ClipboardEventInitMutableBuilder[Self <: ClipboardEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipboardData(value: DataTransfer): Self = StObject.set(x, "clipboardData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboardDataNull: Self = StObject.set(x, "clipboardData", null)
    
    @scala.inline
    def setClipboardDataUndefined: Self = StObject.set(x, "clipboardData", js.undefined)
  }
}
