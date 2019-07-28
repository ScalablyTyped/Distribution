package typings.readableDashStream.readableDashStreamMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== destroy ====
@js.native
trait Destroy extends js.Object {
  def destroy(`this`: Readable): Readable | Writable = js.native
  def destroy(`this`: Readable, error: Null, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def destroy(`this`: Readable, error: Error): Readable | Writable = js.native
  def destroy(`this`: Readable, error: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def destroy(`this`: Writable): Readable | Writable = js.native
  def destroy(`this`: Writable, error: Null, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def destroy(`this`: Writable, error: Error): Readable | Writable = js.native
  def destroy(`this`: Writable, error: Error, callback: js.Function1[/* error */ Error | Null, Unit]): Readable | Writable = js.native
  def undestroy(`this`: Readable): Unit = js.native
  def undestroy(`this`: Writable): Unit = js.native
}

