package typings.rcTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait KeepParent extends StObject {
    
    var keepParent: js.UndefOr[Boolean] = js.undefined
  }
  object KeepParent {
    
    @scala.inline
    def apply(): KeepParent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepParent]
    }
    
    @scala.inline
    implicit class KeepParentMutableBuilder[Self <: KeepParent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepParent(value: Boolean): Self = StObject.set(x, "keepParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepParentUndefined: Self = StObject.set(x, "keepParent", js.undefined)
    }
  }
}
