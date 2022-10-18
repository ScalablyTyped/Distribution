package typings.relayRuntime

import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.FragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreReadInlineDataMod {
  
  @JSImport("relay-runtime/lib/store/readInlineData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readInlineData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readInlineData_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readInlineData")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  /* Inlined std.Readonly<{   $data :TData | undefined,    $fragmentSpreads :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.FragmentType}> */
  trait KeyType[TData] extends StObject {
    
    @JSName(" $data")
    val Space$data: js.UndefOr[TData] = js.undefined
    
    @JSName(" $fragmentSpreads")
    val Space$fragmentSpreads: FragmentType
  }
  object KeyType {
    
    inline def apply[TData](Space$fragmentSpreads: FragmentType): KeyType[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentSpreads")(Space$fragmentSpreads.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyType[TData]]
    }
    
    extension [Self <: KeyType[?], TData](x: Self & KeyType[TData]) {
      
      inline def setSpace$data(value: TData): Self = StObject.set(x, " $data", value.asInstanceOf[js.Any])
      
      inline def setSpace$dataUndefined: Self = StObject.set(x, " $data", js.undefined)
      
      inline def setSpace$fragmentSpreads(value: FragmentType): Self = StObject.set(x, " $fragmentSpreads", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyTypeData[TKey /* <: KeyType[TData] */, TData] = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
}
