package typings.steamTotp

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steam-totp", "generateAuthCode")
  @js.native
  def generateAuthCode(secret: String): String = js.native
  @JSImport("steam-totp", "generateAuthCode")
  @js.native
  def generateAuthCode(secret: String, timeOffset: Double): String = js.native
  @JSImport("steam-totp", "generateAuthCode")
  @js.native
  def generateAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  
  @JSImport("steam-totp", "generateConfirmationKey")
  @js.native
  def generateConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  @JSImport("steam-totp", "generateConfirmationKey")
  @js.native
  def generateConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  
  @JSImport("steam-totp", "getAuthCode")
  @js.native
  def getAuthCode(secret: String): String = js.native
  @JSImport("steam-totp", "getAuthCode")
  @js.native
  def getAuthCode(secret: String, timeOffset: Double): String = js.native
  @JSImport("steam-totp", "getAuthCode")
  @js.native
  def getAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  
  @JSImport("steam-totp", "getConfirmationKey")
  @js.native
  def getConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  @JSImport("steam-totp", "getConfirmationKey")
  @js.native
  def getConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  
  @JSImport("steam-totp", "getDeviceID")
  @js.native
  def getDeviceID(steamID: String): String = js.native
  @JSImport("steam-totp", "getDeviceID")
  @js.native
  def getDeviceID(steamID: js.Object): String = js.native
  
  @JSImport("steam-totp", "getTimeOffset")
  @js.native
  def getTimeOffset(
    callback: js.Function3[
      /* error */ Error, 
      /* offset */ js.UndefOr[Double], 
      /* elapsedTime */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("steam-totp", "time")
  @js.native
  def time(): Double = js.native
  @JSImport("steam-totp", "time")
  @js.native
  def time(timeOffset: Double): Double = js.native
  
  type TimeOffsetFunction = js.Function0[Double]
}
