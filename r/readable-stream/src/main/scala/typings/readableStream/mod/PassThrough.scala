package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== _stream_passthrough ====
@JSImport("readable-stream", "PassThrough")
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

