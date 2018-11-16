package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MessageChannel extends js.Object {
  val port1: MessagePort
  val port2: MessagePort
}

@JSGlobal("MessageChannel")
@js.native
object MessageChannel
  extends ScalablyTyped.runtime.Instantiable0[MessageChannel]

