package typings.protobufjs.extDescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDescriptorProto extends js.Object {
  var dependency: js.UndefOr[js.Any] = js.undefined
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.undefined
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  var messageType: js.UndefOr[js.Array[IDescriptorProto]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[IFileOptions] = js.undefined
  var `package`: js.UndefOr[String] = js.undefined
  var publicDependency: js.UndefOr[js.Any] = js.undefined
  var service: js.UndefOr[js.Array[IServiceDescriptorProto]] = js.undefined
  var sourceCodeInfo: js.UndefOr[js.Any] = js.undefined
  var syntax: js.UndefOr[String] = js.undefined
  var weakDependency: js.UndefOr[js.Any] = js.undefined
}

object IFileDescriptorProto {
  @scala.inline
  def apply(
    dependency: js.Any = null,
    enumType: js.Array[IEnumDescriptorProto] = null,
    extension: js.Array[IFieldDescriptorProto] = null,
    messageType: js.Array[IDescriptorProto] = null,
    name: String = null,
    options: IFileOptions = null,
    `package`: String = null,
    publicDependency: js.Any = null,
    service: js.Array[IServiceDescriptorProto] = null,
    sourceCodeInfo: js.Any = null,
    syntax: String = null,
    weakDependency: js.Any = null
  ): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (enumType != null) __obj.updateDynamic("enumType")(enumType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (`package` != null) __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    if (publicDependency != null) __obj.updateDynamic("publicDependency")(publicDependency.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (sourceCodeInfo != null) __obj.updateDynamic("sourceCodeInfo")(sourceCodeInfo.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (weakDependency != null) __obj.updateDynamic("weakDependency")(weakDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorProto]
  }
}

