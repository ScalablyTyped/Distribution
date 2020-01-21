package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldDescriptorProto extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var extendee: js.UndefOr[String] = js.undefined
  var jsonName: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[IFieldDescriptorProtoLabel] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var oneofIndex: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[IFieldOptions] = js.undefined
  var `type`: js.UndefOr[IFieldDescriptorProtoType] = js.undefined
  var typeName: js.UndefOr[String] = js.undefined
}

object IFieldDescriptorProto {
  @scala.inline
  def apply(
    defaultValue: String = null,
    extendee: String = null,
    jsonName: js.Any = null,
    label: Int | Double = null,
    name: String = null,
    number: Int | Double = null,
    oneofIndex: Int | Double = null,
    options: IFieldOptions = null,
    `type`: Int | Double = null,
    typeName: String = null
  ): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (extendee != null) __obj.updateDynamic("extendee")(extendee.asInstanceOf[js.Any])
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (oneofIndex != null) __obj.updateDynamic("oneofIndex")(oneofIndex.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
}

