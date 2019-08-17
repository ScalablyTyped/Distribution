package typings.streamDashJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamersStreamBaseMod {
  import typings.node.streamMod.Transform

  type ObjectFilterFunction = js.Function1[/* asm */ typings.streamDashJson.assemblerMod.^, js.UndefOr[Boolean]]
  type StreamBase = Transform
}
