package typings.reactVirtualized

import typings.reactVirtualized.anon.OnResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/WindowScroller", JSImport.Namespace)
@js.native
object windowScrollerMod extends js.Object {
  
  val IS_SCROLLING_TIMEOUT: /* 150 */ Double = js.native
  
  @js.native
  class WindowScroller ()
    extends typings.reactVirtualized.esWindowScrollerMod.WindowScroller
  /* static members */
  @js.native
  object WindowScroller extends js.Object {
    
    var defaultProps: OnResize = js.native
  }
}
