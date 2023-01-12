package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item[TDataItem] extends StObject {
  
  var item: TDataItem
}
object Item {
  
  inline def apply[TDataItem](item: TDataItem): Item[TDataItem] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[TDataItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item[?], TDataItem] (val x: Self & Item[TDataItem]) extends AnyVal {
    
    inline def setItem(value: TDataItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
