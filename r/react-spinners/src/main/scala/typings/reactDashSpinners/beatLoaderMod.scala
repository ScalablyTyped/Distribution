package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.beatLoaderMod.Loader
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/BeatLoader", JSImport.Namespace)
@js.native
object beatLoaderMod extends js.Object {
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

