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
  
  @scala.inline
  def apply(): TitleContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleContainer]
  }
  
  @scala.inline
  implicit class TitleContainerMutableBuilder[Self <: TitleContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitleContainer(value: ViewStyle): Self = StObject.set(x, "titleContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleContainerNull: Self = StObject.set(x, "titleContainer", null)
    
    @scala.inline
    def setTitleContainerUndefined: Self = StObject.set(x, "titleContainer", js.undefined)
    
    @scala.inline
    def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextNull: Self = StObject.set(x, "titleText", null)
    
    @scala.inline
    def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
  }
}
