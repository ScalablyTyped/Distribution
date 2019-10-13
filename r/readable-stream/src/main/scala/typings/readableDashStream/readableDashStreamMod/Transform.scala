package typings.readableDashStream.readableDashStreamMod

import typings.node.streamMod.TransformCallback
import typings.readableDashStream.Anon_AfterTransform
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.streamMod.Readable because Already inherited
- typings.node.streamMod.Duplex because Already inherited
- typings.node.streamMod.Transform because Inheritance from two classes. Inlined _flush, _transform */ @JSImport("readable-stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(options: TransformOptions) = this()
  var _transformState: Anon_AfterTransform = js.native
  def _flush(
    callback: (js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  def _transform(
    chunk: js.Any,
    encoding: String,
    callback: (js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
}

