package typings.puppeteerCore

import typings.node.bufferMod.global.Buffer
import typings.puppeteerCore.libCjsPuppeteerCommonConnectionMod.CDPSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonTracingMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Tracing", "Tracing")
  @js.native
  open class Tracing protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession) = this()
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Starts a trace for the current page.
      * @remarks
      * Only one trace can be active at a time per browser.
      *
      * @param options - Optional `TracingOptions`.
      */
    def start(): js.Promise[Unit] = js.native
    def start(options: TracingOptions): js.Promise[Unit] = js.native
    
    /**
      * Stops a trace started with the `start` method.
      * @returns Promise which resolves to buffer with trace data.
      */
    def stop(): js.Promise[js.UndefOr[Buffer]] = js.native
  }
  
  trait TracingOptions extends StObject {
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var screenshots: js.UndefOr[Boolean] = js.undefined
  }
  object TracingOptions {
    
    inline def apply(): TracingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingOptions]
    }
    
    extension [Self <: TracingOptions](x: Self) {
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setScreenshots(value: Boolean): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsUndefined: Self = StObject.set(x, "screenshots", js.undefined)
    }
  }
}
