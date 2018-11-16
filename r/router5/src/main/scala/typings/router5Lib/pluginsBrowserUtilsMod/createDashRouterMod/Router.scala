package typings
package router5Lib.pluginsBrowserUtilsMod.createDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Router extends js.Object {
  def buildUrl(route: java.lang.String, params: router5Lib.createDashRouterMod.Params): java.lang.String
  def matchUrl(url: java.lang.String): router5Lib.createDashRouterMod.State | scala.Null
  def urlToPath(url: java.lang.String): java.lang.String
}

