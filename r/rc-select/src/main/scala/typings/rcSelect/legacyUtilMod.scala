package typings.rcSelect

import typings.rcSelect.interfaceMod.OptionsType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-select/lib/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertChildrenToData(nodes: ReactNode): OptionsType = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[OptionsType]
  inline def convertChildrenToData(nodes: ReactNode, optionOnly: Boolean): OptionsType = (^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any], optionOnly.asInstanceOf[js.Any])).asInstanceOf[OptionsType]
}
