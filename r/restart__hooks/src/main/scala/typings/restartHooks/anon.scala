package typings.restartHooks

import typings.restartHooks.cjsUseBreakpointMod.BreakpointDirection
import typings.restartHooks.cjsUseBreakpointMod.BreakpointMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(): Unit
  }
  object Clear {
    
    inline def apply(clear: () => Unit): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FnCall[TKey /* <: String */] extends StObject {
    
    def apply(breakpointMap: BreakpointMap[TKey]): Boolean = js.native
    def apply(breakpointMap: BreakpointMap[TKey], window: Window): Boolean = js.native
    def apply(breakpoint: TKey): Boolean = js.native
    def apply(breakpoint: TKey, direction: Unit, window: Window): Boolean = js.native
    def apply(breakpoint: TKey, direction: BreakpointDirection): Boolean = js.native
    def apply(breakpoint: TKey, direction: BreakpointDirection, window: Window): Boolean = js.native
  }
  
  /* Inlined std.Partial<std.Record<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints, @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointDirection>> */
  trait PartialRecordDefaultBreak extends StObject {
    
    var lg: js.UndefOr[BreakpointDirection] = js.undefined
    
    var md: js.UndefOr[BreakpointDirection] = js.undefined
    
    var sm: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xl: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xs: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xxl: js.UndefOr[BreakpointDirection] = js.undefined
  }
  object PartialRecordDefaultBreak {
    
    inline def apply(): PartialRecordDefaultBreak = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordDefaultBreak]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecordDefaultBreak] (val x: Self) extends AnyVal {
      
      inline def setLg(value: BreakpointDirection): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: BreakpointDirection): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: BreakpointDirection): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: BreakpointDirection): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: BreakpointDirection): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: BreakpointDirection): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  @js.native
  trait Set extends StObject {
    
    def clear(): Unit = js.native
    
    def set(fn: js.Function0[Unit]): Unit = js.native
    def set(fn: js.Function0[Unit], delayMs: Double): Unit = js.native
  }
}
