package typings.steamDashTotp.steamDashTotpMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-totp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateAuthCode(secret: String, timeOffset: Double): String = js.native
  def generateAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  def generateConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  def generateConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  def getAuthCode(secret: String, timeOffset: Double): String = js.native
  def getAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  def getConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  def getConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  def getDeviceID(steamID: String): String = js.native
  def getDeviceID(steamID: js.Object): String = js.native
  def getTimeOffset(
    callback: js.Function3[
      /* error */ Error, 
      /* offset */ js.UndefOr[Double], 
      /* elapsedTime */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  def time(): Double = js.native
  def time(timeOffset: Double): Double = js.native
}

