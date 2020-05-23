package typings.stringifyEntities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyEntitiesOptions extends js.Object {
  /**
    * Only needed when operating dangerously with `omitOptionalSemicolons: true`.
    * Create entities which don’t fail in attributes (`boolean?`, default: `false`).
    */
  var attribute: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to only escape possibly dangerous characters (`boolean`, default: `false`).
    * Those characters are `"`, `'`, `<`, `>` `&`, and `` ` ``.
    */
  var escapeOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to omit semi-colons when possible (`boolean?`, default: `false`).
    * **Note**: This creates parse errors, don’t use this except when building a minifier.
    *
    * Omitting semi-colons is possible for certain legacy named references, and numeric entities, in some cases.
    */
  var omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to only escape the given subset of characters (`Array.<string>`).
    */
  var subset: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Whether to use named entities where possible (`boolean?`, default: `false`).
    */
  var useNamedReferences: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use named entities, where possible, if that results in less bytes (`boolean?`, default: `false`).
    * **Note**: `useNamedReferences` can be omitted when using `useShortestReferences`.
    */
  var useShortestReferences: js.UndefOr[Boolean] = js.undefined
}

object StringifyEntitiesOptions {
  @scala.inline
  def apply(
    attribute: js.UndefOr[Boolean] = js.undefined,
    escapeOnly: js.UndefOr[Boolean] = js.undefined,
    omitOptionalSemicolons: js.UndefOr[Boolean] = js.undefined,
    subset: js.Array[String] = null,
    useNamedReferences: js.UndefOr[Boolean] = js.undefined,
    useShortestReferences: js.UndefOr[Boolean] = js.undefined
  ): StringifyEntitiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeOnly)) __obj.updateDynamic("escapeOnly")(escapeOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(omitOptionalSemicolons)) __obj.updateDynamic("omitOptionalSemicolons")(omitOptionalSemicolons.get.asInstanceOf[js.Any])
    if (subset != null) __obj.updateDynamic("subset")(subset.asInstanceOf[js.Any])
    if (!js.isUndefined(useNamedReferences)) __obj.updateDynamic("useNamedReferences")(useNamedReferences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useShortestReferences)) __obj.updateDynamic("useShortestReferences")(useShortestReferences.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyEntitiesOptions]
  }
}

