package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarScrollEdgeAppearance extends StObject {
  
  var active: Boolean
  
  var background: js.UndefOr[OptionsTopBarScrollEdgeAppearanceBackground] = js.undefined
}
object OptionsTopBarScrollEdgeAppearance {
  
  inline def apply(active: Boolean): OptionsTopBarScrollEdgeAppearance = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearance]
  }
  
  extension [Self <: OptionsTopBarScrollEdgeAppearance](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: OptionsTopBarScrollEdgeAppearanceBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
