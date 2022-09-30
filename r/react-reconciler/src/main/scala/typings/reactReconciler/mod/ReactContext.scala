package typings.reactReconciler.mod

import org.scalablytyped.runtime.StringDictionary
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
  var _currentRenderer: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var _currentRenderer2: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var _currentValue: T
  
  var _currentValue2: T
  
  var _threadCount: Double
  
  // This value may be added by application code
  // to improve DEV tooling display names
  var displayName: js.UndefOr[String] = js.undefined
}
object ReactContext {
  
  inline def apply[T](
    Consumer: ReactContext[T],
    DollarDollartypeof: js.Symbol | Double,
    Provider: ReactProviderType[T],
    _currentValue: T,
    _currentValue2: T,
    _threadCount: Double
  ): ReactContext[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _currentValue2 = _currentValue2.asInstanceOf[js.Any], _threadCount = _threadCount.asInstanceOf[js.Any], _calculateChangedBits = null)
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactContext[T]]
  }
  
  extension [Self <: ReactContext[?], T](x: Self & ReactContext[T]) {
    
    inline def setConsumer(value: ReactContext[T]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ReactProviderType[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def set_calculateChangedBits(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "_calculateChangedBits", js.Any.fromFunction2(value))
    
    inline def set_calculateChangedBitsNull: Self = StObject.set(x, "_calculateChangedBits", null)
    
    inline def set_currentRenderer(value: StringDictionary[Any]): Self = StObject.set(x, "_currentRenderer", value.asInstanceOf[js.Any])
    
    inline def set_currentRenderer2(value: StringDictionary[Any]): Self = StObject.set(x, "_currentRenderer2", value.asInstanceOf[js.Any])
    
    inline def set_currentRenderer2Null: Self = StObject.set(x, "_currentRenderer2", null)
    
    inline def set_currentRenderer2Undefined: Self = StObject.set(x, "_currentRenderer2", js.undefined)
    
    inline def set_currentRendererNull: Self = StObject.set(x, "_currentRenderer", null)
    
    inline def set_currentRendererUndefined: Self = StObject.set(x, "_currentRenderer", js.undefined)
    
    inline def set_currentValue(value: T): Self = StObject.set(x, "_currentValue", value.asInstanceOf[js.Any])
    
    inline def set_currentValue2(value: T): Self = StObject.set(x, "_currentValue2", value.asInstanceOf[js.Any])
    
    inline def set_threadCount(value: Double): Self = StObject.set(x, "_threadCount", value.asInstanceOf[js.Any])
  }
}
