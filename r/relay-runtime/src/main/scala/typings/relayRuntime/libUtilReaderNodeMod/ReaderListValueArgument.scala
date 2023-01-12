package typings.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderListValueArgument
  extends StObject
     with ReaderArgument {
  
  val items: js.Array[ReaderArgument | Null]
  
  val kind: String
  
  // 'ListValue';
  val name: String
}
object ReaderListValueArgument {
  
  inline def apply(items: js.Array[ReaderArgument | Null], kind: String, name: String): ReaderListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderListValueArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaderListValueArgument] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ReaderArgument | Null]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (ReaderArgument | Null)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
