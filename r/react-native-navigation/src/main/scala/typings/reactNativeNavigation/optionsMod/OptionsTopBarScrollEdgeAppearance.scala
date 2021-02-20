package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarScrollEdgeAppearance extends StObject {
  
  var active: Boolean = js.native
  
  var background: js.UndefOr[OptionsTopBarScrollEdgeAppearanceBackground] = js.native
}
object OptionsTopBarScrollEdgeAppearance {
  
  @scala.inline
  def apply(active: Boolean): OptionsTopBarScrollEdgeAppearance = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearance]
  }
  
  @scala.inline
  implicit class OptionsTopBarScrollEdgeAppearanceMutableBuilder[Self <: OptionsTopBarScrollEdgeAppearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: OptionsTopBarScrollEdgeAppearanceBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
