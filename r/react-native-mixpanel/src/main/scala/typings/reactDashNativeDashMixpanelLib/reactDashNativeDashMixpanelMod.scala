package typings
package reactDashNativeDashMixpanelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-mixpanel", JSImport.Namespace)
@js.native
object reactDashNativeDashMixpanelMod extends js.Object {
  def addPushDeviceToken(token: java.lang.String): scala.Unit = js.native
  def clearPushRegistrationId(): scala.Unit = js.native
  def createAlias(id: java.lang.String): scala.Unit = js.native
  def getDistinctId(handler: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def identify(id: java.lang.String): scala.Unit = js.native
  def increment(property: java.lang.String, value: scala.Double): scala.Unit = js.native
  def initPushHandling(token: java.lang.String): scala.Unit = js.native
  def registerSuperProperties(property: js.Object): scala.Unit = js.native
  def registerSuperPropertiesOnce(property: js.Object): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def set(property: js.Object): scala.Unit = js.native
  def setOnce(property: js.Object): scala.Unit = js.native
  def setPushRegistrationId(token: java.lang.String): scala.Unit = js.native
  def sharedInstanceWithToken(token: java.lang.String): scala.Unit = js.native
  def timeEvent(event: java.lang.String): scala.Unit = js.native
  def track(event: java.lang.String): scala.Unit = js.native
  def trackCharge(id: scala.Double): scala.Unit = js.native
  def trackChargeWithProperties(id: scala.Double, property: js.Object): scala.Unit = js.native
  def trackWithProperties(event: java.lang.String, property: js.Object): scala.Unit = js.native
}

