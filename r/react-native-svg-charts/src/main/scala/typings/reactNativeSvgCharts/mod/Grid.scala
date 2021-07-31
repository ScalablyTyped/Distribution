package typings.reactNativeSvgCharts.mod

import typings.react.mod.Component
import typings.reactNativeSvgCharts.anon.BOTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-svg-charts", "Grid")
@js.native
class Grid[T] protected ()
  extends Component[GridProps[T], js.Object, js.Any] {
  def this(props: GridProps[T]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: GridProps[T], context: js.Any) = this()
}
/* static members */
object Grid {
  
  @JSImport("react-native-svg-charts", "Grid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-svg-charts", "Grid.Direction")
  @js.native
  def Direction: BOTH = js.native
  @scala.inline
  def Direction_=(x: BOTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Direction")(x.asInstanceOf[js.Any])
}
