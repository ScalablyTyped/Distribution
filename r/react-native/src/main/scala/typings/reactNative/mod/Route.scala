package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route
  extends StObject
     with //anything else
/* key */ StringDictionary[js.Any] {
  
  //Commonly found properties
  var backButtonTitle: js.UndefOr[String] = js.undefined
  
  var component: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onRightButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var passProps: js.UndefOr[js.Object] = js.undefined
  
  var rightButtonTitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var wrapperStyle: js.UndefOr[js.Any] = js.undefined
}
object Route {
  
  @scala.inline
  def apply(): Route = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackButtonTitle(value: String): Self = StObject.set(x, "backButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackButtonTitleUndefined: Self = StObject.set(x, "backButtonTitle", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOnRightButtonPress(value: () => Unit): Self = StObject.set(x, "onRightButtonPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRightButtonPressUndefined: Self = StObject.set(x, "onRightButtonPress", js.undefined)
    
    @scala.inline
    def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    
    @scala.inline
    def setRightButtonTitle(value: String): Self = StObject.set(x, "rightButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonTitleUndefined: Self = StObject.set(x, "rightButtonTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWrapperStyle(value: js.Any): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}
