package typings
package steamLib.steamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam", "SteamClient")
@js.native
class SteamClient ()
  extends nodeLib.NodeJSNs.EventEmitter {
  var cookie: js.Array[java.lang.String] = js.native
  var sessionId: java.lang.String = js.native
  var steamID: java.lang.String = js.native
  // Event emitter
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def joinChat(chatId: java.lang.String): scala.Unit = js.native
  def logOn(options: LogonOptions): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def sendMessage(source: js.Any, message: java.lang.String, entryType: EChatEntryType): scala.Unit = js.native
  def setPersonaName(name: java.lang.String): scala.Unit = js.native
  def setPersonaState(state: EPersonaState): scala.Unit = js.native
  def webLogOn(callback: js.Function1[/* cookie */ js.Array[_], scala.Unit]): scala.Unit = js.native
}

