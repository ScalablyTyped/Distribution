package typings.restartHooks

import typings.restartHooks.anon.FnCall
import typings.restartHooks.anon.PartialRecordDefaultBreak
import typings.restartHooks.restartHooksBooleans.`true`
import typings.restartHooks.restartHooksStrings.down
import typings.restartHooks.restartHooksStrings.up
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBreakpointMod {
  
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(breakpointMap: PartialRecordDefaultBreak): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpointMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(breakpoint: DefaultBreakpoints): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def createBreakpointHook[TKey /* <: String */](breakpointValues: Record[TKey, String | Double]): FnCall[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBreakpointHook")(breakpointValues.asInstanceOf[js.Any]).asInstanceOf[FnCall[TKey]]
  
  @scala.inline
  def default_down(breakpoint: DefaultBreakpoints, direction: down): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def default_true(breakpoint: DefaultBreakpoints, direction: `true`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def default_up(breakpoint: DefaultBreakpoints, direction: up): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.restartHooks.restartHooksBooleans.`true`
    - typings.restartHooks.restartHooksStrings.up
    - typings.restartHooks.restartHooksStrings.down
  */
  trait BreakpointDirection extends StObject
  object BreakpointDirection {
    
    @scala.inline
    def down: typings.restartHooks.restartHooksStrings.down = "down".asInstanceOf[typings.restartHooks.restartHooksStrings.down]
    
    @scala.inline
    def `true`: typings.restartHooks.restartHooksBooleans.`true` = true.asInstanceOf[typings.restartHooks.restartHooksBooleans.`true`]
    
    @scala.inline
    def up: typings.restartHooks.restartHooksStrings.up = "up".asInstanceOf[typings.restartHooks.restartHooksStrings.up]
  }
  
  type BreakpointMap[TKey /* <: String */] = Partial[Record[TKey, BreakpointDirection]]
  
  /* Inlined @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointMap<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints> */
  trait DefaultBreakpointMap extends StObject {
    
    var lg: js.UndefOr[BreakpointDirection] = js.undefined
    
    var md: js.UndefOr[BreakpointDirection] = js.undefined
    
    var sm: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xl: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xs: js.UndefOr[BreakpointDirection] = js.undefined
  }
  object DefaultBreakpointMap {
    
    @scala.inline
    def apply(): DefaultBreakpointMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultBreakpointMap]
    }
    
    @scala.inline
    implicit class DefaultBreakpointMapMutableBuilder[Self <: DefaultBreakpointMap] (val x: Self) extends AnyVal {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.restartHooks.restartHooksStrings.xs
    - typings.restartHooks.restartHooksStrings.sm
    - typings.restartHooks.restartHooksStrings.md
    - typings.restartHooks.restartHooksStrings.lg
    - typings.restartHooks.restartHooksStrings.xl
  */
  trait DefaultBreakpoints extends StObject
  object DefaultBreakpoints {
    
    @scala.inline
    def lg: typings.restartHooks.restartHooksStrings.lg = "lg".asInstanceOf[typings.restartHooks.restartHooksStrings.lg]
    
    @scala.inline
    def md: typings.restartHooks.restartHooksStrings.md = "md".asInstanceOf[typings.restartHooks.restartHooksStrings.md]
    
    @scala.inline
    def sm: typings.restartHooks.restartHooksStrings.sm = "sm".asInstanceOf[typings.restartHooks.restartHooksStrings.sm]
    
    @scala.inline
    def xl: typings.restartHooks.restartHooksStrings.xl = "xl".asInstanceOf[typings.restartHooks.restartHooksStrings.xl]
    
    @scala.inline
    def xs: typings.restartHooks.restartHooksStrings.xs = "xs".asInstanceOf[typings.restartHooks.restartHooksStrings.xs]
  }
}
