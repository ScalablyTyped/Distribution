package typings.resourceLoader

import typings.resourceLoader.anon.TypeofLoader
import typings.resourceLoader.distLoaderMod.Loader
import typings.resourceLoader.distLoaderMod.Loader.MiddlewareFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBundleMod {
  
  @JSImport("resource-loader/dist/bundle", JSImport.Default)
  @js.native
  open class default () extends Loader {
    def this(baseUrl: String) = this()
    def this(baseUrl: String, concurrency: Double) = this()
    def this(baseUrl: Unit, concurrency: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("resource-loader/dist/bundle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("resource-loader/dist/bundle", "default.DefaultMiddlewarePriority")
    @js.native
    val DefaultMiddlewarePriority: /* 50 */ Double = js.native
    
    @JSImport("resource-loader/dist/bundle", "default._defaultMiddleware")
    @js.native
    def _defaultMiddleware: Any = js.native
    inline def _defaultMiddleware_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMiddleware")(x.asInstanceOf[js.Any])
    
    inline def use(fn: MiddlewareFn): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
    inline def use(fn: MiddlewareFn, priority: Double): TypeofLoader = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(fn.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[TypeofLoader]
  }
}
