package typings.restartHooks

import typings.restartHooks.restartHooksBooleans.`true`
import typings.restartHooks.restartHooksStrings.down
import typings.restartHooks.restartHooksStrings.up
import typings.restartHooks.useBreakpointMod.BreakpointDirection
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(): Unit
  }
  object Clear {
    
    @scala.inline
    def apply(clear: () => Unit): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit class ClearMutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FnCall[TKey /* <: String */] extends StObject {
    
    def apply(breakpointMap: Partial[Record[TKey, BreakpointDirection]]): Boolean = js.native
    def apply(breakpoint: TKey): Boolean = js.native
    def apply(breakpoint: TKey, direction: `true`): Boolean = js.native
    def apply(breakpoint: TKey, direction: down): Boolean = js.native
    def apply(breakpoint: TKey, direction: up): Boolean = js.native
  }
  
  /* Inlined std.Partial<std.Record<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints, @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointDirection>> */
  trait PartialRecordDefaultBreak extends StObject {
    
    var lg: js.UndefOr[BreakpointDirection] = js.undefined
    
    var md: js.UndefOr[BreakpointDirection] = js.undefined
    
    var sm: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xl: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xs: js.UndefOr[BreakpointDirection] = js.undefined
  }
  object PartialRecordDefaultBreak {
    
    @scala.inline
    def apply(): PartialRecordDefaultBreak = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordDefaultBreak]
    }
    
    @scala.inline
    implicit class PartialRecordDefaultBreakMutableBuilder[Self <: PartialRecordDefaultBreak] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: BreakpointDirection): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: BreakpointDirection): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: BreakpointDirection): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: BreakpointDirection): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: BreakpointDirection): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
    }
  }
  
  @js.native
  trait Set extends StObject {
    
    def clear(): Unit = js.native
    
    def set(fn: js.Function0[Unit]): Unit = js.native
    def set(fn: js.Function0[Unit], delayMs: Double): Unit = js.native
  }
}
