package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_passthrough ====
/* RemoveMultipleInheritance: Dropped parents List(nodeLib.streamMod.PassThrough because Inheritance from two classes)*/
@js.native
trait PassThrough extends Transform {
  def _transform[T](
    chunk: T,
    encoding: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: scala.Null,
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
}

