package typings.reactDashSpinners.hashLoaderMod

import typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
import typings.react.reactMod.PureComponent
import typings.reactDashSpinners.interfacesMod.CalcFunction
import typings.reactDashSpinners.interfacesMod.LoaderSizeProps
import typings.reactDashSpinners.interfacesMod.StyleFunction
import typings.reactDashSpinners.interfacesMod.StyleFunctionWithIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader
  extends PureComponent[LoaderSizeProps, js.Object, js.Any] {
  var after: CalcFunction[Keyframes] = js.native
  var before: CalcFunction[Keyframes] = js.native
  var color: CalcFunction[String] = js.native
  var lat: CalcFunction[Double] = js.native
  var offset: CalcFunction[Double] = js.native
  var style: StyleFunctionWithIndex = js.native
  var thickness: CalcFunction[Double] = js.native
  var wrapper: StyleFunction = js.native
}

