package typings.randomatic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Chars extends StObject {
    
    var chars: js.UndefOr[String] = js.native
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Chars {
    
    @scala.inline
    def apply(): Chars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chars]
    }
    
    @scala.inline
    implicit class CharsMutableBuilder[Self <: Chars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      @scala.inline
      def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
}
