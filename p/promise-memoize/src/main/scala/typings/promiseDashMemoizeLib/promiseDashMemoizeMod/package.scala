package typings
package promiseDashMemoizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashMemoizeMod {
  /* Rewritten from type alias, can be one of: 
    - promiseDashMemoizeLib.promiseDashMemoizeLibStrings.simple
    - promiseDashMemoizeLib.promiseDashMemoizeLibStrings.json
    - js.Function1[/ * args * / js.Array[js.Any], js.Any]
    - js.Array[
  promiseDashMemoizeLib.promiseDashMemoizeLibStrings.json | (js.Function1[/ * arg * / js.Any, js.Any])]
  */
  type KeyResolver = _KeyResolver | (js.Function1[/* args */ js.Array[js.Any], js.Any]) | (js.Array[
    promiseDashMemoizeLib.promiseDashMemoizeLibStrings.json | (js.Function1[/* arg */ js.Any, js.Any])
  ])
}
