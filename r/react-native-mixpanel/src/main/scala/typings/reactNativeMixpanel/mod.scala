package typings.reactNativeMixpanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-mixpanel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addPushDeviceToken(token: String): Unit = js.native
  
  def clearPushRegistrationId(): Unit = js.native
  
  def createAlias(id: String): Unit = js.native
  
  def getDistinctId(handler: js.Function1[/* id */ String, Unit]): Unit = js.native
  
  def identify(id: String): Unit = js.native
  
  def increment(property: String, value: Double): Unit = js.native
  
  def initPushHandling(token: String): Unit = js.native
  
  def registerSuperProperties(property: js.Object): Unit = js.native
  
  def registerSuperPropertiesOnce(property: js.Object): Unit = js.native
  
  def reset(): Unit = js.native
  
  def set(property: js.Object): Unit = js.native
  
  def setOnce(property: js.Object): Unit = js.native
  
  def setPushRegistrationId(token: String): Unit = js.native
  
  def sharedInstanceWithToken(token: String): Unit = js.native
  
  def timeEvent(event: String): Unit = js.native
  
  def track(event: String): Unit = js.native
  
  def trackCharge(id: Double): Unit = js.native
  
  def trackChargeWithProperties(id: Double, property: js.Object): Unit = js.native
  
  def trackWithProperties(event: String, property: js.Object): Unit = js.native
}
