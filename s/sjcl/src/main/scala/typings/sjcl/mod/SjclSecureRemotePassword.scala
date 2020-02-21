package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclSecureRemotePassword extends js.Object {
  def knownGroup(i: String): SjclSRPGroup = js.native
  def knownGroup(i: Double): SjclSRPGroup = js.native
  def makeVerifier(username: String, password: String, salt: BitArray_, group: SjclSRPGroup): BitArray_ = js.native
  def makeX(username: String, password: String, salt: BitArray_): BitArray_ = js.native
}

