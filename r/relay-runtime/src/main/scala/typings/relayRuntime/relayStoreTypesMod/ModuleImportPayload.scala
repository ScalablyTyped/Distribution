package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleImportPayload extends StObject {
  
  val data: PayloadData
  
  val dataID: DataID
  
  val operationReference: js.Any
  
  val path: js.Array[String]
  
  val typeName: String
  
  val variables: Variables
}
object ModuleImportPayload {
  
  inline def apply(
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
  
  extension [Self <: ModuleImportPayload](x: Self) {
    
    inline def setData(value: PayloadData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataID(value: DataID): Self = StObject.set(x, "dataID", value.asInstanceOf[js.Any])
    
    inline def setOperationReference(value: js.Any): Self = StObject.set(x, "operationReference", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
