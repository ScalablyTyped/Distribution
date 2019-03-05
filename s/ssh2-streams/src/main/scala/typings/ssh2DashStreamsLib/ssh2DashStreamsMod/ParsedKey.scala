package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedKey extends js.Object {
  var comment: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  def getPrivatePEM(): java.lang.String = js.native
  def getPublicPEM(): java.lang.String = js.native
  def getPublicSSH(): java.lang.String = js.native
  def sign(data: java.lang.String): nodeLib.Buffer | nodeLib.Error = js.native
  def sign(data: nodeLib.Buffer): nodeLib.Buffer | nodeLib.Error = js.native
  def verify(data: java.lang.String, signature: nodeLib.Buffer): scala.Boolean | nodeLib.Error = js.native
  def verify(data: nodeLib.Buffer, signature: nodeLib.Buffer): scala.Boolean | nodeLib.Error = js.native
}

