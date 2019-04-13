package typings
package restLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restMod {
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Interceptor[T] = js.Function2[/* parent */ js.UndefOr[Client], /* config */ js.UndefOr[T], Client]
}
