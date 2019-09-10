package typings.reduxDashApiDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashApiDashMiddlewareMod {
  type TypeOrResolver[Arg, Type] = Type | (js.Function1[/* arg */ Arg, Type])
}
