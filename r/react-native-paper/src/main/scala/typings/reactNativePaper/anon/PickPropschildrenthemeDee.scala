package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-paper.react-native-paper/lib/typescript/components/Portal/Portal.Props, 'children'> & {  theme :@callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme> | undefined} */
trait PickPropschildrenthemeDee extends StObject {
  
  var children: ReactNode
  
  var theme: js.UndefOr[DeepPartialTheme] = js.undefined
}
object PickPropschildrenthemeDee {
  
  inline def apply(): PickPropschildrenthemeDee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPropschildrenthemeDee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPropschildrenthemeDee] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setTheme(value: DeepPartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
