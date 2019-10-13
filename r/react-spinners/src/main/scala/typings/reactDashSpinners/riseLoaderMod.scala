package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import typings.reactDashSpinners.riseLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/RiseLoader", JSImport.Namespace)
@js.native
object riseLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeMarginProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeMarginProps = js.native
  }
  
}

