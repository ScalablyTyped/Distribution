package typings.quadstore.distCjsTypesMod

import typings.abstractLevel.typesAbstractIteratorMod.AbstractIteratorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelQuery[LK, LV] extends StObject {
  
  var index: InternalIndex
  
  var level: AbstractIteratorOptions[LK, LV]
  
  var order: js.Array[TermName]
}
object LevelQuery {
  
  inline def apply[LK, LV](index: InternalIndex, level: AbstractIteratorOptions[LK, LV], order: js.Array[TermName]): LevelQuery[LK, LV] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelQuery[LK, LV]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelQuery[?, ?], LK, LV] (val x: Self & (LevelQuery[LK, LV])) extends AnyVal {
    
    inline def setIndex(value: InternalIndex): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: AbstractIteratorOptions[LK, LV]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: js.Array[TermName]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderVarargs(value: TermName*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
