package typings.reactBootstrapTable2Filter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterProps extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var comparator: js.UndefOr[Comparator] = js.undefined
  var `type`: js.UndefOr[String | FILTER_TYPES] = js.undefined
}

object CustomFilterProps {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    comparator: Comparator = null,
    `type`: String | FILTER_TYPES = null
  ): CustomFilterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterProps]
  }
}

