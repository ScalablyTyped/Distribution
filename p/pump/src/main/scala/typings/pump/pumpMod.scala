package typings.pump

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.pump.pumpMod.Callback
import typings.pump.pumpMod.Stream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pump", JSImport.Namespace)
@js.native
object pumpMod extends js.Object {
  // callback have to be passed as last argument
  def apply(streams: (Stream | Callback)*): Stream = js.native
  def apply(streams: js.Array[Stream]): Stream = js.native
  def apply(streams: js.Array[Stream], callback: Callback): Stream = js.native
  type Callback = js.Function1[/* err */ Error, js.Any]
  type Stream = ReadableStream | WritableStream
}

