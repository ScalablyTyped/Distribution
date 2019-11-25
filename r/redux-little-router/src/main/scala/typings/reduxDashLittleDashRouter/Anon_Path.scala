package typings.reduxDashLittleDashRouter

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: String
  var query: ObjectLiteral[String]
  var url: String
}

object Anon_Path {
  @scala.inline
  def apply(path: String, query: ObjectLiteral[String], url: String): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Path]
  }
}

