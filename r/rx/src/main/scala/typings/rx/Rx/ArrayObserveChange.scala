package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayObserveChange[T] extends StObject {
  
  var added: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `object`: js.Array[T] = js.native
  
  var oldValue: js.UndefOr[T] = js.native
  
  var removed: js.UndefOr[js.Array[T]] = js.native
  
  var `type`: String = js.native
}
object ArrayObserveChange {
  
  @scala.inline
  def apply[T](`object`: js.Array[T], `type`: String): ArrayObserveChange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayObserveChange[T]]
  }
  
  @scala.inline
  implicit class ArrayObserveChangeMutableBuilder[Self <: ArrayObserveChange[_], T] (val x: Self with ArrayObserveChange[T]) extends AnyVal {
    
    @scala.inline
    def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObject(value: js.Array[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVarargs(value: T*): Self = StObject.set(x, "object", js.Array(value :_*))
    
    @scala.inline
    def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
