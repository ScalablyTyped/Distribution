package typings.shrinkRay

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.shrinkRay.anon.Lgblock
import typings.shrinkRay.anon.Partialflushnumberundefin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shrink-ray", JSImport.Namespace)
  @js.native
  val ^ : CreateMiddleware = js.native
  
  @js.native
  trait CreateMiddleware extends StObject {
    
    def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    def apply(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def filter(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Boolean = js.native
    @JSName("filter")
    var filter_Original: FilterFunction = js.native
  }
  
  type FilterFunction = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Boolean
  ]
  
  /* Inlined std.Partial<{  cacheSize :number,   threshold :number,   zlib :std.Partial<{  flush :number | undefined,   finishFlush :number | undefined,   chunkSize :number | undefined,   windowBits :number | undefined,   strategy :number | undefined,   dictionary :any | undefined,   level :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli :{  lgblock :number,   lgwin :number,   mode :0 | 1 | 2,   quality :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>, res : express.express.Response<any>): boolean}> */
  @js.native
  trait Options extends StObject {
    
    var brotli: js.UndefOr[Lgblock] = js.native
    
    var cache: js.UndefOr[
        js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
      ] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[FilterFunction] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    var zlib: js.UndefOr[Partialflushnumberundefin] = js.native
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
      def setBrotli(value: Lgblock): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrotliUndefined: Self = StObject.set(x, "brotli", js.undefined)
      
      @scala.inline
      def setCache(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = StObject.set(x, "cache", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setZlib(value: Partialflushnumberundefin): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
    }
  }
  
  type _To = CreateMiddleware
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CreateMiddleware = ^
}
