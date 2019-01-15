package typings
package spectedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectedMod {
  type ErrorMsg = java.lang.String | (js.Function2[/* value */ js.Any, /* field */ java.lang.String, java.lang.String])
  type Predicate = js.Function2[/* value */ js.Any, /* inputs */ js.Any, scala.Boolean]
  type SpecValue = (js.Array[js.Tuple2[Predicate, ErrorMsg]]) | (js.Function1[/* value */ js.Any, js.Any]) | Spec
  type Spected = js.Function2[/* spec */ Spec, /* input */ js.Any, Result]
}
