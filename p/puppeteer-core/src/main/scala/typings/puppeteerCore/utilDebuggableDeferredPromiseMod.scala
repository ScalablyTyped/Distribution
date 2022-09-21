package typings.puppeteerCore

import typings.puppeteerCore.utilDeferredPromiseMod.DeferredPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDebuggableDeferredPromiseMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/util/DebuggableDeferredPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDebuggableDeferredPromise[T](message: String): DeferredPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDebuggableDeferredPromise")(message.asInstanceOf[js.Any]).asInstanceOf[DeferredPromise[T]]
}
