package typings.protobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDescriptorProto extends js.Object {
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.undefined
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  var extensionRange: js.UndefOr[js.Array[IDescriptorProtoExtensionRange]] = js.undefined
  var field: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nestedType: js.UndefOr[js.Array[IDescriptorProto]] = js.undefined
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto]] = js.undefined
  var options: js.UndefOr[IMessageOptions] = js.undefined
  var reservedName: js.UndefOr[js.Array[String]] = js.undefined
  var reservedRange: js.UndefOr[js.Array[IDescriptorProtoReservedRange]] = js.undefined
}

object IDescriptorProto {
  @scala.inline
  def apply(
    enumType: js.Array[IEnumDescriptorProto] = null,
    extension: js.Array[IFieldDescriptorProto] = null,
    extensionRange: js.Array[IDescriptorProtoExtensionRange] = null,
    field: js.Array[IFieldDescriptorProto] = null,
    name: String = null,
    nestedType: js.Array[IDescriptorProto] = null,
    oneofDecl: js.Array[IOneofDescriptorProto] = null,
    options: IMessageOptions = null,
    reservedName: js.Array[String] = null,
    reservedRange: js.Array[IDescriptorProtoReservedRange] = null
  ): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (enumType != null) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (extensionRange != null) __obj.updateDynamic("extensionRange")(extensionRange.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nestedType != null) __obj.updateDynamic("nestedType")(nestedType.asInstanceOf[js.Any])
    if (oneofDecl != null) __obj.updateDynamic("oneofDecl")(oneofDecl.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (reservedName != null) __obj.updateDynamic("reservedName")(reservedName.asInstanceOf[js.Any])
    if (reservedRange != null) __obj.updateDynamic("reservedRange")(reservedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDescriptorProto]
  }
}

