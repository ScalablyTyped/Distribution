package typings.reduxLittleRouter.mod

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
    if (!js.isUndefined(forNoMatch)) __obj.updateDynamic("forNoMatch")(forNoMatch.asInstanceOf[js.Any])
    if (forRoute != null) __obj.updateDynamic("forRoute")(forRoute.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (matchRoute != null) __obj.updateDynamic("matchRoute")(matchRoute.asInstanceOf[js.Any])
    if (matchWildcardRoute != null) __obj.updateDynamic("matchWildcardRoute")(matchWildcardRoute.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (parentRoute != null) __obj.updateDynamic("parentRoute")(parentRoute.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (withConditions != null) __obj.updateDynamic("withConditions")(js.Any.fromFunction1(withConditions))
    __obj.asInstanceOf[FragmentProps]
  }
}

