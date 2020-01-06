package typings.atPusherChatkitDashClient.chatmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  @JSName("debug")
  var debug_Original: LoggerFunction = js.native
  @JSName("error")
  var error_Original: LoggerFunction = js.native
  @JSName("info")
  var info_Original: LoggerFunction = js.native
  @JSName("verbose")
  var verbose_Original: LoggerFunction = js.native
  @JSName("warn")
  var warn_Original: LoggerFunction = js.native
  def debug(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def error(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def info(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def verbose(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  def warn(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
}

