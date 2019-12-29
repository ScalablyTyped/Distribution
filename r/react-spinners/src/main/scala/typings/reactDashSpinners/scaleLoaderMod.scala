package typings.reactDashSpinners

import typings.react.reactMod.Component
import typings.reactDashSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/ScaleLoader", JSImport.Namespace)
@js.native
object scaleLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends Component[LoaderHeightWidthRadiusProps, js.Object, js.Any] {
    var style: StyleFunctionWithIndex = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderHeightWidthRadiusProps = js.native
  }
  
}

