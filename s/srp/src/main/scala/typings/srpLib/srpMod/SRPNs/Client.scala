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

object Client {
  @scala.inline
  def apply(
    checkM2: nodeLib.Buffer => scala.Unit,
    computeA: () => nodeLib.Buffer,
    computeK: () => nodeLib.Buffer,
    computeM1: () => nodeLib.Buffer,
    setB: nodeLib.Buffer => scala.Unit
  ): Client = {
    val __obj = js.Dynamic.literal(checkM2 = js.Any.fromFunction1(checkM2), computeA = js.Any.fromFunction0(computeA), computeK = js.Any.fromFunction0(computeK), computeM1 = js.Any.fromFunction0(computeM1), setB = js.Any.fromFunction1(setB))
  
    __obj.asInstanceOf[Client]
  }
}

