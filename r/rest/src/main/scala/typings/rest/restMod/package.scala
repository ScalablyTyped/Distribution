package typings.rest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restMod {
  type Headers = StringDictionary[js.Any]
  type Interceptor[T] = js.Function2[/* parent */ js.UndefOr[Client], /* config */ js.UndefOr[T], Client]
}
