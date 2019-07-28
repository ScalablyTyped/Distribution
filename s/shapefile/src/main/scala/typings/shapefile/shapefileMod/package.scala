package typings.shapefile

import typings.node.streamMod.Readable
import typings.std.ArrayBuffer
import typings.std.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shapefileMod {
  type Openable = String | ArrayBuffer | Uint8Array | Readable | ReadableStream[js.Any]
}
