package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImportPayload extends js.Object {
  val data: PayloadData
  val dataID: DataID
  val operationReference: js.Any
  val path: js.Array[String]
  val typeName: String
  val variables: Variables
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
}

