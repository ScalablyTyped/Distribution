package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.reactMdUtils.typesContainsElementMod.CheckableThing
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseCloseOnOutsideClickMod {
  
  @JSImport("@react-md/utils/types/useCloseOnOutsideClick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElement[E /* <: HTMLElement */](): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")().asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: E): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  inline def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def useCloseOnOutsideClick[E /* <: HTMLElement */](param0: CloseOnOutsideClickOptions[E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useCloseOnOutsideClick")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CloseOnOutsideClickOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The element that should not trigger the onOutsideClick callback when it or
      * a child has been clicked.
      */
    var element: E | Null | (MutableRefObject[E | Null])
    
    /**
      * Boolean if the behavior is enabled.
      */
    var enabled: Boolean
    
    /**
      * A callback function when an element outside has been clicked. This is
      * normally something that closes temporary elements.
      */
    var onOutsideClick: OnOutsideClick[E]
  }
  object CloseOnOutsideClickOptions {
    
    inline def apply[E /* <: HTMLElement */](
      enabled: Boolean,
      onOutsideClick: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit
    ): CloseOnOutsideClickOptions[E] = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction3(onOutsideClick), element = null)
      __obj.asInstanceOf[CloseOnOutsideClickOptions[E]]
    }
    
    extension [Self <: CloseOnOutsideClickOptions[?], E /* <: HTMLElement */](x: Self & CloseOnOutsideClickOptions[E]) {
      
      inline def setElement(value: E | (MutableRefObject[E | Null])): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setOnOutsideClick(value: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction3(value))
    }
  }
  
  type Contains = js.Function2[/* container */ CheckableThing, /* child */ CheckableThing, Boolean]
  
  type OnOutsideClick[E /* <: HTMLElement */] = js.Function3[/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains, Unit]
}
