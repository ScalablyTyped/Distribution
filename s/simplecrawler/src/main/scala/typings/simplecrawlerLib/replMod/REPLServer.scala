package typings
package simplecrawlerLib.replMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait REPLServer
  extends simplecrawlerLib.readlineMod.ReadLine {
  var context: js.Any = js.native
  @JSName("addListener")
  def addListener_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, listener: js.Function): this.type = js.native
  def defineCommand(keyword: java.lang.String, cmd: js.Function): scala.Unit = js.native
  def defineCommand(keyword: java.lang.String, cmd: simplecrawlerLib.Anon_Action): scala.Unit = js.native
  def displayPrompt(): scala.Unit = js.native
  def displayPrompt(preserveCursor: scala.Boolean): scala.Unit = js.native
  @JSName("emit")
  def emit_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit): scala.Boolean = js.native
  @JSName("emit")
  def emit_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, context: js.Any): scala.Boolean = js.native
  @JSName("on")
  def on_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, listener: js.Function): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, listener: js.Function): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: simplecrawlerLib.simplecrawlerLibStrings.exit, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_reset(event: simplecrawlerLib.simplecrawlerLibStrings.reset, listener: js.Function): this.type = js.native
}

