package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeySession extends EventTarget {
  val error: MSMediaKeyError | Null = js.native
  val keySystem: java.lang.String = js.native
  val sessionId: java.lang.String = js.native
  def close(): Unit = js.native
  def update(key: Uint8Array): Unit = js.native
}

