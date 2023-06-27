package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/atob) */
  /* standard dom */
  def atob(data: java.lang.String): java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/btoa) */
  /* standard dom */
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/caches)
    */
  /* standard dom */
  val caches: CacheStorage = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/clearInterval) */
  /* standard dom */
  def clearInterval(): Unit = js.native
  def clearInterval(id: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/clearTimeout) */
  /* standard dom */
  def clearTimeout(): Unit = js.native
  def clearTimeout(id: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/createImageBitmap) */
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/crossOriginIsolated) */
  /* standard dom */
  val crossOriginIsolated: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/crypto_property) */
  /* standard dom */
  val crypto: Crypto = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/fetch) */
  /* standard dom */
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def fetch(input: URL): js.Promise[Response] = js.native
  def fetch(input: URL, init: RequestInit): js.Promise[Response] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/indexedDB) */
  /* standard dom */
  val indexedDB: IDBFactory = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/isSecureContext) */
  /* standard dom */
  val isSecureContext: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/origin) */
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/performance_property) */
  /* standard dom */
  val performance: Performance = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/queueMicrotask) */
  /* standard dom */
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/reportError) */
  /* standard dom */
  def reportError(e: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/setInterval) */
  /* standard dom */
  def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/setTimeout) */
  /* standard dom */
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/structuredClone) */
  /* standard dom */
  def structuredClone[T](value: T): T = js.native
  def structuredClone[T](value: T, options: StructuredSerializeOptions): T = js.native
}
