package typings.resourcejs.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any] {
  var countQuery: js.Any = js.native
  var modelQuery: js.Any = js.native
  var noResponse: Boolean = js.native
  var skipDelete: Boolean = js.native
  var skipResource: Boolean = js.native
}

