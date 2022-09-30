package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.LDU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Settings {
  
  @JSImport("react-native-fbsdk", "Settings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * For iOS only, get AdvertiserTrackingEnabled status.
    * @platform ios
    */
  inline def getAdvertiserTrackingEnabled(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdvertiserTrackingEnabled")().asInstanceOf[js.Promise[Boolean]]
  
  /**
    * For iOS only, set AdvertiserTrackingEnabled status, only works in iOS 14 and above.
    * @platform ios
    */
  inline def setAdvertiserTrackingEnabled(ATE: Boolean): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdvertiserTrackingEnabled")(ATE.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Set data processing options
    */
  inline def setDataProcessingOptions_LDU(options: js.Array[String | LDU], args: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataProcessingOptions")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
