package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.Ariareadonly
import typings.reactVirtualized.esGridMod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "Grid")
@js.native
class Grid protected ()
  extends typings.reactVirtualized.esGridMod.Grid {
  def this(props: GridProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: GridProps, context: js.Any) = this()
}
/* static members */
object Grid {
  
  @JSImport("react-virtualized", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "Grid.defaultProps")
  @js.native
  def defaultProps: Ariareadonly = js.native
  @scala.inline
  def defaultProps_=(x: Ariareadonly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
