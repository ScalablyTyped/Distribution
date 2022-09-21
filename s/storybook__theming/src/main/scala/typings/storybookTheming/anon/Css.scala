package typings.storybookTheming.anon

import typings.storybookTheming.emotionReactNodeModulesemotionSerializeTypesIndexMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  var css: js.UndefOr[Interpolation[typings.storybookTheming.emotionReactTypesIndexMod.Theme]] = js.undefined
}
object Css {
  
  inline def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  extension [Self <: Css](x: Self) {
    
    inline def setCss(value: Interpolation[typings.storybookTheming.emotionReactTypesIndexMod.Theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssNull: Self = StObject.set(x, "css", null)
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
  }
}
