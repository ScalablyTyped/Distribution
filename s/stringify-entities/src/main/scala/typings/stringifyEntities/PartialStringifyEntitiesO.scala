package typings.stringifyEntities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stringify-entities.stringify-entities.StringifyEntitiesOptions> */
trait PartialStringifyEntitiesO extends js.Object {
  var attribute: js.UndefOr[Boolean] = js.undefined
  var escapeOnly: js.UndefOr[Boolean] = js.undefined
  var omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined
  var subset: js.UndefOr[js.Array[String]] = js.undefined
  var useNamedReferences: js.UndefOr[Boolean] = js.undefined
  var useShortestReferences: js.UndefOr[Boolean] = js.undefined
}

object PartialStringifyEntitiesO {
  @scala.inline
  def apply(
    attribute: js.UndefOr[Boolean] = js.undefined,
    escapeOnly: js.UndefOr[Boolean] = js.undefined,
    omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined,
    subset: js.Array[String] = null,
    useNamedReferences: js.UndefOr[Boolean] = js.undefined,
    useShortestReferences: js.UndefOr[Boolean] = js.undefined
  ): PartialStringifyEntitiesO = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeOnly)) __obj.updateDynamic("escapeOnly")(escapeOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(omitOptionalSemicolons)) __obj.updateDynamic("omitOptionalSemicolons")(omitOptionalSemicolons.asInstanceOf[js.Any])
    if (subset != null) __obj.updateDynamic("subset")(subset.asInstanceOf[js.Any])
    if (!js.isUndefined(useNamedReferences)) __obj.updateDynamic("useNamedReferences")(useNamedReferences.asInstanceOf[js.Any])
    if (!js.isUndefined(useShortestReferences)) __obj.updateDynamic("useShortestReferences")(useShortestReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStringifyEntitiesO]
  }
}

