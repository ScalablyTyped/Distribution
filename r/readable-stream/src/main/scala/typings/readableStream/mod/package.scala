package typings.readableStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // ==== _stream_duplex ====
  type DuplexOptions = typings.readableStream.mod.ReadableOptions with typings.readableStream.mod.WritableOptions with typings.readableStream.AnonAllowHalfOpen
  type ReadableOptions = typings.readableStream.mod.ReadableStateOptions with typings.readableStream.AnonCallback
  // ==== _stream_transform ====
  type TransformOptions = typings.readableStream.mod.DuplexOptions with typings.readableStream.AnonCallbackChunk
  type WritableOptions = typings.readableStream.mod.WritableStateOptions with typings.readableStream.AnonCallbackChunkDestroy
}
