package typings.reactMdStates

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeyboardClickPolyfillMod {
  
  @JSImport("@react-md/states/types/useKeyboardClickPolyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useKeyboardClickPolyfill[E /* <: HTMLElement */](): js.UndefOr[KeyboardEventHandler[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardClickPolyfill")().asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  @scala.inline
  def useKeyboardClickPolyfill[E /* <: HTMLElement */](hasOnKeyDownDisabledDisableEnterClickDisableSpacebarClick: Options[E]): js.UndefOr[KeyboardEventHandler[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardClickPolyfill")(hasOnKeyDownDisabledDisableEnterClickDisableSpacebarClick.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the element does not need the Enter key polyfilled. This should
      * normally be set to `true` for `<label>` elements.
      */
    var disableEnterClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the user should not be able to click the element with the space
      * key. This should normally only be set to `true` for link elements.
      */
    var disableSpacebarClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the keyboard click handler should be disabled. This will make it
      * so the return value is just the provided `onKeyDown` handler or undefined
      * if it was omitted
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional onKeyDown event handler that should be merged with the keyboard
      * click polyfill
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): Options[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[E]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], E /* <: HTMLElement */] (val x: Self & Options[E]) extends AnyVal {
      
      @scala.inline
      def setDisableEnterClick(value: Boolean): Self = StObject.set(x, "disableEnterClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnterClickUndefined: Self = StObject.set(x, "disableEnterClick", js.undefined)
      
      @scala.inline
      def setDisableSpacebarClick(value: Boolean): Self = StObject.set(x, "disableSpacebarClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSpacebarClickUndefined: Self = StObject.set(x, "disableSpacebarClick", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
}
