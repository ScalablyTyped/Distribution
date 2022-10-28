package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatableData[TKey /* <: HasUpdatableSpread[TData] */, TData] extends StObject {
  
  val updatableData: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
}
object UpdatableData {
  
  inline def apply[TKey /* <: HasUpdatableSpread[TData] */, TData](
    updatableData: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
  ): UpdatableData[TKey, TData] = {
    val __obj = js.Dynamic.literal(updatableData = updatableData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatableData[TKey, TData]]
  }
  
  extension [Self <: UpdatableData[?, ?], TKey /* <: HasUpdatableSpread[TData] */, TData](x: Self & (UpdatableData[TKey, TData])) {
    
    inline def setUpdatableData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
    ): Self = StObject.set(x, "updatableData", value.asInstanceOf[js.Any])
  }
}
