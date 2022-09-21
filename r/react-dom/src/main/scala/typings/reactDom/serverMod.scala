package typings.reactDom

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactDom.serverMod.global.NodeJS.ReadableStream
import typings.reactDom.serverMod.global.NodeJS.WritableStream
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-dom/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToNodeStream(element: ReactElement): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToPipeableStream(children: ReactNode): PipeableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToPipeableStream")(children.asInstanceOf[js.Any]).asInstanceOf[PipeableStream]
  inline def renderToPipeableStream(children: ReactNode, options: RenderToPipeableStreamOptions): PipeableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToPipeableStream")(children.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipeableStream]
  
  inline def renderToReadableStream(children: ReactNode): js.Promise[ReactDOMServerReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToReadableStream")(children.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReactDOMServerReadableStream]]
  inline def renderToReadableStream(children: ReactNode, options: RenderToReadableStreamOptions): js.Promise[ReactDOMServerReadableStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToReadableStream")(children.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReactDOMServerReadableStream]]
  
  inline def renderToStaticMarkup(element: ReactElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticMarkup")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def renderToStaticNodeStream(element: ReactElement): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToString(element: ReactElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("react-dom/server", "version")
  @js.native
  val version: String = js.native
  
  trait PipeableStream extends StObject {
    
    def abort(): Unit
    
    def pipe[Writable /* <: WritableStream */](destination: Writable): Writable
  }
  object PipeableStream {
    
    inline def apply(abort: () => Unit, pipe: Any => Any): PipeableStream = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), pipe = js.Any.fromFunction1(pipe))
      __obj.asInstanceOf[PipeableStream]
    }
    
    extension [Self <: PipeableStream](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setPipe(value: Any => Any): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReactDOMServerReadableStream
    extends StObject
       with typings.std.ReadableStream[Any] {
    
    var allReady: js.Promise[Unit] = js.native
  }
  
  trait RenderToPipeableStreamOptions extends StObject {
    
    var bootstrapModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var bootstrapScriptContent: js.UndefOr[String] = js.undefined
    
    var bootstrapScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var namespaceURI: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAllReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onShellError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onShellReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressiveChunkSize: js.UndefOr[Double] = js.undefined
  }
  object RenderToPipeableStreamOptions {
    
    inline def apply(): RenderToPipeableStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderToPipeableStreamOptions]
    }
    
    extension [Self <: RenderToPipeableStreamOptions](x: Self) {
      
      inline def setBootstrapModules(value: js.Array[String]): Self = StObject.set(x, "bootstrapModules", value.asInstanceOf[js.Any])
      
      inline def setBootstrapModulesUndefined: Self = StObject.set(x, "bootstrapModules", js.undefined)
      
      inline def setBootstrapModulesVarargs(value: String*): Self = StObject.set(x, "bootstrapModules", js.Array(value*))
      
      inline def setBootstrapScriptContent(value: String): Self = StObject.set(x, "bootstrapScriptContent", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptContentUndefined: Self = StObject.set(x, "bootstrapScriptContent", js.undefined)
      
      inline def setBootstrapScripts(value: js.Array[String]): Self = StObject.set(x, "bootstrapScripts", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptsUndefined: Self = StObject.set(x, "bootstrapScripts", js.undefined)
      
      inline def setBootstrapScriptsVarargs(value: String*): Self = StObject.set(x, "bootstrapScripts", js.Array(value*))
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAllReady(value: () => Unit): Self = StObject.set(x, "onAllReady", js.Any.fromFunction0(value))
      
      inline def setOnAllReadyUndefined: Self = StObject.set(x, "onAllReady", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnShellError(value: /* error */ Any => Unit): Self = StObject.set(x, "onShellError", js.Any.fromFunction1(value))
      
      inline def setOnShellErrorUndefined: Self = StObject.set(x, "onShellError", js.undefined)
      
      inline def setOnShellReady(value: () => Unit): Self = StObject.set(x, "onShellReady", js.Any.fromFunction0(value))
      
      inline def setOnShellReadyUndefined: Self = StObject.set(x, "onShellReady", js.undefined)
      
      inline def setProgressiveChunkSize(value: Double): Self = StObject.set(x, "progressiveChunkSize", value.asInstanceOf[js.Any])
      
      inline def setProgressiveChunkSizeUndefined: Self = StObject.set(x, "progressiveChunkSize", js.undefined)
    }
  }
  
  trait RenderToReadableStreamOptions extends StObject {
    
    var bootstrapModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var bootstrapScriptContent: js.UndefOr[String] = js.undefined
    
    var bootstrapScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var namespaceURI: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var progressiveChunkSize: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object RenderToReadableStreamOptions {
    
    inline def apply(): RenderToReadableStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderToReadableStreamOptions]
    }
    
    extension [Self <: RenderToReadableStreamOptions](x: Self) {
      
      inline def setBootstrapModules(value: js.Array[String]): Self = StObject.set(x, "bootstrapModules", value.asInstanceOf[js.Any])
      
      inline def setBootstrapModulesUndefined: Self = StObject.set(x, "bootstrapModules", js.undefined)
      
      inline def setBootstrapModulesVarargs(value: String*): Self = StObject.set(x, "bootstrapModules", js.Array(value*))
      
      inline def setBootstrapScriptContent(value: String): Self = StObject.set(x, "bootstrapScriptContent", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptContentUndefined: Self = StObject.set(x, "bootstrapScriptContent", js.undefined)
      
      inline def setBootstrapScripts(value: js.Array[String]): Self = StObject.set(x, "bootstrapScripts", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptsUndefined: Self = StObject.set(x, "bootstrapScripts", js.undefined)
      
      inline def setBootstrapScriptsVarargs(value: String*): Self = StObject.set(x, "bootstrapScripts", js.Array(value*))
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setProgressiveChunkSize(value: Double): Self = StObject.set(x, "progressiveChunkSize", value.asInstanceOf[js.Any])
      
      inline def setProgressiveChunkSizeUndefined: Self = StObject.set(x, "progressiveChunkSize", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      // tslint:disable-next-line:no-empty-interface
      trait ReadableStream extends StObject
      
      // tslint:disable-next-line:no-empty-interface
      trait WritableStream extends StObject
    }
  }
}
