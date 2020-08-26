package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleImportPayload extends js.Object {
  val data: PayloadData = js.native
  val dataID: DataID = js.native
  val operationReference: js.Any = js.native
  val path: js.Array[String] = js.native
  val typeName: String = js.native
  val variables: Variables = js.native
}

object ModuleImportPayload {
  @scala.inline
  def apply(
    data: PayloadData,
    dataID: DataID,
    operationReference: js.Any,
    path: js.Array[String],
    typeName: String,
    variables: Variables
  ): ModuleImportPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataID = dataID.asInstanceOf[js.Any], operationReference = operationReference.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPayload]
  }
  @scala.inline
  implicit class ModuleImportPayloadOps[Self <: ModuleImportPayload] (val x: Self) extends AnyVal {
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
    def setData(value: PayloadData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataID(value: DataID): Self = this.set("dataID", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationReference(value: js.Any): Self = this.set("operationReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

