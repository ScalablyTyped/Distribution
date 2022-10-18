package typings.reactNativeAdManager

import typings.reactNativeAdManager.anon.Remove
import typings.reactNativeAdManager.helperTypesMod.AdFailedToLoadEvent
import typings.reactNativeAdManager.helperTypesMod.InterstialEventType
import typings.reactNativeAdManager.helperTypesMod.Targeting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCtkadmanagerinterstitialMod {
  
  @JSImport("react-native-ad-manager/src/CTKAdManagerInterstitial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(`type`: InterstialEventType, handler: js.Function1[/* event */ AdFailedToLoadEvent | Null, Unit]): Remove = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Remove]
  
  inline def isReady(callback: js.Function1[/* isLoaded */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAllListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Unit]
  
  inline def removeEventListener(`type`: String, handler: js.Function1[/* event */ AdFailedToLoadEvent | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requestAd(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAd")().asInstanceOf[js.Promise[Unit]]
  
  inline def setAdUnitID(adUnitID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdUnitID")(adUnitID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTargeting(targetingObjects: Targeting): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTargeting")(targetingObjects.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTestDevices(testDevices: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTestDevices")(testDevices.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showAd(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAd")().asInstanceOf[js.Promise[Unit]]
  
  @JSImport("react-native-ad-manager/src/CTKAdManagerInterstitial", "simulatorId")
  @js.native
  val simulatorId: String = js.native
}
