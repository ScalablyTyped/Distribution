package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEventInit
  extends StObject
     with MouseEventInit {
  
  var dataTransfer: js.UndefOr[DataTransfer | Null] = js.undefined
}
object DragEventInit {
  
  @scala.inline
  def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  
  @scala.inline
  implicit class DragEventInitMutableBuilder[Self <: DragEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransfer(value: DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    @scala.inline
    def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
