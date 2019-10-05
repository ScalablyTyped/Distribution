package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.clipLoaderMod.Loader
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/ClipLoader", JSImport.Namespace)
@js.native
object clipLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
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

