package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.node.streamMod.TransformCallback
import typings.readableStream.anon.AfterTransform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typings.node.eventsMod.EventEmitter because Already inherited
- typings.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typings.node.childProcessMod.StdioNull because Already inherited
- typings.node.streamMod.internal because Already inherited
- typings.node.NodeJS.ReadableStream because Already inherited
- typings.node.streamMod.Stream because Already inherited
- typings.node.streamMod.Readable because Already inherited
- typings.node.streamMod.Duplex because Already inherited
- typings.node.streamMod.Transform because Inheritance from two classes. Inlined _flush, _transform */ @JSImport("readable-stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(options: TransformOptions) = this()
  
  def _flush(
    callback: (js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  
  def _transform(
    chunk: js.Any,
    encoding: BufferEncoding,
    callback: (js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  
  var _transformState: AfterTransform = js.native
}
