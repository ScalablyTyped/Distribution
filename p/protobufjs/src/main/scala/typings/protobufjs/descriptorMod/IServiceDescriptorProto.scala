package typings.protobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServiceDescriptorProto extends js.Object {
  var method: js.UndefOr[js.Array[IMethodDescriptorProto]] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[IServiceOptions] = js.native
}

object IServiceDescriptorProto {
  @scala.inline
  def apply(): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
  @scala.inline
  implicit class IServiceDescriptorProtoOps[Self <: IServiceDescriptorProto] (val x: Self) extends AnyVal {
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
    def setMethodVarargs(value: IMethodDescriptorProto*): Self = this.set("method", js.Array(value :_*))
    @scala.inline
    def setMethod(value: js.Array[IMethodDescriptorProto]): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: IServiceOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

