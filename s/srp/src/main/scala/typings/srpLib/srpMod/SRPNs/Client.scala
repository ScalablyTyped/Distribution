package typings
package srpLib.srpMod.SRPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  def checkM2(M2: nodeLib.Buffer): scala.Unit
  def computeA(): nodeLib.Buffer
  def computeK(): nodeLib.Buffer
  def computeM1(): nodeLib.Buffer
  def setB(B: nodeLib.Buffer): scala.Unit
}

