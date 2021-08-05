package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedPropertyDescriptor[T] extends StObject {
  
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  
  var value: js.UndefOr[T] = js.undefined
  
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}
object TypedPropertyDescriptor {
  
  inline def apply[T](): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
  
  extension [Self <: TypedPropertyDescriptor[?], T](x: Self & TypedPropertyDescriptor[T]) {
    
    inline def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    inline def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
