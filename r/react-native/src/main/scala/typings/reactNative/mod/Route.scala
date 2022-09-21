package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route
  extends StObject
     with //anything else
/* key */ StringDictionary[Any] {
  
  //Commonly found properties
  var backButtonTitle: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onRightButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var passProps: js.UndefOr[js.Object] = js.undefined
  
  var rightButtonTitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var wrapperStyle: js.UndefOr[Any] = js.undefined
}
object Route {
  
  inline def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setBackButtonTitle(value: String): Self = StObject.set(x, "backButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setBackButtonTitleUndefined: Self = StObject.set(x, "backButtonTitle", js.undefined)
    
    inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnRightButtonPress(value: () => Unit): Self = StObject.set(x, "onRightButtonPress", js.Any.fromFunction0(value))
    
    inline def setOnRightButtonPressUndefined: Self = StObject.set(x, "onRightButtonPress", js.undefined)
    
    inline def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    
    inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    
    inline def setRightButtonTitle(value: String): Self = StObject.set(x, "rightButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setRightButtonTitleUndefined: Self = StObject.set(x, "rightButtonTitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWrapperStyle(value: Any): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
