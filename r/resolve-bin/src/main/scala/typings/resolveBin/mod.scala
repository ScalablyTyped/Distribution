package typings.resolveBin

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("resolve-bin", JSImport.Namespace)
  @js.native
  val ^ : ResolveBin = js.native
  
  trait Options extends StObject {
    
    /**
      * (default: @name) executable name (e.g. 'buster-test')
      */
    var executable: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExecutable(value: String): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
      
      inline def setExecutableUndefined: Self = StObject.set(x, "executable", js.undefined)
    }
  }
  
  @js.native
  trait ResolveBin extends StObject {
    
    /**
      * Resolves the full path to the bin file of a given package by inspecting the "bin" field in its package.json.
      *
      * @param name module name, i.e. 'tap'
      * @param cb called back with the full path to the bin file of the module or an error if it couldn't be resolved
      */
    def apply(name: String, cb: js.Function2[/* error */ js.Error | Null, /* path */ String, Unit]): Unit = js.native
    /**
      * Resolves the full path to the bin file of a given package by inspecting the "bin" field in its package.json.
      *
      * @param name module name, i.e. 'tap'
      * @param opts options
      * @param cb called back with the full path to the bin file of the module or an error if it couldn't be resolved
      */
    def apply(
      name: String,
      opts: Options,
      cb: js.Function2[/* error */ js.Error | Null, /* path */ String, Unit]
    ): Unit = js.native
    
    /**
      * Synchronous version of resolveBin
      *
      * @param name module name, i.e. 'tap'
      * @param opts options
      */
    def sync(name: String): String | scala.Nothing = js.native
    def sync(name: String, opts: Options): String | scala.Nothing = js.native
  }
  
  type _To = ResolveBin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ResolveBin = ^
}
