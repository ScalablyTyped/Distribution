package typings.sanitizeFilename

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Replacement extends StObject {
    
    var replacement: js.UndefOr[String | (js.Function1[/* substring */ String, String])] = js.native
  }
  object Replacement {
    
    @scala.inline
    def apply(): Replacement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replacement]
    }
    
    @scala.inline
    implicit class ReplacementMutableBuilder[Self <: Replacement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacement(value: String | (js.Function1[/* substring */ String, String])): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementFunction1(value: /* substring */ String => String): Self = StObject.set(x, "replacement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
}
