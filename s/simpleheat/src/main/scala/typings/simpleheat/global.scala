package typings.simpleheat

import org.scalablytyped.runtime.Shortcut
import typings.simpleheat.mod.Instance
import typings.simpleheat.mod.Static
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object simpleheat extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("simpleheat")
    @js.native
    open class ^ protected ()
      extends StObject
         with Instance {
      def this(canvas: HTMLCanvasElement) = this()
    }
    
    @JSGlobal("simpleheat")
    @js.native
    val ^ : Static = js.native
    
    type _To = Static
    
    /* This means you don't have to write `^`, but can instead just say `simpleheat.foo` */
    override def _to: Static = ^
  }
}
