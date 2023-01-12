package typings.reactCurrencyFormatter

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Component[CurrencyFormatterProps, ComponentState, Any] {
    def this(props: CurrencyFormatterProps) = this()
    def this(props: CurrencyFormatterProps, context: Any) = this()
  }
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[CurrencyFormatterProps, ComponentState]) = js.native
  
  trait CurrencyFormatterProps extends StObject {
    
    var currency: js.UndefOr[String] = js.undefined
    
    var decimal: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var quantity: Double
    
    var symbol: js.UndefOr[String] = js.undefined
  }
  object CurrencyFormatterProps {
    
    inline def apply(quantity: Double): CurrencyFormatterProps = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyFormatterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrencyFormatterProps] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    }
  }
  
  type _To = js.Object & (ComponentClass[CurrencyFormatterProps, ComponentState])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (ComponentClass[CurrencyFormatterProps, ComponentState]) = ^
}
