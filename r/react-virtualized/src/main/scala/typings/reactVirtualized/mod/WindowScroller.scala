package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.OnResize
import typings.reactVirtualized.esWindowScrollerMod.WindowScrollerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "WindowScroller")
@js.native
open class WindowScroller protected ()
  extends typings.reactVirtualized.esWindowScrollerMod.WindowScroller {
  def this(props: WindowScrollerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: WindowScrollerProps, context: Any) = this()
}
/* static members */
object WindowScroller {
  
  @JSImport("react-virtualized", "WindowScroller")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "WindowScroller.defaultProps")
  @js.native
  def defaultProps: OnResize = js.native
  inline def defaultProps_=(x: OnResize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
