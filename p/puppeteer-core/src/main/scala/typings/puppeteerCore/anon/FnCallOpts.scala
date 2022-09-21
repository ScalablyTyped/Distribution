package typings.puppeteerCore.anon

import typings.puppeteerCore.deferredPromiseMod.DeferredPromise
import typings.puppeteerCore.deferredPromiseMod.DeferredPromiseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOpts extends StObject {
  
  def apply[T](): DeferredPromise[T] = js.native
  def apply[T](opts: DeferredPromiseOptions): DeferredPromise[T] = js.native
}
