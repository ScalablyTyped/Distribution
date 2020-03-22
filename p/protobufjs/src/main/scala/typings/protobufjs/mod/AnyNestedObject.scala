package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typings.protobufjs.mod.IEnum
  - typings.protobufjs.mod.IType
  - typings.protobufjs.mod.IService
  - typings.protobufjs.mod.AnyExtensionField
  - typings.protobufjs.mod.INamespace
*/
trait AnyNestedObject extends js.Object

object AnyNestedObject {
  @scala.inline
  def IEnum(values: StringDictionary[Double], options: StringDictionary[js.Any] = null): AnyNestedObject = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  @scala.inline
  def INamespace(nested: StringDictionary[AnyNestedObject] = null, options: StringDictionary[js.Any] = null): AnyNestedObject = {
    val __obj = js.Dynamic.literal()
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  @scala.inline
  def IExtensionMapField(
    extend: String,
    id: Double,
    keyType: String,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): AnyNestedObject = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  @scala.inline
  def IService(
    methods: StringDictionary[IMethod],
    nested: StringDictionary[AnyNestedObject] = null,
    options: StringDictionary[js.Any] = null
  ): AnyNestedObject = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  @scala.inline
  def IType(
    fields: StringDictionary[IField],
    extensions: js.Array[js.Array[Double]] = null,
    group: js.UndefOr[Boolean] = js.undefined,
    nested: StringDictionary[AnyNestedObject] = null,
    oneofs: StringDictionary[IOneOf] = null,
    options: StringDictionary[js.Any] = null,
    reserved: js.Array[js.Array[Double]] = null
  ): AnyNestedObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (oneofs != null) __obj.updateDynamic("oneofs")(oneofs.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
  @scala.inline
  def IExtensionField(
    extend: String,
    id: Double,
    `type`: String,
    options: StringDictionary[js.Any] = null,
    rule: String = null
  ): AnyNestedObject = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyNestedObject]
  }
}

