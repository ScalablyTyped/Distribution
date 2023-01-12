package typings.restartHooks

import typings.react.mod.FocusEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseFocusManagerMod {
  
  @JSImport("@restart/hooks/cjs/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: FocusManagerOptions): FocusController = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[FocusController]
  
  trait FocusController extends StObject {
    
    def onBlur(event: Any): Unit
    
    def onFocus(event: Any): Unit
  }
  object FocusController {
    
    inline def apply(onBlur: Any => Unit, onFocus: Any => Unit): FocusController = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus))
      __obj.asInstanceOf[FocusController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusController] (val x: Self) extends AnyVal {
      
      inline def setOnBlur(value: Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    }
  }
  
  trait FocusManagerOptions extends StObject {
    
    /**
      * A callback fired after focus is handled but before onChange is called
      */
    var didHandle: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element, Element], Unit]
      ] = js.undefined
    
    /**
      * When true, the event handlers will not report focus changes
      */
    def isDisabled(): Boolean
    
    /**
      * A callback fired after focus has changed
      */
    var onChange: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element, Element], Unit]
      ] = js.undefined
    
    /**
      * A callback fired when focus shifts. returning `false` will prevent
      * handling the focus event
      */
    var willHandle: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element, Element], Boolean | Unit]
      ] = js.undefined
  }
  object FocusManagerOptions {
    
    inline def apply(isDisabled: () => Boolean): FocusManagerOptions = {
      val __obj = js.Dynamic.literal(isDisabled = js.Any.fromFunction0(isDisabled))
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setDidHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element, Element]) => Unit): Self = StObject.set(x, "didHandle", js.Any.fromFunction2(value))
      
      inline def setDidHandleUndefined: Self = StObject.set(x, "didHandle", js.undefined)
      
      inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      inline def setOnChange(value: (/* focused */ Boolean, /* event */ FocusEvent[Element, Element]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setWillHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element, Element]) => Boolean | Unit): Self = StObject.set(x, "willHandle", js.Any.fromFunction2(value))
      
      inline def setWillHandleUndefined: Self = StObject.set(x, "willHandle", js.undefined)
    }
  }
}
