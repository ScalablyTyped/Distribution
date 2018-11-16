package typings
package sipmlLib.SIPmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml.Session")
@js.native
class Session ()
  extends EventTarget[sipmlLib.SIPmlNs.SessionNs.EventSubscriptionType, sipmlLib.SIPmlNs.SessionNs.Event] {
  def accept(): scala.Double = js.native
  def accept(configuration: sipmlLib.SIPmlNs.SessionNs.Configuration): scala.Double = js.native
  def getId(): scala.Double = js.native
  def getRemoteFriendlyName(): java.lang.String = js.native
  def getRemoteUri(): java.lang.String = js.native
  def reject(): scala.Double = js.native
  def reject(configuration: sipmlLib.SIPmlNs.SessionNs.Configuration): scala.Double = js.native
  def setConfiguration(): scala.Unit = js.native
  def setConfiguration(configuration: sipmlLib.SIPmlNs.SessionNs.Configuration): scala.Unit = js.native
}

