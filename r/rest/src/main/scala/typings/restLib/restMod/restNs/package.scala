package typings
package restLib.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restNs {
  type Interceptor[T] = js.Function2[/* parent */ js.UndefOr[Client], /* config */ js.UndefOr[T], Client]
}
