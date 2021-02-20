package typings.reactMdUtils

import typings.react.mod.MutableRefObject
import typings.reactMdUtils.containsElementMod.CheckableThing
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCloseOnOutsideClickMod {
  
  @JSImport("@react-md/utils/types/useCloseOnOutsideClick", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](): E | Null = js.native
  @JSImport("@react-md/utils/types/useCloseOnOutsideClick", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](element: E): E | Null = js.native
  @JSImport("@react-md/utils/types/useCloseOnOutsideClick", "getElement")
  @js.native
  def getElement[E /* <: HTMLElement */](element: MutableRefObject[E | Null]): E | Null = js.native
  
  @JSImport("@react-md/utils/types/useCloseOnOutsideClick", "useCloseOnOutsideClick")
  @js.native
  def useCloseOnOutsideClick[E /* <: HTMLElement */](hasEnabledElementOnOutsideClick: CloseOnOutsideClickOptions[E]): Unit = js.native
  
  @js.native
  trait CloseOnOutsideClickOptions[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The element that should not trigger the onOutsideClick callback when it or
      * a child has been clicked.
      */
    var element: E | Null | (MutableRefObject[E | Null]) = js.native
    
    /**
      * Boolean if the behavior is enabled.
      */
    var enabled: Boolean = js.native
    
    /**
      * A callback function when an element outside has been clicked. This is
      * normally something that closes temporary elements.
      */
    var onOutsideClick: OnOutsideClick[E] = js.native
  }
  object CloseOnOutsideClickOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](
      enabled: Boolean,
      onOutsideClick: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit
    ): CloseOnOutsideClickOptions[E] = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction3(onOutsideClick))
      __obj.asInstanceOf[CloseOnOutsideClickOptions[E]]
    }
    
    @scala.inline
    implicit class CloseOnOutsideClickOptionsMutableBuilder[Self <: CloseOnOutsideClickOptions[_], E /* <: HTMLElement */] (val x: Self with CloseOnOutsideClickOptions[E]) extends AnyVal {
      
      @scala.inline
      def setElement(value: E | (MutableRefObject[E | Null])): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOutsideClick(value: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit): Self = StObject.set(x, "onOutsideClick", js.Any.fromFunction3(value))
    }
  }
  
  type Contains = js.Function2[/* container */ CheckableThing, /* child */ CheckableThing, Boolean]
  
  type OnOutsideClick[E /* <: HTMLElement */] = js.Function3[/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains, Unit]
}
