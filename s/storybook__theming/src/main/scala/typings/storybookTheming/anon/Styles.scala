package typings.storybookTheming.anon

import typings.storybookTheming.emotionReactNodeModulesemotionSerializeTypesIndexMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styles extends StObject {
  
  var styles: Interpolation[typings.storybookTheming.mod.Theme]
}
object Styles {
  
  inline def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  extension [Self <: Styles](x: Self) {
    
    inline def setStyles(value: Interpolation[typings.storybookTheming.mod.Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
