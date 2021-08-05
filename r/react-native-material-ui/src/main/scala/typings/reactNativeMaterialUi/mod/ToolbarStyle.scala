package typings.reactNativeMaterialUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarStyle extends StObject {
  
  var centerElementContainer: js.UndefOr[ViewStyle] = js.undefined
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var leftElement: js.UndefOr[TextStyle] = js.undefined
  
  var leftElementContainer: js.UndefOr[ViewStyle] = js.undefined
  
  var rightElement: js.UndefOr[TextStyle] = js.undefined
  
  var rightElementContainer: js.UndefOr[ViewStyle] = js.undefined
  
  var titleText: js.UndefOr[TextStyle] = js.undefined
}
object ToolbarStyle {
  
  inline def apply(): ToolbarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarStyle]
  }
  
  extension [Self <: ToolbarStyle](x: Self) {
    
    inline def setCenterElementContainer(value: ViewStyle): Self = StObject.set(x, "centerElementContainer", value.asInstanceOf[js.Any])
    
    inline def setCenterElementContainerNull: Self = StObject.set(x, "centerElementContainer", null)
    
    inline def setCenterElementContainerUndefined: Self = StObject.set(x, "centerElementContainer", js.undefined)
    
    inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setLeftElement(value: TextStyle): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    inline def setLeftElementContainer(value: ViewStyle): Self = StObject.set(x, "leftElementContainer", value.asInstanceOf[js.Any])
    
    inline def setLeftElementContainerNull: Self = StObject.set(x, "leftElementContainer", null)
    
    inline def setLeftElementContainerUndefined: Self = StObject.set(x, "leftElementContainer", js.undefined)
    
    inline def setLeftElementNull: Self = StObject.set(x, "leftElement", null)
    
    inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    inline def setRightElement(value: TextStyle): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    inline def setRightElementContainer(value: ViewStyle): Self = StObject.set(x, "rightElementContainer", value.asInstanceOf[js.Any])
    
    inline def setRightElementContainerNull: Self = StObject.set(x, "rightElementContainer", null)
    
    inline def setRightElementContainerUndefined: Self = StObject.set(x, "rightElementContainer", js.undefined)
    
    inline def setRightElementNull: Self = StObject.set(x, "rightElement", null)
    
    inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    inline def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setTitleTextNull: Self = StObject.set(x, "titleText", null)
    
    inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
  }
}
