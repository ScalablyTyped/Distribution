package typings.reduxDashLittleDashRouter

import typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: String
  var passRouterStateToReducer: js.UndefOr[Boolean] = js.undefined
  var path: String
  var query: ObjectLiteral[String]
  var url: String
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String,
    path: String,
    query: ObjectLiteral[String],
    url: String,
    passRouterStateToReducer: js.UndefOr[Boolean] = js.undefined
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(passRouterStateToReducer)) __obj.updateDynamic("passRouterStateToReducer")(passRouterStateToReducer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

