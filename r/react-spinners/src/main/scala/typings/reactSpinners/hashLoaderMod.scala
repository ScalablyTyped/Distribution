package typings.reactSpinners

import typings.emotionSerialize.mod.Keyframes
import typings.react.mod.Component
import typings.reactSpinners.interfacesMod.CalcFunction
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.StyleFunction
import typings.reactSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/HashLoader", JSImport.Namespace)
@js.native
object hashLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var after: CalcFunction[Keyframes] = js.native
    var before: CalcFunction[Keyframes] = js.native
    var color: CalcFunction[String] = js.native
    var lat: CalcFunction[Double] = js.native
    var offset: CalcFunction[Double] = js.native
    var style: StyleFunctionWithIndex = js.native
    var thickness: CalcFunction[Double] = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
}

