package typings.rcComponentColorPicker

import typings.rcComponentColorPicker.anon.DefaultValue
import typings.rcComponentColorPicker.esColorMod.Color
import typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseColorStateMod {
  
  @JSImport("@rc-component/color-picker/es/hooks/useColorState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(defaultStateValue: ColorValue, option: DefaultValue): js.Tuple2[Color, Dispatch[SetStateAction[Color]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Color, Dispatch[SetStateAction[Color]]]]
  
  type ColorValue = js.UndefOr[ColorGenInput[Color]]
}
