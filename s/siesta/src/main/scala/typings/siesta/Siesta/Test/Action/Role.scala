package typings.siesta.Siesta.Test.Action

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Role {
  
  /**
    * @mixin
    */
  trait IHasTarget extends StObject {
    
    var el: js.UndefOr[js.Any] = js.undefined
    
    var passTargetToNext: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Any] = js.undefined
  }
  object IHasTarget {
    
    @scala.inline
    def apply(): IHasTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasTarget]
    }
    
    @scala.inline
    implicit class IHasTargetMutableBuilder[Self <: IHasTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setPassTargetToNext(value: Boolean): Self = StObject.set(x, "passTargetToNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassTargetToNextUndefined: Self = StObject.set(x, "passTargetToNext", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
