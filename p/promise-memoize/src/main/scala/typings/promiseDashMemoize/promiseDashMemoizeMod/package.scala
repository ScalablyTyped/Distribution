package typings.promiseDashMemoize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashMemoizeMod {
  import typings.promiseDashMemoize.promiseDashMemoizeStrings.json

  /* Rewritten from type alias, can be one of: 
    - typings.promiseDashMemoize.promiseDashMemoizeStrings.simple
    - typings.promiseDashMemoize.promiseDashMemoizeStrings.json
    - js.Function1[/ * args * / js.Array[js.Any], js.Any]
    - js.Array[
  typings.promiseDashMemoize.promiseDashMemoizeStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
  */
  type KeyResolver = _KeyResolver | (js.Function1[/* args */ js.Array[js.Any], js.Any]) | (js.Array[json | (js.Function1[/* arg */ js.Any, js.Any])])
}
