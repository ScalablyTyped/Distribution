package typings.sortJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Sorts the keys on objects
    * @param old An object to sort the keys of, if not object just returns whatever
    * was given
    */
  @JSImport("sort-json", JSImport.Namespace)
  @js.native
  def apply[T](old: T): T = js.native
  @JSImport("sort-json", JSImport.Namespace)
  @js.native
  def apply[T](old: T, options: VisitOptions): T = js.native
  
  /**
    * Sorts the JSON files with the `visit()` function and then overwrites the
    * file with sorted JSON
    * @param absolutePaths
    * * String: Absolute path to JSON file to sort and overwrite
    * * Array: Absolute paths to JSON files to sort and overwrite
    */
  @JSImport("sort-json", "overwrite")
  @js.native
  def overwrite(absolutePaths: String): js.Any = js.native
  @JSImport("sort-json", "overwrite")
  @js.native
  def overwrite(absolutePaths: String, options: OverwriteOptions): js.Any = js.native
  @JSImport("sort-json", "overwrite")
  @js.native
  def overwrite(absolutePaths: js.Array[String]): js.Any = js.native
  @JSImport("sort-json", "overwrite")
  @js.native
  def overwrite(absolutePaths: js.Array[String], options: OverwriteOptions): js.Any = js.native
  
  @js.native
  trait OverwriteOptions extends VisitOptions {
    
    /**
      * Formats the file content with an indentation of spaces. Use a number
      * greater then 0 for the value (default: detects the used indentation
      * of the file)
      */
    var indentSize: js.UndefOr[Double] = js.native
    
    /** Default: `false` */
    var noFinalNewLine: js.UndefOr[Boolean] = js.native
  }
  object OverwriteOptions {
    
    @scala.inline
    def apply(): OverwriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverwriteOptions]
    }
    
    @scala.inline
    implicit class OverwriteOptionsMutableBuilder[Self <: OverwriteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      @scala.inline
      def setNoFinalNewLine(value: Boolean): Self = StObject.set(x, "noFinalNewLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFinalNewLineUndefined: Self = StObject.set(x, "noFinalNewLine", js.undefined)
    }
  }
  
  @js.native
  trait VisitOptions extends StObject {
    
    /**
      * Depth's level sorting keys on a multidimensional object
      * (default: `Infinity`)
      */
    var depth: js.UndefOr[Double] = js.native
    
    /**
      * When sorting keys, converts all keys to lowercase so that
      * capitalization doesn't interfere with sort order (default: `false`)
      */
    var ignoreCase: js.UndefOr[Boolean] = js.native
    
    /** Default: `1` */
    var level: js.UndefOr[Double] = js.native
    
    /** Reverse the ordering z -> a (default: `false`) */
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object VisitOptions {
    
    @scala.inline
    def apply(): VisitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisitOptions]
    }
    
    @scala.inline
    implicit class VisitOptionsMutableBuilder[Self <: VisitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
}
