package typings.sqlFormatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Indent extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String] | js.Array[String]] = js.undefined
  }
  object Indent {
    
    @scala.inline
    def apply(): Indent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indent]
    }
    
    @scala.inline
    implicit class IndentMutableBuilder[Self <: Indent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[String] | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
}
