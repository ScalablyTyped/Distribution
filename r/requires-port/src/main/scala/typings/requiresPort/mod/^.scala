package typings.requiresPort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("requires-port", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(port: String, protocol: String): Boolean = js.native
  def apply(port: String, protocol: Protocol): Boolean = js.native
  def apply(port: Double, protocol: String): Boolean = js.native
  def apply(port: Double, protocol: Protocol): Boolean = js.native
}

