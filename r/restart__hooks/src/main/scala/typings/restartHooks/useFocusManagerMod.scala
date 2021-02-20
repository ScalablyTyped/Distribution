package typings.restartHooks

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusManagerMod {
  
  @JSImport("@restart/hooks/cjs/useFocusManager", JSImport.Default)
  @js.native
  def default(opts: FocusManagerOptions): FocusController = js.native
  
  @js.native
  trait FocusController extends StObject {
    
    def onBlur(event: js.Any): Unit = js.native
    
    def onFocus(event: js.Any): Unit = js.native
  }
  object FocusController {
    
    @scala.inline
    def apply(onBlur: js.Any => Unit, onFocus: js.Any => Unit): FocusController = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus))
      __obj.asInstanceOf[FocusController]
    }
    
    @scala.inline
    implicit class FocusControllerMutableBuilder[Self <: FocusController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FocusManagerOptions extends StObject {
    
    /**
      * A callback fired after focus is handled but before onChange is called
      */
    var didHandle: js.UndefOr[js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Unit]] = js.native
    
    /**
      * When true, the event handlers will not report focus changes
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * A callback fired after focus has changed
      */
    var onChange: js.UndefOr[js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Unit]] = js.native
    
    /**
      * A callback fired when focus shifts. returning `false` will prevent
      * handling the focus event
      */
    var willHandle: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Boolean | Unit]
      ] = js.native
  }
  object FocusManagerOptions {
    
    @scala.inline
    def apply(isDisabled: () => Boolean): FocusManagerOptions = {
      val __obj = js.Dynamic.literal(isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    @scala.inline
    implicit class FocusManagerOptionsMutableBuilder[Self <: FocusManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Unit): Self = StObject.set(x, "didHandle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDidHandleUndefined: Self = StObject.set(x, "didHandle", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChange(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setWillHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Boolean | Unit): Self = StObject.set(x, "willHandle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWillHandleUndefined: Self = StObject.set(x, "willHandle", js.undefined)
    }
  }
}
