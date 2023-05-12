package typings.reactSimpleOauth2Login

import typings.react.mod.ReactChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ButtonText extends StObject {
    
    var buttonText: String
    
    var children: ReactChildren
    
    var className: String
    
    def onClick(): Unit
  }
  object ButtonText {
    
    inline def apply(buttonText: String, children: ReactChildren, className: String, onClick: () => Unit): ButtonText = {
      val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    }
  }
}
