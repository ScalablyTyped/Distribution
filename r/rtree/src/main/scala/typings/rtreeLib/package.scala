package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rtreeLib {
  type RTreeFactory = js.Function1[/* max_node_width */ js.UndefOr[scala.Double], RTreeStatic]
}
