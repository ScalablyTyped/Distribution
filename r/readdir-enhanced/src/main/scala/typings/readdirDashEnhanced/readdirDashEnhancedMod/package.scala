package typings.readdirDashEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readdirDashEnhancedMod {
  import typings.node.NodeJSNs.ErrnoException

  type Callback[T] = js.Function2[/* err */ ErrnoException | Null, /* result */ T, Unit]
  type CallbackEntry = Callback[js.Array[Entry]]
  type CallbackString = Callback[js.Array[String]]
  type FilterFunction = js.Function1[/* stat */ Entry, Boolean]
}
