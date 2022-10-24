package typings.reactAriaInteractions.mod

import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractOutsideProps extends StObject {
  
  /** Whether the interact outside events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  var onInteractOutside: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  
  var onInteractOutsideStart: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  
  var ref: RefObject[Element]
}
object InteractOutsideProps {
  
  inline def apply(ref: RefObject[Element]): InteractOutsideProps = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractOutsideProps]
  }
  
  extension [Self <: InteractOutsideProps](x: Self) {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setOnInteractOutside(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onInteractOutside", js.Any.fromFunction1(value))
    
    inline def setOnInteractOutsideStart(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onInteractOutsideStart", js.Any.fromFunction1(value))
    
    inline def setOnInteractOutsideStartUndefined: Self = StObject.set(x, "onInteractOutsideStart", js.undefined)
    
    inline def setOnInteractOutsideUndefined: Self = StObject.set(x, "onInteractOutside", js.undefined)
    
    inline def setRef(value: RefObject[Element]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
