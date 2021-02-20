package typings.requireFromString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  def apply(code: String): js.Any = js.native
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  def apply(code: String, filename: js.UndefOr[scala.Nothing], options: Options): js.Any = js.native
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  def apply(code: String, filename: String): js.Any = js.native
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  def apply(code: String, filename: String, options: Options): js.Any = js.native
  @JSImport("require-from-string", JSImport.Namespace)
  @js.native
  def apply(code: String, options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * List of `paths`, that will be appended to module `paths`.
      * Useful when you want to be able require modules from these paths.
      */
    var appendPaths: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * List of `paths`, that will be preppended to module `paths`.
      * Useful when you want to be able require modules from these paths.
      */
    var prependPaths: js.UndefOr[js.Array[String]] = js.native
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
      def setAppendPaths(value: js.Array[String]): Self = StObject.set(x, "appendPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendPathsUndefined: Self = StObject.set(x, "appendPaths", js.undefined)
      
      @scala.inline
      def setAppendPathsVarargs(value: String*): Self = StObject.set(x, "appendPaths", js.Array(value :_*))
      
      @scala.inline
      def setPrependPaths(value: js.Array[String]): Self = StObject.set(x, "prependPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependPathsUndefined: Self = StObject.set(x, "prependPaths", js.undefined)
      
      @scala.inline
      def setPrependPathsVarargs(value: String*): Self = StObject.set(x, "prependPaths", js.Array(value :_*))
    }
  }
}
