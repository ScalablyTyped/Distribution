package typings.snowballStemmers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snowball-stemmers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def algorithms(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("algorithms")().asInstanceOf[js.Array[String]]
  
  inline def newStemmer(locale: String): Stemmer = ^.asInstanceOf[js.Dynamic].applyDynamic("newStemmer")(locale.asInstanceOf[js.Any]).asInstanceOf[Stemmer]
  
  trait Stemmer extends StObject {
    
    def stem(term: String): String
  }
  object Stemmer {
    
    inline def apply(stem: String => String): Stemmer = {
      val __obj = js.Dynamic.literal(stem = js.Any.fromFunction1(stem))
      __obj.asInstanceOf[Stemmer]
    }
    
    extension [Self <: Stemmer](x: Self) {
      
      inline def setStem(value: String => String): Self = StObject.set(x, "stem", js.Any.fromFunction1(value))
    }
  }
}
