package typings.reactDashSpinners.moonLoaderMod

import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.interfacesMod.CalcFunction
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.PrecompiledCss
import typings.reactDashSpinners.interfacesMod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader
  extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
  var ball: CalcFunction[PrecompiledCss] = js.native
  var ballStyle: BallStyleFunction = js.native
  var circle: CalcFunction[PrecompiledCss] = js.native
  var moonSize: CalcFunction[Double] = js.native
  var wrapper: StyleFunction = js.native
}

