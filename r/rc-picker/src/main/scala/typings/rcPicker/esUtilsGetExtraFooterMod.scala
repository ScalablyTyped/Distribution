package typings.rcPicker

import typings.rcPicker.esInterfaceMod.PanelMode
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetExtraFooterMod {
  
  @JSImport("rc-picker/es/utils/getExtraFooter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prefixCls: String, mode: PanelMode): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def default(
    prefixCls: String,
    mode: PanelMode,
    renderExtraFooter: js.Function1[/* mode */ PanelMode, ReactNode]
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], renderExtraFooter.asInstanceOf[js.Any])).asInstanceOf[Element]
}
