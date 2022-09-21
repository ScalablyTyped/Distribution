package typings.resourceLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.parseUri.mod.Options
import typings.parseUri.mod.URI
import typings.resourceLoader.loaderMod.Loader
import typings.resourceLoader.loaderMod.Loader.MiddlewareFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(uri: String): URI = js.native
    def apply(uri: String, opts: Options): URI = js.native
  }
  
  @js.native
  trait TypeofLoader
    extends StObject
       with Instantiable0[Loader]
       with Instantiable1[/* baseUrl */ String, Loader]
       with Instantiable2[(/* baseUrl */ String) | (/* baseUrl */ Unit), /* concurrency */ Double, Loader] {
    
    val DefaultMiddlewarePriority: /* 50 */ Double = js.native
    
    /* private */ var _defaultMiddleware: Any = js.native
    
    def use(fn: MiddlewareFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof Loader */ js.Any = js.native
    def use(fn: MiddlewareFn, priority: Double): /* import warning: importer.ImportType#apply Failed type conversion: typeof Loader */ js.Any = js.native
  }
}
