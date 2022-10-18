package typings.rcSelect

import typings.rcSelect.libSelectMod.BaseOptionType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsLegacyUtilMod {
  
  @JSImport("rc-select/lib/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertChildrenToData[OptionType /* <: BaseOptionType */](nodes: ReactNode): js.Array[OptionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[OptionType]]
  inline def convertChildrenToData[OptionType /* <: BaseOptionType */](nodes: ReactNode, optionOnly: Boolean): js.Array[OptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any], optionOnly.asInstanceOf[js.Any])).asInstanceOf[js.Array[OptionType]]
}
