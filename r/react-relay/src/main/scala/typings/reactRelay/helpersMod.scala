package typings.reactRelay

import typings.relayRuntime.relayStoreTypesMod.FragmentType
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  type ArrayKeyType[TData] = js.Array[KeyType[js.Array[TData]] | Null]
  
  type ArrayKeyTypeData[TKey /* <: ArrayKeyType[TData] */, TData] = KeyTypeData[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: TKey[number] */ js.Any
    ], 
    Any
  ]
  
  type GetEntryPointComponentFromEntryPoint[TEntryPoint] = Any
  
  type GetEntryPointParamsFromEntryPoint[TEntryPoint] = Any
  
  /* Inlined std.Readonly<{   $data :TData | undefined,    $fragmentSpreads :relay-runtime.relay-runtime.FragmentType}> */
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
