package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.interfacesMod.CalcFunction
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.PrecompiledCss
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.moonLoaderMod.BallStyleFunction
import typings.reactDashSpinners.moonLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/MoonLoader", JSImport.Namespace)
@js.native
object moonLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var ball: CalcFunction[PrecompiledCss] = js.native
    var ballStyle: BallStyleFunction = js.native
    var circle: CalcFunction[PrecompiledCss] = js.native
    var moonSize: CalcFunction[Double] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
  type BallStyleFunction = js.Function1[/* size */ Double, PrecompiledCss]
}

