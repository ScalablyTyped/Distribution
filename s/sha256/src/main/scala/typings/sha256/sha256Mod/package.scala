package typings.sha256

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sha256Mod {
  import typings.node.Buffer

  type Message = String | Buffer | js.Array[Double]
}
