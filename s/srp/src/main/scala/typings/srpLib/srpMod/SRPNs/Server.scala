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
    checkM1: js.Function1[nodeLib.Buffer, nodeLib.Buffer],
    computeB: js.Function0[nodeLib.Buffer],
    computeK: js.Function0[nodeLib.Buffer],
    setA: js.Function1[nodeLib.Buffer, scala.Unit]
  ): Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkM1")(checkM1)
    __obj.updateDynamic("computeB")(computeB)
    __obj.updateDynamic("computeK")(computeK)
    __obj.updateDynamic("setA")(setA)
    __obj.asInstanceOf[Server]
  }
}

