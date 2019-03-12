package typings
package srpLib.srpMod.SRPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Server extends js.Object {
  def checkM1(M1: nodeLib.Buffer): nodeLib.Buffer
  def computeB(): nodeLib.Buffer
  def computeK(): nodeLib.Buffer
  def setA(A: nodeLib.Buffer): scala.Unit
}

object Server {
  @scala.inline
  def apply(
    checkM1: nodeLib.Buffer => nodeLib.Buffer,
    computeB: () => nodeLib.Buffer,
    computeK: () => nodeLib.Buffer,
    setA: nodeLib.Buffer => scala.Unit
  ): Server = {
    val __obj = js.Dynamic.literal(checkM1 = js.Any.fromFunction1(checkM1), computeB = js.Any.fromFunction0(computeB), computeK = js.Any.fromFunction0(computeK), setA = js.Any.fromFunction1(setA))
  
    __obj.asInstanceOf[Server]
  }
}

