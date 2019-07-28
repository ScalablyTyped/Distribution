package typings.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentProps extends js.Object {
  var forNoMatch: js.UndefOr[Boolean] = js.undefined
  var forRoute: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var matchRoute: js.UndefOr[js.Function] = js.undefined
  var matchWildcardRoute: js.UndefOr[js.Function] = js.undefined
  var parentId: js.UndefOr[String] = js.undefined
  var parentRoute: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[ObjectLiteral[_]] = js.undefined
  var withConditions: js.UndefOr[js.Function1[/* location */ Location, Boolean]] = js.undefined
}

object FragmentProps {
  @scala.inline
  def apply(
    forNoMatch: js.UndefOr[Boolean] = js.undefined,
    forRoute: String = null,
    location: Location = null,
    matchRoute: js.Function = null,
    matchWildcardRoute: js.Function = null,
    parentId: String = null,
    parentRoute: String = null,
    style: ObjectLiteral[_] = null,
    withConditions: /* location */ Location => Boolean = null
  ): FragmentProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forNoMatch)) __obj.updateDynamic("forNoMatch")(forNoMatch)
    if (forRoute != null) __obj.updateDynamic("forRoute")(forRoute)
    if (location != null) __obj.updateDynamic("location")(location)
    if (matchRoute != null) __obj.updateDynamic("matchRoute")(matchRoute)
    if (matchWildcardRoute != null) __obj.updateDynamic("matchWildcardRoute")(matchWildcardRoute)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    if (parentRoute != null) __obj.updateDynamic("parentRoute")(parentRoute)
    if (style != null) __obj.updateDynamic("style")(style)
    if (withConditions != null) __obj.updateDynamic("withConditions")(js.Any.fromFunction1(withConditions))
    __obj.asInstanceOf[FragmentProps]
  }
}

