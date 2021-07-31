package typings.rmcFeedback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propTypesMod {
  
  trait ITouchProps extends StObject {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[js.Any] = js.undefined
    
    var children: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object ITouchProps {
    
    @scala.inline
    def apply(): ITouchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITouchProps]
    }
    
    @scala.inline
    implicit class ITouchPropsMutableBuilder[Self <: ITouchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: js.Any): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait ITouchState extends StObject {
    
    var active: Boolean
  }
  object ITouchState {
    
    @scala.inline
    def apply(active: Boolean): ITouchState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITouchState]
    }
    
    @scala.inline
    implicit class ITouchStateMutableBuilder[Self <: ITouchState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
}
