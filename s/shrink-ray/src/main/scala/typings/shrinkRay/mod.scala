package typings.shrinkRay

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.shrinkRay.anon.Lgblock
import typings.shrinkRay.anon.Partialflushnumberundefin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shrink-ray", JSImport.Namespace)
  @js.native
  val ^ : CreateMiddleware = js.native
  
  @js.native
  trait CreateMiddleware extends StObject {
    
    def apply(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def apply(options: Options): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def filter(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Boolean = js.native
    @JSName("filter")
    var filter_Original: FilterFunction = js.native
  }
  
  type FilterFunction = js.Function2[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    Boolean
  ]
  
  /* Inlined std.Partial<{  cacheSize :number,   threshold :number,   zlib :std.Partial<{  flush :number | undefined,   finishFlush :number | undefined,   chunkSize :number | undefined,   windowBits :number | undefined,   strategy :number | undefined,   dictionary :any | undefined,   level :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli :{  lgblock :number,   lgwin :number,   mode :0 | 1 | 2,   quality :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary * / any, any, any, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query * / any, std.Record<string, any>>, res : express.express.Response<any, std.Record<string, any>>): boolean}> */
  trait Options extends StObject {
    
    var brotli: js.UndefOr[Lgblock] = js.undefined
    
    var cache: js.UndefOr[
        js.Function2[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Boolean
        ]
      ] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var zlib: js.UndefOr[Partialflushnumberundefin] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBrotli(value: Lgblock): Self = StObject.set(x, "brotli", value.asInstanceOf[js.Any])
      
      inline def setBrotliUndefined: Self = StObject.set(x, "brotli", js.undefined)
      
      inline def setCache(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Boolean
      ): Self = StObject.set(x, "cache", js.Any.fromFunction2(value))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setFilter(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setZlib(value: Partialflushnumberundefin): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
      
      inline def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
    }
  }
  
  type _To = CreateMiddleware
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CreateMiddleware = ^
}
