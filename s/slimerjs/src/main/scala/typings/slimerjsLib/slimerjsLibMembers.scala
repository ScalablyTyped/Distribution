package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object slimerjsLibMembers extends js.Object {
  var phantom: Phantom = js.native
  var slimer: Slimer = js.native
  def require(module: js.Any): js.Any = js.native
  @JSName("require")
  def require_fs(module: slimerjsLib.slimerjsLibStrings.fs): FsModule = js.native
  @JSName("require")
  def require_system(module: slimerjsLib.slimerjsLibStrings.system): SystemModule = js.native
  @JSName("require")
  def require_webpage(module: slimerjsLib.slimerjsLibStrings.webpage): WebPageModule = js.native
  @JSName("require")
  def require_webserver(module: slimerjsLib.slimerjsLibStrings.webserver): WebServerModule = js.native
}

