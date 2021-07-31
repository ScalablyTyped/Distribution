package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderListValue
  extends StObject
     with ReaderArgument {
  
  val items: js.Array[ReaderArgument | Null]
  
  val kind: String
  
  // 'ListValue';
  val name: String
}
object ReaderListValue {
  
  @scala.inline
  def apply(items: js.Array[ReaderArgument | Null], kind: String, name: String): ReaderListValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderListValue]
  }
  
  @scala.inline
  implicit class ReaderListValueMutableBuilder[Self <: ReaderListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ReaderArgument | Null]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: (ReaderArgument | Null)*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
