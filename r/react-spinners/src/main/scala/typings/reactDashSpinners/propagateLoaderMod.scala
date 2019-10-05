package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import typings.reactDashSpinners.propagateLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/PropagateLoader", JSImport.Namespace)
@js.native
object propagateLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
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

