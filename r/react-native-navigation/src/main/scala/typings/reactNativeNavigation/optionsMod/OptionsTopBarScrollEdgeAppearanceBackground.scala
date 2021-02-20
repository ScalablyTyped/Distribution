package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarScrollEdgeAppearanceBackground extends StObject {
  
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object OptionsTopBarScrollEdgeAppearanceBackground {
  
  @scala.inline
  def apply(): OptionsTopBarScrollEdgeAppearanceBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearanceBackground]
  }
  
  @scala.inline
  implicit class OptionsTopBarScrollEdgeAppearanceBackgroundMutableBuilder[Self <: OptionsTopBarScrollEdgeAppearanceBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
