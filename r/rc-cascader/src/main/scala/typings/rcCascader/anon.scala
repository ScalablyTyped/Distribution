package typings.rcCascader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Visible extends StObject {
    
    var visible: js.Any
  }
  object Visible {
    
    @scala.inline
    def apply(visible: js.Any): Visible = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visible]
    }
    
    @scala.inline
    implicit class VisibleMutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: js.Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
