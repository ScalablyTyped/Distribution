package typings
package raspiDashBoardLib.raspiDashBoardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-board", JSImport.Namespace)
@js.native
object raspiDashBoardModMembers extends js.Object {
  val VERSION_1_MODEL_A: /* rpi1_a */ java.lang.String = js.native
  val VERSION_1_MODEL_A_PLUS: /* rpi1_aplus */ java.lang.String = js.native
  val VERSION_1_MODEL_B_PLUS: /* rpi1_bplus */ java.lang.String = js.native
  val VERSION_1_MODEL_B_REV_1: /* rpi1_b1 */ java.lang.String = js.native
  val VERSION_1_MODEL_B_REV_2: /* rpi1_b2 */ java.lang.String = js.native
  val VERSION_1_MODEL_ZERO: /* rpi1_zero */ java.lang.String = js.native
  val VERSION_1_MODEL_ZERO_W: /* rpi1_zerow */ java.lang.String = js.native
  val VERSION_2_MODEL_B: /* rpi2_b */ java.lang.String = js.native
  val VERSION_3_MODEL_B: /* rpi3_b */ java.lang.String = js.native
  val VERSION_3_MODEL_B_PLUS: /* rpi3_bplus */ java.lang.String = js.native
  val VERSION_UNKNOWN: /* unknown */ java.lang.String = js.native
  def getBoardRevision(): java.lang.String = js.native
  def getGpioNumber(alias: java.lang.String): scala.Double | scala.Null = js.native
  def getGpioNumber(alias: scala.Double): scala.Double | scala.Null = js.native
  def getPinNumber(alias: java.lang.String): scala.Double | scala.Null = js.native
  def getPinNumber(alias: scala.Double): scala.Double | scala.Null = js.native
  def getPins(): ScalablyTyped.runtime.NumberDictionary[PinInfo] = js.native
}

