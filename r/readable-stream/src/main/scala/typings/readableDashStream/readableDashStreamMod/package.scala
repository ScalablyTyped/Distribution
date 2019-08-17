package typings.readableDashStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readableDashStreamMod {
  import typings.readableDashStream.Anon_AllowHalfOpen
  import typings.readableDashStream.Anon_Callback
  import typings.readableDashStream.Anon_CallbackChunk
  import typings.readableDashStream.Anon_CallbackChunkDestroy

  // ==== _stream_duplex ====
  type DuplexOptions = ReadableOptions with WritableOptions with Anon_AllowHalfOpen
  type ReadableOptions = ReadableStateOptions with Anon_Callback
  // ==== _stream_transform ====
  type TransformOptions = DuplexOptions with Anon_CallbackChunk
  type WritableOptions = WritableStateOptions with Anon_CallbackChunkDestroy
}
