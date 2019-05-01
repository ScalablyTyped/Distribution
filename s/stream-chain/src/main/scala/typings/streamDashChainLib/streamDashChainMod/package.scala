package typings
package streamDashChainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashChainMod {
  type Stream = nodeLib.streamMod.Readable | nodeLib.streamMod.Writable | nodeLib.streamMod.Duplex | nodeLib.streamMod.Transform
  type StreamItem = Stream | TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
