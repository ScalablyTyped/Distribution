package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredSerializeOptions extends StObject {
  
  /* standard dom */
  var transfer: js.UndefOr[js.Array[Transferable]] = js.undefined
}
object StructuredSerializeOptions {
  
  inline def apply(): StructuredSerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredSerializeOptions]
  }
  
  extension [Self <: StructuredSerializeOptions](x: Self) {
    
    inline def setTransfer(value: js.Array[Transferable]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTransferVarargs(value: Transferable*): Self = StObject.set(x, "transfer", js.Array(value*))
  }
}
