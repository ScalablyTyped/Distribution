package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- protobufjsLib.protobufjsMod.AnyNestedObject because Already inherited */ trait IType extends INamespace {
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /** Field descriptors */
  var fields: org.scalablytyped.runtime.StringDictionary[IField]
  /** Whether a legacy group or not */
  var group: js.UndefOr[scala.Boolean] = js.undefined
  /** Oneof descriptors */
  var oneofs: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IOneOf]] = js.undefined
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
}

object IType {
  @scala.inline
  def apply(
    fields: org.scalablytyped.runtime.StringDictionary[IField],
    extensions: js.Array[js.Array[scala.Double]] = null,
    group: js.UndefOr[scala.Boolean] = js.undefined,
    nested: org.scalablytyped.runtime.StringDictionary[AnyNestedObject] = null,
    oneofs: org.scalablytyped.runtime.StringDictionary[IOneOf] = null,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    reserved: js.Array[js.Array[scala.Double]] = null
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

