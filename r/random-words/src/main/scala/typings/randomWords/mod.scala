package typings.randomWords

import typings.randomWords.anon.Optionsjoinstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  def apply(options: Double): String | js.Array[String] = js.native
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  def apply(options: Optionsjoinstring): String = js.native
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  def apply(options: Options): String | js.Array[String] = js.native
  
  @JSImport("random-words", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random-words", "wordList")
  @js.native
  def wordList: js.Array[String] = js.native
  @scala.inline
  def wordList_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordList")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    var exactly: js.UndefOr[Double] = js.native
    
    var formatter: js.UndefOr[WordFormatter] = js.native
    
    var join: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var wordsPerString: js.UndefOr[Double] = js.native
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
