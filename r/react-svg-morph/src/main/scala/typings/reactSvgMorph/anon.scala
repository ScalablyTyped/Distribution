package typings.reactSvgMorph

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait From extends StObject {
    
    var from: ReactElement = js.native
    
    var to: ReactElement = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: ReactElement, to: ReactElement): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: ReactElement): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: ReactElement): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
