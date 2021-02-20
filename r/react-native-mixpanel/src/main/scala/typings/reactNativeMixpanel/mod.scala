package typings.reactNativeMixpanel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-mixpanel", "addPushDeviceToken")
  @js.native
  def addPushDeviceToken(token: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "clearPushRegistrationId")
  @js.native
  def clearPushRegistrationId(): Unit = js.native
  
  @JSImport("react-native-mixpanel", "createAlias")
  @js.native
  def createAlias(id: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "getDistinctId")
  @js.native
  def getDistinctId(handler: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  @JSImport("react-native-mixpanel", "identify")
  @js.native
  def identify(id: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "increment")
  @js.native
  def increment(property: String, value: Double): Unit = js.native
  
  @JSImport("react-native-mixpanel", "initPushHandling")
  @js.native
  def initPushHandling(token: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "registerSuperProperties")
  @js.native
  def registerSuperProperties(property: js.Object): Unit = js.native
  
  @JSImport("react-native-mixpanel", "registerSuperPropertiesOnce")
  @js.native
  def registerSuperPropertiesOnce(property: js.Object): Unit = js.native
  
  @JSImport("react-native-mixpanel", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("react-native-mixpanel", "set")
  @js.native
  def set(property: js.Object): Unit = js.native
  
  @JSImport("react-native-mixpanel", "setOnce")
  @js.native
  def setOnce(property: js.Object): Unit = js.native
  
  @JSImport("react-native-mixpanel", "setPushRegistrationId")
  @js.native
  def setPushRegistrationId(token: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "sharedInstanceWithToken")
  @js.native
  def sharedInstanceWithToken(token: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "timeEvent")
  @js.native
  def timeEvent(event: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "track")
  @js.native
  def track(event: String): Unit = js.native
  
  @JSImport("react-native-mixpanel", "trackCharge")
  @js.native
  def trackCharge(id: Double): Unit = js.native
  
  @JSImport("react-native-mixpanel", "trackChargeWithProperties")
  @js.native
  def trackChargeWithProperties(id: Double, property: js.Object): Unit = js.native
  
  @JSImport("react-native-mixpanel", "trackWithProperties")
  @js.native
  def trackWithProperties(event: String, property: js.Object): Unit = js.native
}
