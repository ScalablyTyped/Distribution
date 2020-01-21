package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedEventEmitter[T] extends js.Object {
  def addListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def emit[K /* <: String */](event: K, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listeners[K /* <: String */](event: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def off[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def on[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def once[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def prependListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def prependOnceListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def rawListeners[K /* <: String */](event: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def removeAllListeners[K /* <: String */](): this.type = js.native
  def removeAllListeners[K /* <: String */](event: K): this.type = js.native
  def removeListener[K /* <: String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

