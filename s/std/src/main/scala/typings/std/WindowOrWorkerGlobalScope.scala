package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOrWorkerGlobalScope extends js.Object {
  val caches: CacheStorage = js.native
  val crypto: Crypto_ = js.native
  val indexedDB: IDBFactory = js.native
  val origin: java.lang.String = js.native
  val performance: Performance_ = js.native
  def atob(data: java.lang.String): java.lang.String = js.native
  def btoa(data: java.lang.String): java.lang.String = js.native
  def clearInterval(): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def queueMicrotask(callback: js.Function): Unit = js.native
  def setInterval(handler: TimerHandler): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  def setTimeout(handler: TimerHandler): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
}

