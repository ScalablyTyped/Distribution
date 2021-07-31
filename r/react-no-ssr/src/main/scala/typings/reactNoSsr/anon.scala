package typings.reactNoSsr

import typings.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnSSR extends StObject {
    
    var onSSR: js.UndefOr[ReactChild] = js.undefined
  }
  object OnSSR {
    
    @scala.inline
    def apply(): OnSSR = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSSR]
    }
    
    @scala.inline
    implicit class OnSSRMutableBuilder[Self <: OnSSR] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSSR(value: ReactChild): Self = StObject.set(x, "onSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSSRUndefined: Self = StObject.set(x, "onSSR", js.undefined)
    }
  }
}
