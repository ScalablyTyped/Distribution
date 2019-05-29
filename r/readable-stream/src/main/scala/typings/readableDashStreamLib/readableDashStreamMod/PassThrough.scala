package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_passthrough ====
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.streamMod.PassThrough because Inheritance from two classes. Inlined  */ @JSImport("readable-stream", "PassThrough")
@js.native
class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: scala.Null,
    callback: js.Function2[/* error */ js.Any, /* data */ T, scala.Unit]
  ): scala.Unit = js.native
}

