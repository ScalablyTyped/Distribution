package typings.reactVirtualized

import typings.reactVirtualized.anon.OnResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/WindowScroller", JSImport.Namespace)
@js.native
object windowScrollerMod extends js.Object {
  @js.native
  class WindowScroller ()
    extends typings.reactVirtualized.esWindowScrollerMod.WindowScroller
  
  val IS_SCROLLING_TIMEOUT: /* 150 */ Double = js.native
  /* static members */
  @js.native
  object WindowScroller extends js.Object {
    var defaultProps: OnResize = js.native
  }
  
}

