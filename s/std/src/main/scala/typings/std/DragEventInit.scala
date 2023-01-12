package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEventInit
  extends StObject
     with MouseEventInit {
  
  /* standard dom */
  var dataTransfer: js.UndefOr[DataTransfer | Null] = js.undefined
}
object DragEventInit {
  
  inline def apply(): DragEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragEventInit] (val x: Self) extends AnyVal {
    
    inline def setDataTransfer(value: DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    inline def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
