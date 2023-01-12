package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarScrollEdgeAppearance extends StObject {
  
  var active: Boolean
  
  var background: js.UndefOr[OptionsTopBarScrollEdgeAppearanceBackground] = js.undefined
  
  /**
    * Change the navbar border color
    */
  var borderColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Disable the border on bottom of the navbar
    * #### (iOS specific)
    * @default false
    */
  var noBorder: js.UndefOr[Boolean] = js.undefined
}
object OptionsTopBarScrollEdgeAppearance {
  
  inline def apply(active: Boolean): OptionsTopBarScrollEdgeAppearance = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsTopBarScrollEdgeAppearance] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: OptionsTopBarScrollEdgeAppearanceBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setNoBorder(value: Boolean): Self = StObject.set(x, "noBorder", value.asInstanceOf[js.Any])
    
    inline def setNoBorderUndefined: Self = StObject.set(x, "noBorder", js.undefined)
  }
}
