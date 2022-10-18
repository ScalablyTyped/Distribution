package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatableData[TData] extends StObject {
  
  val updatableData: TData
}
object UpdatableData {
  
  inline def apply[TData](updatableData: TData): UpdatableData[TData] = {
    val __obj = js.Dynamic.literal(updatableData = updatableData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableData[TData]]
  }
  
  extension [Self <: UpdatableData[?], TData](x: Self & UpdatableData[TData]) {
    
    inline def setUpdatableData(value: TData): Self = StObject.set(x, "updatableData", value.asInstanceOf[js.Any])
  }
}
