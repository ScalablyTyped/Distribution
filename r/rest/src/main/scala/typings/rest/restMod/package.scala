package typings.rest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object restMod {
  import org.scalablytyped.runtime.StringDictionary

  type Headers = StringDictionary[js.Any]
  type Interceptor[T] = js.Function2[/* parent */ js.UndefOr[Client], /* config */ js.UndefOr[T], Client]
}
