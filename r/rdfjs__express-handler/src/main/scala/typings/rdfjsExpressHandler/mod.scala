package typings.rdfjsExpressHandler

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.rdfjsExpressHandler.anon.Typeofformats
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@rdfjs/express-handler", JSImport.Namespace)
  @js.native
  val ^ : RdfHandler = js.native
  
  type BaseIriFromRequest = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    js.Promise[String] | String
  ]
  
  @js.native
  trait RdfHandler extends StObject {
    
    def apply(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def apply(options: RdfHandlerOptions): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def attach(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): js.Promise[Unit] = js.native
    def attach(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      options: RdfHandlerOptions
    ): js.Promise[Unit] = js.native
  }
  
  trait RdfHandlerOptions extends StObject {
    
    var baseIriFromRequest: js.UndefOr[Boolean | BaseIriFromRequest] = js.undefined
    
    var defaultMediaType: js.UndefOr[String] = js.undefined
    
    var factory: js.UndefOr[DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]] = js.undefined
    
    var formats: js.UndefOr[Typeofformats] = js.undefined
  }
  object RdfHandlerOptions {
    
    inline def apply(): RdfHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RdfHandlerOptions]
    }
    
    extension [Self <: RdfHandlerOptions](x: Self) {
      
      inline def setBaseIriFromRequest(value: Boolean | BaseIriFromRequest): Self = StObject.set(x, "baseIriFromRequest", value.asInstanceOf[js.Any])
      
      inline def setBaseIriFromRequestFunction1(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => js.Promise[String] | String
      ): Self = StObject.set(x, "baseIriFromRequest", js.Any.fromFunction1(value))
      
      inline def setBaseIriFromRequestUndefined: Self = StObject.set(x, "baseIriFromRequest", js.undefined)
      
      inline def setDefaultMediaType(value: String): Self = StObject.set(x, "defaultMediaType", value.asInstanceOf[js.Any])
      
      inline def setDefaultMediaTypeUndefined: Self = StObject.set(x, "defaultMediaType", js.undefined)
      
      inline def setFactory(value: DatasetCoreFactory[Quad, Quad, DatasetCore[Quad, Quad]]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setFormats(value: Typeofformats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    }
  }
  
  type _To = RdfHandler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RdfHandler = ^
  
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      var dataset: js.UndefOr[
            js.Function1[/* parserOptions */ js.UndefOr[Any], js.Promise[DatasetCore[Quad, Quad]]]
          ] = js.undefined
      
      var quadStream: js.UndefOr[js.Function1[/* parserOptions */ js.UndefOr[Any], Stream[Quad]]] = js.undefined
    }
    object Request {
      
      inline def apply(): Request = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setDataset(value: /* parserOptions */ js.UndefOr[Any] => js.Promise[DatasetCore[Quad, Quad]]): Self = StObject.set(x, "dataset", js.Any.fromFunction1(value))
        
        inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        inline def setQuadStream(value: /* parserOptions */ js.UndefOr[Any] => Stream[Quad]): Self = StObject.set(x, "quadStream", js.Any.fromFunction1(value))
        
        inline def setQuadStreamUndefined: Self = StObject.set(x, "quadStream", js.undefined)
      }
    }
    
    trait Response extends StObject {
      
      def dataset(dataset: DatasetCore[Quad, Quad]): js.Promise[Unit]
      
      def quadStream(stream: Stream[Quad]): js.Promise[Unit]
    }
    object Response {
      
      inline def apply(dataset: DatasetCore[Quad, Quad] => js.Promise[Unit], quadStream: Stream[Quad] => js.Promise[Unit]): Response = {
        val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction1(dataset), quadStream = js.Any.fromFunction1(quadStream))
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setDataset(value: DatasetCore[Quad, Quad] => js.Promise[Unit]): Self = StObject.set(x, "dataset", js.Any.fromFunction1(value))
        
        inline def setQuadStream(value: Stream[Quad] => js.Promise[Unit]): Self = StObject.set(x, "quadStream", js.Any.fromFunction1(value))
      }
    }
  }
}
