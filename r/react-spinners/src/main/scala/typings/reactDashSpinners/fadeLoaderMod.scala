package typings.reactDashSpinners

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.fadeLoaderMod.Loader
import typings.reactDashSpinners.interfacesMod.LoaderHeightWidthRadiusProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-spinners/FadeLoader", JSImport.Namespace)
@js.native
object fadeLoaderMod extends js.Object {
  @js.native
  trait Loader
    extends PureComponent[LoaderHeightWidthRadiusProps, js.Object, js.Any] {
    var a: StyleFunction = js.native
    var b: StyleFunction = js.native
    var c: StyleFunction = js.native
    var d: StyleFunction = js.native
    var e: StyleFunction = js.native
    var f: StyleFunction = js.native
    var g: StyleFunction = js.native
    var h: StyleFunction = js.native
    var quarter: Double = js.native
    var radius: Double = js.native
    var style: StyleFunctionWithIndex = js.native
    var wrapper: StyleFunction = js.native
  }
  
  @js.native
  class default () extends Loader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: LoaderHeightWidthRadiusProps = js.native
  }
  
}

