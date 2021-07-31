package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectObserveChange[T] extends StObject {
  
  var name: String
  
  var `object`: T
  
  var oldValue: js.UndefOr[js.Any] = js.undefined
  
  var `type`: String
}
object ObjectObserveChange {
  
  @scala.inline
  def apply[T](name: String, `object`: T, `type`: String): ObjectObserveChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectObserveChange[T]]
  }
  
  @scala.inline
  implicit class ObjectObserveChangeMutableBuilder[Self <: ObjectObserveChange[?], T] (val x: Self & ObjectObserveChange[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
