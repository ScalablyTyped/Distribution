package typings.server.anon

import typings.server.commonMod.LogFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn} */
@js.native
trait keyinLogLevelLogFn extends js.Object {
  @JSName("alert")
  var alert_Original: LogFn = js.native
  @JSName("critical")
  var critical_Original: LogFn = js.native
  @JSName("debug")
  var debug_Original: LogFn = js.native
  @JSName("emergency")
  var emergency_Original: LogFn = js.native
  @JSName("error")
  var error_Original: LogFn = js.native
  @JSName("info")
  var info_Original: LogFn = js.native
  @JSName("notice")
  var notice_Original: LogFn = js.native
  @JSName("warning")
  var warning_Original: LogFn = js.native
  def alert(template: String, tokens: String*): Unit = js.native
  def critical(template: String, tokens: String*): Unit = js.native
  def debug(template: String, tokens: String*): Unit = js.native
  def emergency(template: String, tokens: String*): Unit = js.native
  def error(template: String, tokens: String*): Unit = js.native
  def info(template: String, tokens: String*): Unit = js.native
  def notice(template: String, tokens: String*): Unit = js.native
  def warning(template: String, tokens: String*): Unit = js.native
}

