package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.barLoaderMod.Loader
import typings.reactDashSpinners.interfacesMod.LoaderHeightWidthProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/BarLoader", JSImport.Namespace)
@js.native
object barLoaderMod extends js.Object {
  @js.native
  class Loader ()
    extends Component[LoaderHeightWidthProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object Loader extends js.Object {
    var defaultProps: LoaderHeightWidthProps = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderHeightWidthProps = js.native
  }
  
}

