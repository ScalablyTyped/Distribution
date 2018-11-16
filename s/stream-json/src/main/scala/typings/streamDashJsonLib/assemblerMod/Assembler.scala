package typings
package streamDashJsonLib.assemblerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assembler
  extends nodeLib.eventsMod.EventEmitter {
  var current: js.Any = js.native
  val depth: scala.Double = js.native
  val done: scala.Boolean = js.native
  var key: java.lang.String | scala.Null = js.native
  val path: java.lang.String = js.native
  var stack: js.Array[scala.Double | java.lang.String | scala.Null] = js.native
  // events
  @JSName("addListener")
  def addListener_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
  def connectTo(stream: nodeLib.streamMod.Readable): this.type = js.native
  def consume(chunk: Token): this.type = js.native
  def dropToLevel(level: scala.Double): this.type = js.native
  @JSName("on")
  def on_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_done(
    event: streamDashJsonLib.streamDashJsonLibStrings.done,
    listener: js.Function1[/* asm */ this.type, scala.Unit]
  ): this.type = js.native
}

