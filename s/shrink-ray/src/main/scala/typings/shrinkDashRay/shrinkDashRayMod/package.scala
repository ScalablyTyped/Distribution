package typings.shrinkDashRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shrinkDashRayMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  type FilterFunction = js.Function2[/* req */ Request, /* res */ Response, Boolean]
}
