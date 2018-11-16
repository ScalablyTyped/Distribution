package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureRemotePassword extends js.Object {
  def knownGroup(i: java.lang.String): SjclSRPGroup = js.native
  def knownGroup(i: scala.Double): SjclSRPGroup = js.native
  def makeVerifier(username: java.lang.String, password: java.lang.String, salt: BitArray, group: SjclSRPGroup): BitArray = js.native
  def makeX(username: java.lang.String, password: java.lang.String, salt: BitArray): BitArray = js.native
}

