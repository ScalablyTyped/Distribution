package typings
package router5Lib.coreUtilsMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def areStatesDescendants(
    parentState: router5Lib.createDashRouterMod.State,
    childState: router5Lib.createDashRouterMod.State
  ): scala.Boolean = js.native
  def areStatesEqual(state1: router5Lib.createDashRouterMod.State, state2: router5Lib.createDashRouterMod.State): scala.Boolean = js.native
  def areStatesEqual(
    state1: router5Lib.createDashRouterMod.State,
    state2: router5Lib.createDashRouterMod.State,
    ignoreQueryParams: scala.Boolean
  ): scala.Boolean = js.native
  def buildPath(route: java.lang.String, params: router5Lib.createDashRouterMod.Params): java.lang.String = js.native
  def isActive(name: java.lang.String): scala.Boolean = js.native
  def isActive(name: java.lang.String, params: router5Lib.createDashRouterMod.Params): scala.Boolean = js.native
  def isActive(
    name: java.lang.String,
    params: router5Lib.createDashRouterMod.Params,
    strictEquality: scala.Boolean
  ): scala.Boolean = js.native
  def isActive(
    name: java.lang.String,
    params: router5Lib.createDashRouterMod.Params,
    strictEquality: scala.Boolean,
    ignoreQueryParams: scala.Boolean
  ): scala.Boolean = js.native
  def matchPath(path: java.lang.String): router5Lib.createDashRouterMod.State | scala.Null = js.native
  def matchPath(path: java.lang.String, source: java.lang.String): router5Lib.createDashRouterMod.State | scala.Null = js.native
  def setRootPath(rootPath: java.lang.String): scala.Unit = js.native
}

