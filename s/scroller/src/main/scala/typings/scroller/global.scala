package typings.scroller

import typings.scroller.Scroller.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("EasyScroller")
  @js.native
  class EasyScroller protected ()
    extends typings.scroller.EasyScroller {
    def this(content: js.Any, options: Options) = this()
  }
  
  @JSGlobal("Scroller")
  @js.native
  class Scroller protected ()
    extends typings.scroller.Scroller {
    def this(callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit]) = this()
    def this(
      callback: js.Function3[/* left */ Double, /* top */ Double, /* zoom */ Double, Unit],
      options: Options
    ) = this()
  }
}
