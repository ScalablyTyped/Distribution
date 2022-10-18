package typings.reactOverlays

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsDropdownContextMod extends Shortcut {
  
  @JSImport("react-overlays/cjs/DropdownContext", JSImport.Default)
  @js.native
  val default: Context[DropdownContextValue | Null] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactOverlays.reactOverlaysStrings.up
    - typings.reactOverlays.reactOverlaysStrings.down
    - typings.reactOverlays.reactOverlaysStrings.left
    - typings.reactOverlays.reactOverlaysStrings.right
  */
  trait DropDirection extends StObject
  object DropDirection {
    
    inline def down: typings.reactOverlays.reactOverlaysStrings.down = "down".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.down]
    
    inline def left: typings.reactOverlays.reactOverlaysStrings.left = "left".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.left]
    
    inline def right: typings.reactOverlays.reactOverlaysStrings.right = "right".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.right]
    
    inline def up: typings.reactOverlays.reactOverlaysStrings.up = "up".asInstanceOf[typings.reactOverlays.reactOverlaysStrings.up]
  }
  
  @js.native
  trait DropdownContextValue extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[DropDirection] = js.native
    
    var menuElement: HTMLElement | Null = js.native
    
    def setMenu(): Unit = js.native
    def setMenu(ref: HTMLElement): Unit = js.native
    
    def setToggle(): Unit = js.native
    def setToggle(ref: HTMLElement): Unit = js.native
    
    var show: Boolean = js.native
    
    def toggle(nextShow: Boolean): Unit = js.native
    def toggle(nextShow: Boolean, event: SyntheticEvent[Element, Event]): Unit = js.native
    def toggle(nextShow: Boolean, event: Event): Unit = js.native
    
    var toggleElement: HTMLElement | Null = js.native
  }
  
  type _To = Context[DropdownContextValue | Null]
  
  /* This means you don't have to write `default`, but can instead just say `cjsDropdownContextMod.foo` */
  override def _to: Context[DropdownContextValue | Null] = default
}
