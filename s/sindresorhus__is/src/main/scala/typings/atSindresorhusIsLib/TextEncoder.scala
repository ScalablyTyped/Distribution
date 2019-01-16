package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoder extends js.Object {
  /**
    * Returns "utf-8".
    */
  val encoding: java.lang.String = js.native
  /**
    * Returns the result of running UTF-8's encoder.
    */
  def encode(): Uint8Array = js.native
  def encode(input: java.lang.String): Uint8Array = js.native
}

@JSGlobal("TextEncoder")
@js.native
object TextEncoder
  extends org.scalablytyped.runtime.Instantiable0[TextEncoder]

