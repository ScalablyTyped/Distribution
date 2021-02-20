package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedPropertyDescriptor[T] extends StObject {
  
  var configurable: js.UndefOr[scala.Boolean] = js.native
  
  var enumerable: js.UndefOr[scala.Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[T]] = js.native
  
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  var value: js.UndefOr[T] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object TypedPropertyDescriptor {
  
  @scala.inline
  def apply[T](): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
  
  @scala.inline
  implicit class TypedPropertyDescriptorMutableBuilder[Self <: TypedPropertyDescriptor[_], T] (val x: Self with TypedPropertyDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSet(value: /* value */ T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
