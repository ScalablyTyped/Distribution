package typings.projectNameGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Project = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Project]
  inline def apply(options: Options): Project = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Project]
  
  @JSImport("project-name-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Whether to output words beginning with the same letter or not
      * @default false
      */
    var alliterative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether a numeric suffix is generated or not. The number is between 1 - 9999, both inclusive.
      * @default false
      */
    var number: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of words generated (excluding number).
      * All words will be adjectives, except the last one which will be a noun
      * @default 2
      */
    var words: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlliterative(value: Boolean): Self = StObject.set(x, "alliterative", value.asInstanceOf[js.Any])
      
      inline def setAlliterativeUndefined: Self = StObject.set(x, "alliterative", js.undefined)
      
      inline def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  trait Project extends StObject {
    
    var dashed: String
    
    var raw: js.Array[String | Double]
    
    var spaced: String
  }
  object Project {
    
    inline def apply(dashed: String, raw: js.Array[String | Double], spaced: String): Project = {
      val __obj = js.Dynamic.literal(dashed = dashed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], spaced = spaced.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    extension [Self <: Project](x: Self) {
      
      inline def setDashed(value: String): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: js.Array[String | Double]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawVarargs(value: (String | Double)*): Self = StObject.set(x, "raw", js.Array(value*))
      
      inline def setSpaced(value: String): Self = StObject.set(x, "spaced", value.asInstanceOf[js.Any])
    }
  }
}
