package typings.prosemirrorHistory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Depth extends StObject {
    
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    var newGroupDelay: js.UndefOr[Double | Null] = js.undefined
  }
  object Depth {
    
    @scala.inline
    def apply(): Depth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Depth]
    }
    
    @scala.inline
    implicit class DepthMutableBuilder[Self <: Depth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthNull: Self = StObject.set(x, "depth", null)
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setNewGroupDelay(value: Double): Self = StObject.set(x, "newGroupDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewGroupDelayNull: Self = StObject.set(x, "newGroupDelay", null)
      
      @scala.inline
      def setNewGroupDelayUndefined: Self = StObject.set(x, "newGroupDelay", js.undefined)
    }
  }
}
