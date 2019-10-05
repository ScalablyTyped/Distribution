package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.interfacesMod.LoaderSizeMarginProps
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import typings.reactDashSpinners.syncLoaderMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/SyncLoader", JSImport.Namespace)
@js.native
object syncLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderSizeMarginProps, js.Object, js.Any] {
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

