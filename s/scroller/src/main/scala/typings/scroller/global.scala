package typings.scroller

import typings.scroller.Scroller.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("EasyScroller")
  @js.native
  open class EasyScroller protected ()
    extends StObject
       with typings.scroller.EasyScroller {
    def this(content: Any, options: Options) = this()
    
    /* CompleteClass */
    override def bindEvents(): Unit = js.native
    
    /* CompleteClass */
    override def reflow(): Unit = js.native
    
    /* CompleteClass */
    override def render(): Unit = js.native
  }
  
  @JSGlobal("Scroller")
  @js.native
  open class Scroller protected ()
    extends StObject
       with typings.scroller.Scroller {
    def this(callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit]) = this()
    def this(
      callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit],
      options: Options
    ) = this()
  }
}
