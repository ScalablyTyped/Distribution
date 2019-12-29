package typings.steam.steamMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam", "SteamClient")
@js.native
class SteamClient () extends EventEmitter {
  var cookie: js.Array[String] = js.native
  var sessionId: String = js.native
  var steamID: String = js.native
  // Event emitter
  def addListener(event: String, listener: js.Function): this.type = js.native
  def joinChat(chatId: String): Unit = js.native
  def logOn(options: LogonOptions): Unit = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  def removeListener(event: String, listener: js.Function): this.type = js.native
  def sendMessage(source: js.Any, message: String, entryType: EChatEntryType): Unit = js.native
  def setPersonaName(name: String): Unit = js.native
  def setPersonaState(state: EPersonaState): Unit = js.native
  def webLogOn(callback: js.Function1[/* cookie */ js.Array[_], Unit]): Unit = js.native
}

