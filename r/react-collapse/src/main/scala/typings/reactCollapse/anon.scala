package typings.reactCollapse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Collapse extends StObject {
    
    var collapse: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
  }
  object Collapse {
    
    @scala.inline
    def apply(): Collapse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Collapse]
    }
    
    @scala.inline
    implicit class CollapseMutableBuilder[Self <: Collapse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapse(value: String): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    }
  }
}
