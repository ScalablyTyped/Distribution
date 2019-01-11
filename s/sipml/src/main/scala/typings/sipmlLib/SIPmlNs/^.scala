package typings
package sipmlLib.SIPmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml")
@js.native
object ^ extends js.Object {
  def getNavigatorFriendlyName(): java.lang.String = js.native
  def getNavigatorVersion(): java.lang.String = js.native
  def getSystemFriendlyName(): java.lang.String = js.native
  def getWebRtc4AllVersion(): java.lang.String = js.native
  def haveMediaStream(): scala.Boolean = js.native
  def init(): scala.Boolean = js.native
  def init(readyCallback: js.Function1[/* e */ js.Any, _]): scala.Boolean = js.native
  def init(readyCallback: js.Function1[/* e */ js.Any, _], errorCallback: js.Function1[/* e */ js.Any, _]): scala.Boolean = js.native
  def isInitialized(): scala.Boolean = js.native
  def isNavigatorOutdated(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def isScreenShareSupported(): scala.Boolean = js.native
  def isWebRtc4AllSupported(): scala.Boolean = js.native
  def isWebRtcPluginOutdated(): scala.Boolean = js.native
  def isWebRtcSupported(): scala.Boolean = js.native
  def isWebSocketSupported(): scala.Boolean = js.native
  def setDebugLevel(level: java.lang.String): scala.Unit = js.native
  def setWebRtcType(`type`: java.lang.String): scala.Boolean = js.native
}

