package typings.reactDashResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashResolverMod {
  type ResolveFn[Props, V] = js.Function1[/* props */ Props, js.Promise[V]]
}
