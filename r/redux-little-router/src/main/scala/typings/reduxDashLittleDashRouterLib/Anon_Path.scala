package typings
package reduxDashLittleDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: java.lang.String
  var query: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ObjectLiteral[java.lang.String]
  var url: java.lang.String
}

object Anon_Path {
  @scala.inline
  def apply(
    path: java.lang.String,
    query: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ObjectLiteral[java.lang.String],
    url: java.lang.String
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, query = query, url = url)
  
    __obj.asInstanceOf[Anon_Path]
  }
}

