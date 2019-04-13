package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readableDashStreamMod {
  // ==== _stream_duplex ====
  type DuplexOptions = ReadableOptions with WritableOptions with readableDashStreamLib.Anon_AllowHalfOpen
  type ReadableOptions = ReadableStateOptions with readableDashStreamLib.Anon_Callback
  // ==== _stream_transform ====
  type TransformOptions = DuplexOptions with readableDashStreamLib.Anon_CallbackChunk
  type WritableOptions = WritableStateOptions with readableDashStreamLib.Anon_CallbackChunkDestroy
}
