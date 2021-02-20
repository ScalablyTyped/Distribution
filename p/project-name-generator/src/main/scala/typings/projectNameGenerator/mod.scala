package typings.projectNameGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("project-name-generator", JSImport.Namespace)
  @js.native
  def apply(): Project = js.native
  @JSImport("project-name-generator", JSImport.Namespace)
  @js.native
  def apply(options: Options): Project = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Whether to output words beginning with the same letter or not
      * @default false
      */
    var alliterative: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether a numeric suffix is generated or not. The number is between 1 - 9999, both inclusive.
      * @default false
      */
    var number: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of words generated (excluding number).
      * All words will be adjectives, except the last one which will be a noun
      * @default 2
      */
    var words: js.UndefOr[Double] = js.native
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
      def setAlliterative(value: Boolean): Self = StObject.set(x, "alliterative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlliterativeUndefined: Self = StObject.set(x, "alliterative", js.undefined)
      
      @scala.inline
      def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    }
  }
  
  @js.native
  trait Project extends StObject {
    
    var dashed: String = js.native
    
    var raw: js.Array[String | Double] = js.native
    
    var spaced: String = js.native
  }
  object Project {
    
    @scala.inline
    def apply(dashed: String, raw: js.Array[String | Double], spaced: String): Project = {
      val __obj = js.Dynamic.literal(dashed = dashed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], spaced = spaced.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    @scala.inline
    implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashed(value: String): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: js.Array[String | Double]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawVarargs(value: (String | Double)*): Self = StObject.set(x, "raw", js.Array(value :_*))
      
      @scala.inline
      def setSpaced(value: String): Self = StObject.set(x, "spaced", value.asInstanceOf[js.Any])
    }
  }
}
