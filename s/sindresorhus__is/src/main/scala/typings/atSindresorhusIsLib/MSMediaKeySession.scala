package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSMediaKeySession extends EventTarget {
  val error: MSMediaKeyError | scala.Null = js.native
  val keySystem: java.lang.String = js.native
  val sessionId: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def update(key: Uint8Array): scala.Unit = js.native
}

@JSGlobal("MSMediaKeySession")
@js.native
object MSMediaKeySession
  extends org.scalablytyped.runtime.Instantiable0[MSMediaKeySession]

