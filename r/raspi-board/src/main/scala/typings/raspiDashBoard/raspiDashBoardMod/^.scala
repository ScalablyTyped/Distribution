package typings.raspiDashBoard.raspiDashBoardMod

import org.scalablytyped.runtime.NumberDictionary
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_a
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_aplus
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_b1
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_b2
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_bplus
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_zero
import typings.raspiDashBoard.raspiDashBoardStrings.rpi1_zerow
import typings.raspiDashBoard.raspiDashBoardStrings.rpi2_b
import typings.raspiDashBoard.raspiDashBoardStrings.rpi3_b
import typings.raspiDashBoard.raspiDashBoardStrings.rpi3_bplus
import typings.raspiDashBoard.raspiDashBoardStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-board", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION_1_MODEL_A: rpi1_a = js.native
  val VERSION_1_MODEL_A_PLUS: rpi1_aplus = js.native
  val VERSION_1_MODEL_B_PLUS: rpi1_bplus = js.native
  val VERSION_1_MODEL_B_REV_1: rpi1_b1 = js.native
  val VERSION_1_MODEL_B_REV_2: rpi1_b2 = js.native
  val VERSION_1_MODEL_ZERO: rpi1_zero = js.native
  val VERSION_1_MODEL_ZERO_W: rpi1_zerow = js.native
  val VERSION_2_MODEL_B: rpi2_b = js.native
  val VERSION_3_MODEL_B: rpi3_b = js.native
  val VERSION_3_MODEL_B_PLUS: rpi3_bplus = js.native
  val VERSION_UNKNOWN: unknown = js.native
  def getBoardRevision(): String = js.native
  def getGpioNumber(alias: String): Double | Null = js.native
  def getGpioNumber(alias: Double): Double | Null = js.native
  def getPinNumber(alias: String): Double | Null = js.native
  def getPinNumber(alias: Double): Double | Null = js.native
  def getPins(): NumberDictionary[PinInfo] = js.native
}

