package typings.relayDashRuntime.libStoreRelayStoreTypesMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
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
    val __obj = js.Dynamic.literal(data = data, dataID = dataID, operationReference = operationReference, path = path, typeName = typeName, variables = variables)
  
    __obj.asInstanceOf[ModuleImportPayload]
  }
}

