package typings.storybookTheming.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[Theme /* <: js.Object */] extends StObject {
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object `1` {
  
  inline def apply[Theme /* <: js.Object */](): `1`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[Theme]]
  }
  
  extension [Self <: `1`[?], Theme /* <: js.Object */](x: Self & `1`[Theme]) {
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
