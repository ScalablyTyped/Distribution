package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabFocusWrapMod {
  
  @JSImport("@react-md/utils/types/wia-aria/useTabFocusWrap", "useTabFocusWrap")
  @js.native
  def useTabFocusWrap[E /* <: HTMLElement */](hasDisabledDisableFocusCacheOnKeyDown: Options[E]): js.UndefOr[KeyboardEventHandler[E]] = js.native
  
  @js.native
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the list of focusable elements should not be cached after the
      * first tab key press. This should only be set to `true` if you have a lot of
      * dynamic content whin your element and the first and last elements change.
      */
    var disableFocusCache: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the focus wrap behavior should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional keydown event handler to merge with the focus wrap behavior.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): Options[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[E]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
      
      @scala.inline
      def setDisableFocusCache(value: Boolean): Self = StObject.set(x, "disableFocusCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusCacheUndefined: Self = StObject.set(x, "disableFocusCache", js.undefined)
      
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
