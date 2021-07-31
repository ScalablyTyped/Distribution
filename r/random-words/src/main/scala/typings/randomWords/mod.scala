package typings.randomWords

import typings.randomWords.anon.Optionsjoinstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(options: Double): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  @scala.inline
  def apply(options: Optionsjoinstring): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(options: Options): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
  
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random-words", "wordList")
  @js.native
  def wordList: js.Array[String] = js.native
  @scala.inline
  def wordList_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordList")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    var exactly: js.UndefOr[Double] = js.undefined
    
    var formatter: js.UndefOr[WordFormatter] = js.undefined
    
    var join: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var wordsPerString: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExactly(value: Double): Self = StObject.set(x, "exactly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactlyUndefined: Self = StObject.set(x, "exactly", js.undefined)
      
      @scala.inline
      def setFormatter(value: (/* word */ String, /* relativeIndex */ js.UndefOr[Double]) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setJoin(value: String): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
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
  
  type WordFormatter = js.Function2[/* word */ String, /* relativeIndex */ js.UndefOr[Double], String]
}
