package typings.stompit

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libChannelMod {
  type Body = String | Buffer | js.Function0[Readable]
}
