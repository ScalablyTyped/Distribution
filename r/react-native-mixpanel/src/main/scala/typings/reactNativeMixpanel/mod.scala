package typings.reactNativeMixpanel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-mixpanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPushDeviceToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPushDeviceToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearPushRegistrationId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPushRegistrationId")().asInstanceOf[Unit]
  
  inline def createAlias(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getDistinctId(handler: js.Function1[/* id */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistinctId")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def identify(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(property: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("increment")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initPushHandling(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initPushHandling")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerSuperProperties(property: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSuperProperties")(property.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerSuperPropertiesOnce(property: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSuperPropertiesOnce")(property.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def set(property: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(property.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setOnce(property: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnce")(property.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPushRegistrationId(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPushRegistrationId")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sharedInstanceWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedInstanceWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeEvent(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def track(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackCharge(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackCharge")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackChargeWithProperties(id: Double, property: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackChargeWithProperties")(id.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def trackWithProperties(event: String, property: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackWithProperties")(event.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
