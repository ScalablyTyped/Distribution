package typings.readableDashStream.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_passthrough ====
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.eventsMod.internal because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.childUnderscoreProcessMod.StdioNull because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.Stream because Already inherited
- typings.node.streamMod.Readable because Already inherited
- typings.node.streamMod.Duplex because Already inherited
- typings.node.streamMod.Transform because Already inherited
- typings.node.streamMod.PassThrough because Inheritance from two classes. Inlined  */ @JSImport("readable-stream", "PassThrough")
@js.native
class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Any, /* data */ T, Unit]
  ): Unit = js.native
  def _transform[T](chunk: T, encoding: String, callback: js.Function2[/* error */ js.Any, /* data */ T, Unit]): Unit = js.native
  def _transform[T](chunk: T, encoding: Null, callback: js.Function2[/* error */ js.Any, /* data */ T, Unit]): Unit = js.native
}

