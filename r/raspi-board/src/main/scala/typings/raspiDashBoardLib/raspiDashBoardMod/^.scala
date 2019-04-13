package typings
package raspiDashBoardLib.raspiDashBoardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-board", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION_1_MODEL_A: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_a = js.native
  val VERSION_1_MODEL_A_PLUS: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_aplus = js.native
  val VERSION_1_MODEL_B_PLUS: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_bplus = js.native
  val VERSION_1_MODEL_B_REV_1: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_b1 = js.native
  val VERSION_1_MODEL_B_REV_2: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_b2 = js.native
  val VERSION_1_MODEL_ZERO: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_zero = js.native
  val VERSION_1_MODEL_ZERO_W: raspiDashBoardLib.raspiDashBoardLibStrings.rpi1_zerow = js.native
  val VERSION_2_MODEL_B: raspiDashBoardLib.raspiDashBoardLibStrings.rpi2_b = js.native
  val VERSION_3_MODEL_B: raspiDashBoardLib.raspiDashBoardLibStrings.rpi3_b = js.native
  val VERSION_3_MODEL_B_PLUS: raspiDashBoardLib.raspiDashBoardLibStrings.rpi3_bplus = js.native
  val VERSION_UNKNOWN: raspiDashBoardLib.raspiDashBoardLibStrings.unknown = js.native
  def getBoardRevision(): java.lang.String = js.native
  def getGpioNumber(alias: java.lang.String): scala.Double | scala.Null = js.native
  def getGpioNumber(alias: scala.Double): scala.Double | scala.Null = js.native
  def getPinNumber(alias: java.lang.String): scala.Double | scala.Null = js.native
  def getPinNumber(alias: scala.Double): scala.Double | scala.Null = js.native
  def getPins(): org.scalablytyped.runtime.NumberDictionary[PinInfo] = js.native
}

