package typings
package simplecrawlerLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLine
  extends simplecrawlerLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_line(
    event: simplecrawlerLib.simplecrawlerLibStrings.line,
    listener: js.Function1[/* input */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("emit")
  def emit_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT): scala.Boolean = js.native
  @JSName("emit")
  def emit_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT): scala.Boolean = js.native
  @JSName("emit")
  def emit_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP): scala.Boolean = js.native
  @JSName("emit")
  def emit_close(event: simplecrawlerLib.simplecrawlerLibStrings.close): scala.Boolean = js.native
  @JSName("emit")
  def emit_line(event: simplecrawlerLib.simplecrawlerLibStrings.line, input: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause): scala.Boolean = js.native
  @JSName("emit")
  def emit_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume): scala.Boolean = js.native
  @JSName("on")
  def on_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_line(
    event: simplecrawlerLib.simplecrawlerLibStrings.line,
    listener: js.Function1[/* input */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_line(
    event: simplecrawlerLib.simplecrawlerLibStrings.line,
    listener: js.Function1[/* input */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def pause(): ReadLine = js.native
  @JSName("prependListener")
  def prependListener_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_line(
    event: simplecrawlerLib.simplecrawlerLibStrings.line,
    listener: js.Function1[/* input */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGCONT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGCONT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGINT(event: simplecrawlerLib.simplecrawlerLibStrings.SIGINT, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_SIGTSTP(event: simplecrawlerLib.simplecrawlerLibStrings.SIGTSTP, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: simplecrawlerLib.simplecrawlerLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_line(
    event: simplecrawlerLib.simplecrawlerLibStrings.line,
    listener: js.Function1[/* input */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pause(event: simplecrawlerLib.simplecrawlerLibStrings.pause, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resume(event: simplecrawlerLib.simplecrawlerLibStrings.resume, listener: js.Function0[scala.Unit]): this.type = js.native
  def prompt(): scala.Unit = js.native
  def prompt(preserveCursor: scala.Boolean): scala.Unit = js.native
  def question(query: java.lang.String, callback: js.Function1[/* answer */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def resume(): ReadLine = js.native
  def setPrompt(prompt: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String): scala.Unit = js.native
  def write(data: java.lang.String, key: Key): scala.Unit = js.native
  def write(data: simplecrawlerLib.Buffer): scala.Unit = js.native
  def write(data: simplecrawlerLib.Buffer, key: Key): scala.Unit = js.native
}

