package typings.storybookBuilderWebpack4

import typings.webpack.mod.CallbackWebpack
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.MultiCompilerOptions
import typings.webpack.mod.MultiStats
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exclude extends StObject {
    
    var exclude: js.RegExp
    
    var include: js.Array[String]
    
    var test: js.RegExp
    
    var use: js.Array[Loader]
  }
  object Exclude {
    
    inline def apply(exclude: js.RegExp, include: js.Array[String], test: js.RegExp, use: js.Array[Loader]): Exclude = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setUse(value: js.Array[Loader]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseVarargs(value: Loader*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = js.native
    def apply(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = js.native
    def apply(options: Configuration): Compiler = js.native
    def apply(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = js.native
  }
  
  trait Loader extends StObject {
    
    var loader: String
    
    var options: Any
  }
  object Loader {
    
    inline def apply(loader: String, options: Any): Loader = {
      val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
      
      inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
