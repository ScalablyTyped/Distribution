package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.protobufjs.mod.AnyNestedObject because Already inherited */ trait IType extends INamespace {
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
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.get.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
}

