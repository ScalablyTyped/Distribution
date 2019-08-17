package typings.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libChannelMod {
  import typings.node.Buffer
  import typings.node.streamMod.Readable

  type Body = String | Buffer | js.Function0[Readable]
}
