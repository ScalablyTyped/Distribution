package typings.reactRelay

import typings.relayRuntime.relayStoreTypesMod.FragmentReference
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  type ArrayKeyType[TData] = js.Array[KeyType[js.Array[TData]] | Null]
  
  type ArrayKeyTypeData[TKey /* <: ArrayKeyType[TData] */, TData] = KeyTypeData[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: TKey[number] */ js.Any
    ], 
    js.Any
  ]
  
  type GetEntryPointComponentFromEntryPoint[TEntryPoint] = js.Any
  
  type GetEntryPointParamsFromEntryPoint[TEntryPoint] = js.Any
  
  /* Inlined std.Readonly<{   $data :TData | undefined,    $fragmentRefs :relay-runtime.relay-runtime.FragmentReference}> */
  @js.native
  trait KeyType[TData] extends StObject {
    
    @JSName(" $data")
    val Space$data: js.UndefOr[TData] = js.native
    
    @JSName(" $fragmentRefs")
    val Space$fragmentRefs: FragmentReference = js.native
  }
  object KeyType {
    
    @scala.inline
    def apply[TData](Space$fragmentRefs: FragmentReference): KeyType[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyType[TData]]
    }
    
    @scala.inline
    implicit class KeyTypeMutableBuilder[Self <: KeyType[_], TData] (val x: Self with KeyType[TData]) extends AnyVal {
      
      @scala.inline
      def setSpace$data(value: TData): Self = StObject.set(x, " $data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpace$dataUndefined: Self = StObject.set(x, " $data", js.undefined)
      
      @scala.inline
      def setSpace$fragmentRefs(value: FragmentReference): Self = StObject.set(x, " $fragmentRefs", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyTypeData[TKey /* <: KeyType[TData] */, TData] = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
}
