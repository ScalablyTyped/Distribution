package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactContext[T] extends StObject {
  
  var Consumer: ReactContext[T]
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var Provider: ReactProviderType[T]
  
  var _calculateChangedBits: (js.Function2[/* a */ T, /* b */ T, Double]) | Null
  
  // DEV only
  var _currentRenderer: js.UndefOr[js.Object | Null] = js.undefined
  
  var _currentRenderer2: js.UndefOr[js.Object | Null] = js.undefined
  
  var _currentValue: T
  
  var _currentValue2: T
  
  var _threadCount: Double
  
  def unstable_read(): T
}
object ReactContext {
  
  inline def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double,
    unstable_read: () => T
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], unstable_read = js.Any.fromFunction0(unstable_read), _calculateChangedBits = null)
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
  
  extension [Self <: ReactContext[?], T](x: Self & ReactContext[T]) {
    
    inline def setConsumer(value: ReactContext[T]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ReactProviderType[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setUnstable_read(value: () => T): Self = StObject.set(x, "unstable_read", js.Any.fromFunction0(value))
    
    inline def set_calculateChangedBits(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "_calculateChangedBits", js.Any.fromFunction2(value))
    
    inline def set_calculateChangedBitsNull: Self = StObject.set(x, "_calculateChangedBits", null)
    
    inline def set_currentRenderer(value: js.Object): Self = StObject.set(x, "_currentRenderer", value.asInstanceOf[js.Any])
    
    inline def set_currentRenderer2(value: js.Object): Self = StObject.set(x, "_currentRenderer2", value.asInstanceOf[js.Any])
    
    inline def set_currentRenderer2Null: Self = StObject.set(x, "_currentRenderer2", null)
    
    inline def set_currentRenderer2Undefined: Self = StObject.set(x, "_currentRenderer2", js.undefined)
    
    inline def set_currentRendererNull: Self = StObject.set(x, "_currentRenderer", null)
    
    inline def set_currentRendererUndefined: Self = StObject.set(x, "_currentRenderer", js.undefined)
    
    inline def set_currentValue(value: T): Self = StObject.set(x, "_currentValue", value.asInstanceOf[js.Any])
    
    inline def set_currentValue2(value: T): Self = StObject.set(x, "_currentValue2", value.asInstanceOf[js.Any])
    
    inline def set_threadCount(value: Double): Self = StObject.set(x, "_threadCount", value.asInstanceOf[js.Any])
  }
}
