package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_passthrough ====
@JSImport("readable-stream", "PassThrough")
@js.native
open class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  
  def _transform[T](
    chunk: T,
    encoding: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: Null,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: Unit,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
}
