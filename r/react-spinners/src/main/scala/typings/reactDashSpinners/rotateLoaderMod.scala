package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import typings.reactDashSpinners.rotateLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/RotateLoader", JSImport.Namespace)
@js.native
object rotateLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeMarginProps, js.Object, js.Any] {
    var ball: StyleFunction = js.native
    var long: StyleFunction = js.native
    var short: StyleFunction = js.native
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

