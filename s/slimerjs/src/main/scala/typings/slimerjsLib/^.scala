package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var phantom: slimerjsLib.Phantom = js.native
  var slimer: slimerjsLib.Slimer = js.native
  def require(module: js.Any): js.Any = js.native
  @JSName("require")
  def require_fs(module: slimerjsLib.slimerjsLibStrings.fs): slimerjsLib.FsModule = js.native
  @JSName("require")
  def require_system(module: slimerjsLib.slimerjsLibStrings.system): slimerjsLib.SystemModule = js.native
  @JSName("require")
  def require_webpage(module: slimerjsLib.slimerjsLibStrings.webpage): slimerjsLib.WebPageModule = js.native
  @JSName("require")
  def require_webserver(module: slimerjsLib.slimerjsLibStrings.webserver): slimerjsLib.WebServerModule = js.native
}

