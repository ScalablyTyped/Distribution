package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreReadableNs {
  // ==== _stream_duplex ====
  type DuplexOptions = ReadableOptions with WritableOptions with readableDashStreamLib.Anon_Read
  type ReadableOptions = ReadableStateOptions with readableDashStreamLib.Anon_DestroyThis
  type Stream = readableDashStreamLib.readableDashStreamMod._Readable
  // ==== _stream_transform ====
  type TransformOptions = DuplexOptions with readableDashStreamLib.Anon_ReadThis
  type WritableOptions = WritableStateOptions with readableDashStreamLib.Anon_Destroy
}
