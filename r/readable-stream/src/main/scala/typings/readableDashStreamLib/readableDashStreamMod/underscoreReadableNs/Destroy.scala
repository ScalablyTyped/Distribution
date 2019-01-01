package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== destroy ====
@js.native
trait Destroy extends js.Object {
  def destroy(`this`: Readable): Readable | Writable = js.native
  def destroy(`this`: Readable, error: nodeLib.Error): Readable | Writable = js.native
  def destroy(
    `this`: Readable,
    error: nodeLib.Error,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): Readable | Writable = js.native
  def destroy(
    `this`: Readable,
    error: scala.Null,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): Readable | Writable = js.native
  def destroy(`this`: Writable): Readable | Writable = js.native
  def destroy(`this`: Writable, error: nodeLib.Error): Readable | Writable = js.native
  def destroy(
    `this`: Writable,
    error: nodeLib.Error,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): Readable | Writable = js.native
  def destroy(
    `this`: Writable,
    error: scala.Null,
    callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]
  ): Readable | Writable = js.native
  def undestroy(`this`: Readable): scala.Unit = js.native
  def undestroy(`this`: Writable): scala.Unit = js.native
}

