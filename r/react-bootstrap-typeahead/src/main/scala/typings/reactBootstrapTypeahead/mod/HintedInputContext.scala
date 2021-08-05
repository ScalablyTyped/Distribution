package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys> */
trait HintedInputContext[T /* <: TypeaheadModel */] extends StObject {
  
  var hintText: js.UndefOr[String] = js.undefined
  
  var initialItem: js.UndefOr[T] = js.undefined
  
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
}
object HintedInputContext {
  
  inline def apply[T /* <: TypeaheadModel */](): HintedInputContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintedInputContext[T]]
  }
  
  extension [Self <: HintedInputContext[?], T /* <: TypeaheadModel */](x: Self & HintedInputContext[T]) {
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setInitialItem(value: T): Self = StObject.set(x, "initialItem", value.asInstanceOf[js.Any])
    
    inline def setInitialItemUndefined: Self = StObject.set(x, "initialItem", js.undefined)
    
    inline def setOnAdd(value: /* option */ T => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setSelectHintOnEnter(value: Boolean): Self = StObject.set(x, "selectHintOnEnter", value.asInstanceOf[js.Any])
    
    inline def setSelectHintOnEnterUndefined: Self = StObject.set(x, "selectHintOnEnter", js.undefined)
  }
}
