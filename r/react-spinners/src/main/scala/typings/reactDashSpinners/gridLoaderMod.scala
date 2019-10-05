package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.gridLoaderMod.Loader
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/GridLoader", JSImport.Namespace)
@js.native
object gridLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeMarginProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderSizeMarginProps = js.native
  }
  
}

