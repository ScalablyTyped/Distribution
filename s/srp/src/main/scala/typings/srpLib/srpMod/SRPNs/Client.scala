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
    checkM2: js.Function1[nodeLib.Buffer, scala.Unit],
    computeA: js.Function0[nodeLib.Buffer],
    computeK: js.Function0[nodeLib.Buffer],
    computeM1: js.Function0[nodeLib.Buffer],
    setB: js.Function1[nodeLib.Buffer, scala.Unit]
  ): Client = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkM2")(checkM2)
    __obj.updateDynamic("computeA")(computeA)
    __obj.updateDynamic("computeK")(computeK)
    __obj.updateDynamic("computeM1")(computeM1)
    __obj.updateDynamic("setB")(setB)
    __obj.asInstanceOf[Client]
  }
}

