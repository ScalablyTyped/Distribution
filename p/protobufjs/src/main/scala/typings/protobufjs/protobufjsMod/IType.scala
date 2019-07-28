package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.protobufjs.protobufjsMod.AnyNestedObject because Already inherited */ trait IType extends INamespace {
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /** Field descriptors */
  var fields: StringDictionary[IField]
  /** Whether a legacy group or not */
  var group: js.UndefOr[Boolean] = js.undefined
  /** Oneof descriptors */
  var oneofs: js.UndefOr[StringDictionary[IOneOf]] = js.undefined
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}

object IType {
  @scala.inline
  def apply(
    fields: StringDictionary[IField],
    extensions: js.Array[js.Array[Double]] = null,
    group: js.UndefOr[Boolean] = js.undefined,
    nested: StringDictionary[AnyNestedObject] = null,
    oneofs: StringDictionary[IOneOf] = null,
    options: StringDictionary[js.Any] = null,
    reserved: js.Array[js.Array[Double]] = null
  ): IType = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group)
    if (nested != null) __obj.updateDynamic("nested")(nested)
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs)
    if (options != null) __obj.updateDynamic("options")(options)
    if (reserved != null) __obj.updateDynamic("reserved")(reserved)
    __obj.asInstanceOf[IType]
  }
}

