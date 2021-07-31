package typings.randomWords

import typings.randomWords.mod.WordFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined random-words.random-words.Options & {  join :string} */
  trait Optionsjoinstring extends StObject {
    
    var exactly: js.UndefOr[Double] = js.undefined
    
    var formatter: js.UndefOr[WordFormatter] = js.undefined
    
    var join: js.UndefOr[String] & String
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var wordsPerString: js.UndefOr[Double] = js.undefined
  }
  object Optionsjoinstring {
    
    @scala.inline
    def apply(join: js.UndefOr[String] & String): Optionsjoinstring = {
      val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsjoinstring]
    }
    
    @scala.inline
    implicit class OptionsjoinstringMutableBuilder[Self <: Optionsjoinstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExactly(value: Double): Self = StObject.set(x, "exactly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactlyUndefined: Self = StObject.set(x, "exactly", js.undefined)
      
      @scala.inline
      def setFormatter(value: (/* word */ String, /* relativeIndex */ js.UndefOr[Double]) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setJoin(value: js.UndefOr[String] & String): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setWordsPerString(value: Double): Self = StObject.set(x, "wordsPerString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsPerStringUndefined: Self = StObject.set(x, "wordsPerString", js.undefined)
    }
  }
}
