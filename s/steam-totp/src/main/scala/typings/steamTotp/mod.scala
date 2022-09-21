package typings.steamTotp

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steam-totp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAuthCode(secret: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthCode")(secret.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateAuthCode(secret: String, timeOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthCode")(secret.asInstanceOf[js.Any], timeOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthCode")(secret.asInstanceOf[js.Any], timeOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateConfirmationKey(identitySecret: String, time: Double, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateConfirmationKey")(identitySecret.asInstanceOf[js.Any], time.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateConfirmationKey")(identitySecret.asInstanceOf[js.Any], time.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAuthCode(secret: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthCode")(secret.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getAuthCode(secret: String, timeOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthCode")(secret.asInstanceOf[js.Any], timeOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAuthCode")(secret.asInstanceOf[js.Any], timeOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getConfirmationKey(identitySecret: String, time: Double, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfirmationKey")(identitySecret.asInstanceOf[js.Any], time.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfirmationKey")(identitySecret.asInstanceOf[js.Any], time.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDeviceID(steamID: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceID")(steamID.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDeviceID(steamID: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceID")(steamID.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTimeOffset(
    callback: js.Function3[
      /* error */ js.Error, 
      /* offset */ js.UndefOr[Double], 
      /* elapsedTime */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeOffset")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def time(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Double]
  inline def time(timeOffset: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(timeOffset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type TimeOffsetFunction = js.Function0[Double]
}
