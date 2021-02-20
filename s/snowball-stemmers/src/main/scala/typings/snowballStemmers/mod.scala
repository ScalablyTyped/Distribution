package typings.snowballStemmers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snowball-stemmers", "algorithms")
  @js.native
  def algorithms(): js.Array[String] = js.native
  
  @JSImport("snowball-stemmers", "newStemmer")
  @js.native
  def newStemmer(locale: String): Stemmer = js.native
  
  @js.native
  trait Stemmer extends StObject {
    
    def stem(term: String): String = js.native
  }
  object Stemmer {
    
    @scala.inline
    def apply(stem: String => String): Stemmer = {
      val __obj = js.Dynamic.literal(stem = js.Any.fromFunction1(stem))
      __obj.asInstanceOf[Stemmer]
    }
    
    @scala.inline
    implicit class StemmerMutableBuilder[Self <: Stemmer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStem(value: String => String): Self = StObject.set(x, "stem", js.Any.fromFunction1(value))
    }
  }
}
