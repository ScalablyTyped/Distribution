package typings
package reactDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRequestMod {
  type DoFetch[T] = js.Function1[/* options */ js.UndefOr[DoFetchOptions], js.Promise[FetchResponse[T]]]
}
