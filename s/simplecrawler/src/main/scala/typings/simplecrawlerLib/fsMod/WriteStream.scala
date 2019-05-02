package typings
package simplecrawlerLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStream
  extends simplecrawlerLib.streamMod.Writable {
  var bytesWritten: scala.Double = js.native
  var path: java.lang.String | simplecrawlerLib.Buffer = js.native
  @JSName("addListener")
  def addListener_open(
    event: simplecrawlerLib.simplecrawlerLibStrings.open,
    listener: js.Function1[/* fd */ scala.Double, scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  @JSName("on")
  def on_open(
    event: simplecrawlerLib.simplecrawlerLibStrings.open,
    listener: js.Function1[/* fd */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_open(
    event: simplecrawlerLib.simplecrawlerLibStrings.open,
    listener: js.Function1[/* fd */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_open(
    event: simplecrawlerLib.simplecrawlerLibStrings.open,
    listener: js.Function1[/* fd */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_open(
    event: simplecrawlerLib.simplecrawlerLibStrings.open,
    listener: js.Function1[/* fd */ scala.Double, scala.Unit]
  ): this.type = js.native
}

