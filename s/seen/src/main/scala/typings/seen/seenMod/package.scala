package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object seenMod {
  type FrameHandler = js.Function2[/* timestamp */ Double, /* deltaTimestamp */ Double, Unit]
}
