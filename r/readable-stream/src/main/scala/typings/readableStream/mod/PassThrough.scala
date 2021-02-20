package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_passthrough ====
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
- typings.node.streamMod.Transform because Already inherited
- typings.node.streamMod.PassThrough because Inheritance from two classes. Inlined  */ @JSImport("readable-stream", "PassThrough")
@js.native
class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: String,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: Null,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: BufferEncoding,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
}
