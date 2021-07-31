package typings.snowballStemmers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snowball-stemmers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def algorithms(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("algorithms")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def newStemmer(locale: String): Stemmer = ^.asInstanceOf[js.Dynamic].applyDynamic("newStemmer")(locale.asInstanceOf[js.Any]).asInstanceOf[Stemmer]
  
  trait Stemmer extends StObject {
    
    def stem(term: String): String
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
