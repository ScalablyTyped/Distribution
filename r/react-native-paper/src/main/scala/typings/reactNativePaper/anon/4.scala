package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var theme: js.UndefOr[typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setTheme(value: typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
