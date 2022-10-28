package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{   $data :TData | undefined,   $updatableFragmentSpreads :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.FragmentType}> */
trait HasUpdatableSpread[TData] extends StObject {
  
  @JSName("$updatableFragmentSpreads")
  val $updatableFragmentSpreads: FragmentType
  
  @JSName(" $data")
  val Space$data: js.UndefOr[TData] = js.undefined
}
object HasUpdatableSpread {
  
  inline def apply[TData]($updatableFragmentSpreads: FragmentType): HasUpdatableSpread[TData] = {
    val __obj = js.Dynamic.literal($updatableFragmentSpreads = $updatableFragmentSpreads.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasUpdatableSpread[TData]]
  }
  
  extension [Self <: HasUpdatableSpread[?], TData](x: Self & HasUpdatableSpread[TData]) {
    
    inline def set$updatableFragmentSpreads(value: FragmentType): Self = StObject.set(x, "$updatableFragmentSpreads", value.asInstanceOf[js.Any])
    
    inline def setSpace$data(value: TData): Self = StObject.set(x, " $data", value.asInstanceOf[js.Any])
    
    inline def setSpace$dataUndefined: Self = StObject.set(x, " $data", js.undefined)
  }
}
