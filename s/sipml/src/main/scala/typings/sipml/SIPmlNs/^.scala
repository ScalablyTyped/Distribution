package typings.sipml.SIPmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SIPml")
@js.native
object ^ extends js.Object {
  def getNavigatorFriendlyName(): String = js.native
  def getNavigatorVersion(): String = js.native
  def getSystemFriendlyName(): String = js.native
  def getWebRtc4AllVersion(): String = js.native
  def haveMediaStream(): Boolean = js.native
  def init(): Boolean = js.native
  def init(readyCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
  def init(readyCallback: js.Function1[/* e */ js.Any, _], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
  def isInitialized(): Boolean = js.native
  def isNavigatorOutdated(): Boolean = js.native
  def isReady(): Boolean = js.native
  def isScreenShareSupported(): Boolean = js.native
  def isWebRtc4AllSupported(): Boolean = js.native
  def isWebRtcPluginOutdated(): Boolean = js.native
  def isWebRtcSupported(): Boolean = js.native
  def isWebSocketSupported(): Boolean = js.native
  def setDebugLevel(level: String): Unit = js.native
  def setWebRtcType(`type`: String): Boolean = js.native
}

