package typings.shrinkDashRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shrinkDashRayMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.shrinkDashRay.Anon_Brotli
  import typings.std.Partial

  type FilterFunction = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
  type Options = Partial[Anon_Brotli]
}
