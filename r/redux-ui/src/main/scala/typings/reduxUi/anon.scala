package typings.reduxUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Pure extends StObject {
    
    var pure: js.UndefOr[Boolean] = js.native
    
    var withRef: js.UndefOr[Boolean] = js.native
  }
  object Pure {
    
    @scala.inline
    def apply(): Pure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pure]
    }
    
    @scala.inline
    implicit class PureMutableBuilder[Self <: Pure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
}
