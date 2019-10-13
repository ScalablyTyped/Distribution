package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.skewLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/SkewLoader", JSImport.Namespace)
@js.native
object skewLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var style: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeProps = js.native
  }
  
}

