package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarScrollEdgeAppearanceBackground extends StObject {
  
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object OptionsTopBarScrollEdgeAppearanceBackground {
  
  inline def apply(): OptionsTopBarScrollEdgeAppearanceBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearanceBackground]
  }
  
  extension [Self <: OptionsTopBarScrollEdgeAppearanceBackground](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
