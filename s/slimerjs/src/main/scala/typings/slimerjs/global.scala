package typings.slimerjs

import typings.slimerjs.slimerjsStrings.fs
import typings.slimerjs.slimerjsStrings.system
import typings.slimerjs.slimerjsStrings.webpage
import typings.slimerjs.slimerjsStrings.webserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var phantom: Phantom = js.native
  var slimer: Slimer = js.native
  def require(module: js.Any): js.Any = js.native
  @JSName("require")
  def require_fs(module: fs): FsModule = js.native
  @JSName("require")
  def require_system(module: system): SystemModule = js.native
  @JSName("require")
  def require_webpage(module: webpage): WebPageModule = js.native
  @JSName("require")
  def require_webserver(module: webserver): WebServerModule = js.native
}

