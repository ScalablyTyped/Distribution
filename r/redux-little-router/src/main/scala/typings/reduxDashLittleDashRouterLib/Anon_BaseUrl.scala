package typings
package reduxDashLittleDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: java.lang.String
  var passRouterStateToReducer: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String
  var query: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ObjectLiteral[java.lang.String]
  var url: java.lang.String
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    path: java.lang.String,
    query: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod.ObjectLiteral[java.lang.String],
    url: java.lang.String,
    passRouterStateToReducer: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(passRouterStateToReducer)) __obj.updateDynamic("passRouterStateToReducer")(passRouterStateToReducer)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

