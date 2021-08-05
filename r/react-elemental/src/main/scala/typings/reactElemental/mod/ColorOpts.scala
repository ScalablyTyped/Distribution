package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorOpts extends StObject {
  
  var primary: js.UndefOr[String] = js.undefined
  
  var primaryDark: js.UndefOr[String] = js.undefined
  
  var primaryLight: js.UndefOr[String] = js.undefined
}
object ColorOpts {
  
  inline def apply(): ColorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpts]
  }
  
  extension [Self <: ColorOpts](x: Self) {
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDark(value: String): Self = StObject.set(x, "primaryDark", value.asInstanceOf[js.Any])
    
    inline def setPrimaryDarkUndefined: Self = StObject.set(x, "primaryDark", js.undefined)
    
    inline def setPrimaryLight(value: String): Self = StObject.set(x, "primaryLight", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLightUndefined: Self = StObject.set(x, "primaryLight", js.undefined)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
  }
}
