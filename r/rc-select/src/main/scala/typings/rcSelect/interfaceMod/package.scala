package typings.rcSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type OptionsType = js.Array[
    typings.rcSelect.interfaceMod.OptionData | typings.rcSelect.interfaceMod.OptionGroupData
  ]
  type RenderDOMFunc = js.Function1[/* props */ js.Any, typings.std.HTMLElement]
  type RenderNode = typings.react.mod.ReactNode | (js.Function1[/* props */ js.Any, typings.react.mod.ReactNode])
}
