package typings.puppeteerCore.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Tracing")
@js.native
open class Tracing () extends StObject {
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: __constructor */
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
