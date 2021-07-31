package typings.searchjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: Boolean
    
    var joinAnd: String
    
    var negator: Boolean
    
    var propertySearch: Boolean
    
    var propertySearchDepth: Double
    
    var separator: String
    
    var start: Boolean
    
    var text: Boolean
    
    var word: Boolean
  }
  object End {
    
    @scala.inline
    def apply(
      end: Boolean,
      joinAnd: String,
      negator: Boolean,
      propertySearch: Boolean,
      propertySearchDepth: Double,
      separator: String,
      start: Boolean,
      text: Boolean,
      word: Boolean
    ): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], joinAnd = joinAnd.asInstanceOf[js.Any], negator = negator.asInstanceOf[js.Any], propertySearch = propertySearch.asInstanceOf[js.Any], propertySearchDepth = propertySearchDepth.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinAnd(value: String): Self = StObject.set(x, "joinAnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegator(value: Boolean): Self = StObject.set(x, "negator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertySearch(value: Boolean): Self = StObject.set(x, "propertySearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertySearchDepth(value: Double): Self = StObject.set(x, "propertySearchDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWord(value: Boolean): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    }
  }
}
