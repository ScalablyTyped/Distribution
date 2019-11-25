package typings.streamtest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamtestMod {
  import typings.node.Buffer
  import typings.std.Uint8Array

  type Chunk = String | Buffer | Uint8Array
  type NonNull = js.UndefOr[js.Object]
}
