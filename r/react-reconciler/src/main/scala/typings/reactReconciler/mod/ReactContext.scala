package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactContext[T] extends StObject {
  
  var Consumer: ReactContext[T] = js.native
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double = js.native
  
  var Provider: ReactProviderType[T] = js.native
  
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, Double]) | Null = js.native
  
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | Null] = js.native
  
  var _currentRenderer2: js.UndefOr[js.Object | Null] = js.native
  
  var _currentValue: T = js.native
  
  var _currentValue2: T = js.native
  
  var _threadCount: Double = js.native
  
  def unstable_read(): T = js.native
}
object ReactContext {
  
  @scala.inline
  def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
  
  @scala.inline
  implicit class ReactContextMutableBuilder[Self <: ReactContext[_], T] (val x: Self with ReactContext[T]) extends AnyVal {
    
    @scala.inline
    def setConsumer(value: ReactContext[T]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ReactProviderType[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable_read(value: () => T): Self = StObject.set(x, "unstable_read", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_calculateChangedBits(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "_calculateChangedBits", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_calculateChangedBitsNull: Self = StObject.set(x, "_calculateChangedBits", null)
    
    @scala.inline
    def set_currentRenderer(value: js.Object): Self = StObject.set(x, "_currentRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentRenderer2(value: js.Object): Self = StObject.set(x, "_currentRenderer2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentRenderer2Null: Self = StObject.set(x, "_currentRenderer2", null)
    
    @scala.inline
    def set_currentRenderer2Undefined: Self = StObject.set(x, "_currentRenderer2", js.undefined)
    
    @scala.inline
    def set_currentRendererNull: Self = StObject.set(x, "_currentRenderer", null)
    
    @scala.inline
    def set_currentRendererUndefined: Self = StObject.set(x, "_currentRenderer", js.undefined)
    
    @scala.inline
    def set_currentValue(value: T): Self = StObject.set(x, "_currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentValue2(value: T): Self = StObject.set(x, "_currentValue2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_threadCount(value: Double): Self = StObject.set(x, "_threadCount", value.asInstanceOf[js.Any])
  }
}
