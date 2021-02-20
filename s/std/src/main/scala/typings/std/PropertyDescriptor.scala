package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDescriptor extends StObject {
  
  var configurable: js.UndefOr[scala.Boolean] = js.native
  
  var enumerable: js.UndefOr[scala.Boolean] = js.native
  
  var get: js.UndefOr[js.Function0[_]] = js.native
  
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object PropertyDescriptor {
  
  @scala.inline
  def apply(): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDescriptor]
  }
  
  @scala.inline
  implicit class PropertyDescriptorMutableBuilder[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: scala.Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
    
    @scala.inline
    def setEnumerable(value: scala.Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
    
    @scala.inline
    def setGet(value: () => _): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setSet(value: /* v */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
