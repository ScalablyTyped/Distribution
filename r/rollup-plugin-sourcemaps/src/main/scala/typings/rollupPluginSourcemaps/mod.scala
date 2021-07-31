package typings.rollupPluginSourcemaps

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.rollup.mod.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  @scala.inline
  def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("rollup-plugin-sourcemaps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
    
    var include: js.UndefOr[(js.Array[String | RegExp]) | String | RegExp | Null] = js.undefined
    
    var readFile: js.UndefOr[ReadFileFunction] = js.undefined
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
      def setExclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeNull: Self = StObject.set(x, "exclude", null)
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: (js.Array[String | RegExp]) | String | RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNull: Self = StObject.set(x, "include", null)
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setReadFile(
        value: (/* file */ String | Buffer | Double, /* encoding */ String, /* callback */ ReadFileCallback) => Unit
      ): Self = StObject.set(x, "readFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    }
  }
  
  type ReadFileCallback = js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  
  type ReadFileFunction = js.Function3[
    /* file */ String | Buffer | Double, 
    /* encoding */ String, 
    /* callback */ ReadFileCallback, 
    Unit
  ]
}
