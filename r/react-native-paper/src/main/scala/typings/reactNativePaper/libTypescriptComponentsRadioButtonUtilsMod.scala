package typings.reactNativePaper

import typings.reactNativePaper.anon.ContextValue
import typings.reactNativePaper.anon.OnValueChange
import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsRadioButtonUtilsMod {
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handlePress(hasOnPressValueOnValueChange: OnValueChange): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handlePress")(hasOnPressValueOnValueChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isChecked(hasValueStatusContextValue: ContextValue): js.UndefOr[checked | unchecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("isChecked")(hasValueStatusContextValue.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[checked | unchecked]]
}
