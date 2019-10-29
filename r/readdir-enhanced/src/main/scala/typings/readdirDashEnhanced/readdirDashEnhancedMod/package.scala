package typings.readdirDashEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readdirDashEnhancedMod {
  import typings.node.NodeJS.ErrnoException

  type Callback[T] = js.Function2[/* err */ ErrnoException | Null, /* result */ T, Unit]
  type FilterFunction = js.Function1[/* stat */ Stats, js.Any]
  type PathsArrayCallback = Callback[js.Array[String]]
  type StatsArrayCallback = Callback[js.Array[Stats]]
}
