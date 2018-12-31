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

