package typings.reactMdUtils

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaUseTabFocusWrapMod {
  
  @JSImport("@react-md/utils/types/wia-aria/useTabFocusWrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTabFocusWrap[E /* <: HTMLElement */](param0: Options[E]): js.UndefOr[KeyboardEventHandler[E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabFocusWrap")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[KeyboardEventHandler[E]]]
  
  trait Options[E /* <: HTMLElement */] extends StObject {
    
    /**
      * Boolean if the list of focusable elements should not be cached after the
      * first tab key press. This should only be set to `true` if you have a lot of
      * dynamic content whin your element and the first and last elements change.
      */
    var disableFocusCache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the focus wrap behavior should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional keydown event handler to merge with the focus wrap behavior.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
  }
  object Options {
    
    inline def apply[E /* <: HTMLElement */](): Options[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], E /* <: HTMLElement */] (val x: Self & Options[E]) extends AnyVal {
      
      inline def setDisableFocusCache(value: Boolean): Self = StObject.set(x, "disableFocusCache", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusCacheUndefined: Self = StObject.set(x, "disableFocusCache", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
}
