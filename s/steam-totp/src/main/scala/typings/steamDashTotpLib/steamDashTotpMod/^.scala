package typings
package steamDashTotpLib.steamDashTotpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-totp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generateAuthCode(secret: java.lang.String, timeOffset: scala.Double): java.lang.String = js.native
  def generateAuthCode(secret: java.lang.String, timeOffset: steamDashTotpLib.steamDashTotpMod.TimeOffsetFunction): java.lang.String = js.native
  def generateConfirmationKey(identitySecret: java.lang.String, time: scala.Double, tag: java.lang.String): java.lang.String = js.native
  def generateConfirmationKey(identitySecret: nodeLib.Buffer, time: scala.Double, tag: java.lang.String): java.lang.String = js.native
  def getAuthCode(secret: java.lang.String, timeOffset: scala.Double): java.lang.String = js.native
  def getAuthCode(secret: java.lang.String, timeOffset: steamDashTotpLib.steamDashTotpMod.TimeOffsetFunction): java.lang.String = js.native
  def getConfirmationKey(identitySecret: java.lang.String, time: scala.Double, tag: java.lang.String): java.lang.String = js.native
  def getConfirmationKey(identitySecret: nodeLib.Buffer, time: scala.Double, tag: java.lang.String): java.lang.String = js.native
  def getDeviceID(steamID: java.lang.String): java.lang.String = js.native
  def getDeviceID(steamID: js.Object): java.lang.String = js.native
  def getTimeOffset(
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* offset */ js.UndefOr[scala.Double], 
      /* elapsedTime */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def time(): scala.Double = js.native
  def time(timeOffset: scala.Double): scala.Double = js.native
}

