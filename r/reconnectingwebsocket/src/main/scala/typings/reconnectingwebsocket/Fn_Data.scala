package typings.reconnectingwebsocket

import typings.std.ArrayBufferLike
import typings.std.ArrayBufferView
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Data extends js.Object {
  def apply(data: String): Unit = js.native
  def apply(data: ArrayBufferLike): Unit = js.native
  def apply(data: ArrayBufferView): Unit = js.native
  def apply(data: Blob): Unit = js.native
}

