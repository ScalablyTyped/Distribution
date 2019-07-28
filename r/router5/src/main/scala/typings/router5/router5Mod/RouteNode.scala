package typings.router5.router5Mod

import typings.routeDashNode.routeDashNodeMod.Callback
import typings.routeDashNode.routeDashNodeMod.Route
import typings.routeDashNode.routeDashNodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", "RouteNode")
@js.native
class RouteNode protected () extends default {
  def this(
    name: js.UndefOr[String],
    path: js.UndefOr[String],
    childRoutes: js.UndefOr[js.Array[Route]],
    cb: js.UndefOr[Callback],
    parent: js.UndefOr[typings.routeDashNode.routeDashNodeMod.RouteNode],
    finalSort: js.UndefOr[Boolean],
    sort: js.UndefOr[Boolean]
  ) = this()
}

