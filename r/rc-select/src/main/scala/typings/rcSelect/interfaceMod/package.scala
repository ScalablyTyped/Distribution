package typings.rcSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type OnActiveValue = js.Function3[
    /* active */ typings.rcSelect.generatorMod.RawValueType, 
    /* index */ scala.Double, 
    /* info */ js.UndefOr[typings.rcSelect.anon.Source], 
    scala.Unit
  ]
  
  type OptionsType = js.Array[
    typings.rcSelect.interfaceMod.OptionData | typings.rcSelect.interfaceMod.OptionGroupData
  ]
  
  type RenderDOMFunc = js.Function1[/* props */ js.Any, typings.std.HTMLElement]
  
  type RenderNode = typings.react.mod.ReactNode | (js.Function1[/* props */ js.Any, typings.react.mod.ReactNode])
}
