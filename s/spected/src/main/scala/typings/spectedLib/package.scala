package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spectedLib {
  type ErrorMsg[INPUT] = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Symbol | scala.Null | js.Object | (js.Function2[/* value */ INPUT, /* field */ java.lang.String, js.Any])
  ]
  type Predicate[INPUT, ROOTINPUT] = js.Function2[/* value */ INPUT, /* inputs */ ROOTINPUT, scala.Boolean]
}
