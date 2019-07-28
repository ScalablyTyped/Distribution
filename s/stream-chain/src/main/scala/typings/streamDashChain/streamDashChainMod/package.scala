package typings.streamDashChain

import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashChainMod {
  type Stream = Readable | Writable | Duplex | Transform
  type StreamItem = Stream | TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[String], js.Any]
}
