package typings.sjcl.sjclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureRemotePassword extends js.Object {
  def knownGroup(i: String): SjclSRPGroup = js.native
  def knownGroup(i: Double): SjclSRPGroup = js.native
  def makeVerifier(username: String, password: String, salt: BitArray, group: SjclSRPGroup): BitArray = js.native
  def makeX(username: String, password: String, salt: BitArray): BitArray = js.native
}

