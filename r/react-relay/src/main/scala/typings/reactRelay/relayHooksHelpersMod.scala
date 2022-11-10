package typings.reactRelay

import typings.relayRuntime.libStoreRelayStoreTypesMod.FragmentType
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksHelpersMod {
  
  type ArrayKeyType[TData] = js.Array[KeyType[js.Array[TData]] | Null]
  
  type ArrayKeyTypeData[TKey /* <: ArrayKeyType[TData] */, TData] = KeyTypeData[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: TKey[number] */ js.Any
    ], 
    Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TEntryPoint extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPoint<infer TEntryPointComponent, infer TEntryPointParams> ? TEntryPointComponent : never
    }}}
    */
  @js.native
  trait GetEntryPointComponentFromEntryPoint[TEntryPoint] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TEntryPoint extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPoint<infer TEntryPointComponent, infer TEntryPointParams> ? TEntryPointParams : never
    }}}
    */
  @js.native
  trait GetEntryPointParamsFromEntryPoint[TEntryPoint] extends StObject
  
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
