package typings.reactNativePaper.anon

import typings.reactNativePaper.reactNativePaperStrings.checked
import typings.reactNativePaper.reactNativePaperStrings.indeterminate
import typings.reactNativePaper.reactNativePaperStrings.unchecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<{  status :'checked' | 'unchecked' | 'indeterminate',   disabled :boolean | undefined,   onPress :(): void | undefined,   uncheckedColor :string | undefined,   color :string | undefined,   theme :react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme,   testID :string | undefined}, 'color' | 'onPress' | 'testID' | 'disabled' | 'status' | 'uncheckedColor'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait Pickstatuscheckedunchecke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var status: checked | unchecked | indeterminate
  
  var testID: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
  
  var uncheckedColor: js.UndefOr[String] = js.undefined
}
object Pickstatuscheckedunchecke {
  
  inline def apply(status: checked | unchecked | indeterminate): Pickstatuscheckedunchecke = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pickstatuscheckedunchecke]
  }
  
  extension [Self <: Pickstatuscheckedunchecke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStatus(value: checked | unchecked | indeterminate): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUncheckedColor(value: String): Self = StObject.set(x, "uncheckedColor", value.asInstanceOf[js.Any])
    
    inline def setUncheckedColorUndefined: Self = StObject.set(x, "uncheckedColor", js.undefined)
  }
}
