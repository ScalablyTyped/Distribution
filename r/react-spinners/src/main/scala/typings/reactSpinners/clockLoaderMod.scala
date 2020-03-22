package typings.reactSpinners

import typings.react.mod.Component
import typings.reactSpinners.interfacesMod.LoaderSizeProps
import typings.reactSpinners.interfacesMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/ClockLoader", JSImport.Namespace)
@js.native
object clockLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderSizeProps, js.Object, js.Any] {
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: RequiredLoaderSizeProps = js.native
  }
  
}

