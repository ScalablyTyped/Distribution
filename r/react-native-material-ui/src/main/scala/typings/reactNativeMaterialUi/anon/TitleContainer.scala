package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleContainer extends StObject {
  
  var titleContainer: js.UndefOr[ViewStyle] = js.undefined
  
  var titleText: js.UndefOr[TextStyle] = js.undefined
}
object TitleContainer {
  
  inline def apply(): TitleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleContainer] (val x: Self) extends AnyVal {
    
    inline def setTitleContainer(value: ViewStyle): Self = StObject.set(x, "titleContainer", value.asInstanceOf[js.Any])
    
    inline def setTitleContainerNull: Self = StObject.set(x, "titleContainer", null)
    
    inline def setTitleContainerUndefined: Self = StObject.set(x, "titleContainer", js.undefined)
    
    inline def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setTitleTextNull: Self = StObject.set(x, "titleText", null)
    
    inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
  }
}
