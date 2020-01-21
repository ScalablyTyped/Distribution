package typings.readableStream.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== destroy ====
@js.native
trait Destroy extends js.Object {
  def destroy(): Readable | Writable = js.native
  def destroy(error: Null, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def destroy(error: Error): Readable | Writable = js.native
  def destroy(error: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def undestroy(): Unit = js.native
}

