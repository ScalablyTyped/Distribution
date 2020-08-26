package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDescriptorProto extends js.Object {
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.native
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  var extensionRange: js.UndefOr[js.Array[IDescriptorProtoExtensionRange]] = js.native
  var field: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  var name: js.UndefOr[String] = js.native
  var nestedType: js.UndefOr[js.Array[IDescriptorProto]] = js.native
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto]] = js.native
  var options: js.UndefOr[IMessageOptions] = js.native
  var reservedName: js.UndefOr[js.Array[String]] = js.native
  var reservedRange: js.UndefOr[js.Array[IDescriptorProtoReservedRange]] = js.native
}

object IDescriptorProto {
  @scala.inline
  def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  @scala.inline
  implicit class IDescriptorProtoOps[Self <: IDescriptorProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = this.set("enumType", js.Array(value :_*))
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = this.set("enumType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumType: Self = this.set("enumType", js.undefined)
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = this.set("extension", js.Array(value :_*))
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setExtensionRangeVarargs(value: IDescriptorProtoExtensionRange*): Self = this.set("extensionRange", js.Array(value :_*))
    @scala.inline
    def setExtensionRange(value: js.Array[IDescriptorProtoExtensionRange]): Self = this.set("extensionRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionRange: Self = this.set("extensionRange", js.undefined)
    @scala.inline
    def setFieldVarargs(value: IFieldDescriptorProto*): Self = this.set("field", js.Array(value :_*))
    @scala.inline
    def setField(value: js.Array[IFieldDescriptorProto]): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNestedTypeVarargs(value: IDescriptorProto*): Self = this.set("nestedType", js.Array(value :_*))
    @scala.inline
    def setNestedType(value: js.Array[IDescriptorProto]): Self = this.set("nestedType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedType: Self = this.set("nestedType", js.undefined)
    @scala.inline
    def setOneofDeclVarargs(value: IOneofDescriptorProto*): Self = this.set("oneofDecl", js.Array(value :_*))
    @scala.inline
    def setOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = this.set("oneofDecl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneofDecl: Self = this.set("oneofDecl", js.undefined)
    @scala.inline
    def setOptions(value: IMessageOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setReservedNameVarargs(value: String*): Self = this.set("reservedName", js.Array(value :_*))
    @scala.inline
    def setReservedName(value: js.Array[String]): Self = this.set("reservedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedName: Self = this.set("reservedName", js.undefined)
    @scala.inline
    def setReservedRangeVarargs(value: IDescriptorProtoReservedRange*): Self = this.set("reservedRange", js.Array(value :_*))
    @scala.inline
    def setReservedRange(value: js.Array[IDescriptorProtoReservedRange]): Self = this.set("reservedRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedRange: Self = this.set("reservedRange", js.undefined)
  }
  
}

