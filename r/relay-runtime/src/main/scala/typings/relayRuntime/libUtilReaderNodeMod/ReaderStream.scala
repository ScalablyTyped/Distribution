package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderStream
  extends StObject
     with ReaderSelection {
  
  val kind: String
  
  // 'Stream';
  val selections: js.Array[ReaderSelection]
}
object ReaderStream {
  
  inline def apply(kind: String, selections: js.Array[ReaderSelection]): ReaderStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderStream] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
