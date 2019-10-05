package typings.requiresDashPort

import typings.requiresDashPort.requiresDashPortMod.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("requires-port", JSImport.Namespace)
@js.native
object requiresDashPortMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.requiresDashPort.requiresDashPortStrings.http
    - typings.requiresDashPort.requiresDashPortStrings.https
    - typings.requiresDashPort.requiresDashPortStrings.ws
    - typings.requiresDashPort.requiresDashPortStrings.wss
    - typings.requiresDashPort.requiresDashPortStrings.ftp
    - typings.requiresDashPort.requiresDashPortStrings.gopher
    - typings.requiresDashPort.requiresDashPortStrings.file
  */
  trait Protocol extends js.Object
  
  def apply(port: String, protocol: String): Boolean = js.native
  def apply(port: String, protocol: Protocol): Boolean = js.native
  def apply(port: Double, protocol: String): Boolean = js.native
  def apply(port: Double, protocol: Protocol): Boolean = js.native
}

