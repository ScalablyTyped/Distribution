package typings.stringifyEntities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyEntitiesOptions extends js.Object {
  /**
    * Only needed when operating dangerously with `omitOptionalSemicolons: true`.
    * Create entities which don’t fail in attributes (`boolean?`, default: `false`).
    */
  var attribute: Boolean
  /**
    * Whether to only escape possibly dangerous characters (`boolean`, default: `false`).
    * Those characters are `"`, `'`, `<`, `>` `&`, and `` ` ``.
    */
  var escapeOnly: Boolean
  /**
    * Whether to omit semi-colons when possible (`boolean?`, default: `false`).
    * **Note**: This creates parse errors, don’t use this except when building a minifier.
    *
    * Omitting semi-colons is possible for certain legacy named references, and numeric entities, in some cases.
    */
  var omitOptionalSemicolons: Boolean
  /**
    * Whether to only escape the given subset of characters (`Array.<string>`).
    */
  var subset: js.Array[String]
  /**
    * Whether to use named entities where possible (`boolean?`, default: `false`).
    */
  var useNamedReferences: Boolean
  /**
    * Whether to use named entities, where possible, if that results in less bytes (`boolean?`, default: `false`).
    * **Note**: `useNamedReferences` can be omitted when using `useShortestReferences`.
    */
  var useShortestReferences: Boolean
}

object StringifyEntitiesOptions {
  @scala.inline
  def apply(
    attribute: Boolean,
    escapeOnly: Boolean,
    omitOptionalSemicolons: Boolean,
    subset: js.Array[String],
    useNamedReferences: Boolean,
    useShortestReferences: Boolean
  ): StringifyEntitiesOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], escapeOnly = escapeOnly.asInstanceOf[js.Any], omitOptionalSemicolons = omitOptionalSemicolons.asInstanceOf[js.Any], subset = subset.asInstanceOf[js.Any], useNamedReferences = useNamedReferences.asInstanceOf[js.Any], useShortestReferences = useShortestReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyEntitiesOptions]
  }
}

