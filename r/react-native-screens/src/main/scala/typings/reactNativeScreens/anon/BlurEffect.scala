package typings.reactNativeScreens.anon

import typings.reactNativeScreens.typescriptTypesMod.BlurEffectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurEffect extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var blurEffect: js.UndefOr[BlurEffectTypes] = js.undefined
}
object BlurEffect {
  
  inline def apply(): BlurEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlurEffect]
  }
  
  extension [Self <: BlurEffect](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBlurEffect(value: BlurEffectTypes): Self = StObject.set(x, "blurEffect", value.asInstanceOf[js.Any])
    
    inline def setBlurEffectUndefined: Self = StObject.set(x, "blurEffect", js.undefined)
  }
}
