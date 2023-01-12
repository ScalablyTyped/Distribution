package typings.relayRuntime

import typings.relayRuntime.anon.Data
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.FragmentType
import typings.relayRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreResolverFragmentsMod {
  
  @JSImport("relay-runtime/lib/store/ResolverFragments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("relay-runtime/lib/store/ResolverFragments", "RESOLVER_FRAGMENT_MISSING_DATA_SENTINEL")
  @js.native
  val RESOLVER_FRAGMENT_MISSING_DATA_SENTINEL: Any = js.native
  
  inline def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode): (KeyTypeData[TKey, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  inline def readFragment[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): (KeyTypeData[TKey, Any]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[(KeyTypeData[TKey, Any]) | Null]
  
  inline def readFragment_TKey_ArrayKeyTypeData[TKey /* <: ArrayKeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ArrayKeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[ArrayKeyTypeData[TKey, Any]]
  
  inline def readFragment_TKey_KeyTypeData[TKey /* <: KeyType[Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): KeyTypeData[TKey, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFragment")(fragmentInput.asInstanceOf[js.Any], fragmentRef.asInstanceOf[js.Any])).asInstanceOf[KeyTypeData[TKey, Any]]
  
  inline def withResolverContext[T](context: ResolverContext, cb: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("withResolverContext")(context.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type ArrayKeyType[TData] = js.Array[KeyType[js.Array[TData]] | Null]
  
  type ArrayKeyTypeData[TKey /* <: ArrayKeyType[TData] */, TData] = KeyTypeData[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: TKey[number] */ js.Any
    ], 
    Any
  ]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyType[?], TData] (val x: Self & KeyType[TData]) extends AnyVal {
      
      inline def setSpace$data(value: TData): Self = StObject.set(x, " $data", value.asInstanceOf[js.Any])
      
      inline def setSpace$dataUndefined: Self = StObject.set(x, " $data", js.undefined)
      
      inline def setSpace$fragmentSpreads(value: FragmentType): Self = StObject.set(x, " $fragmentSpreads", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyTypeData[TKey /* <: KeyType[TData] */, TData] = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<TKey>[' $data'] */ js.Any
  
  trait ResolverContext extends StObject {
    
    def getDataForResolverFragment(arg0: SingularReaderSelector, arg1: FragmentType): Data
  }
  object ResolverContext {
    
    inline def apply(getDataForResolverFragment: (SingularReaderSelector, FragmentType) => Data): ResolverContext = {
      val __obj = js.Dynamic.literal(getDataForResolverFragment = js.Any.fromFunction2(getDataForResolverFragment))
      __obj.asInstanceOf[ResolverContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolverContext] (val x: Self) extends AnyVal {
      
      inline def setGetDataForResolverFragment(value: (SingularReaderSelector, FragmentType) => Data): Self = StObject.set(x, "getDataForResolverFragment", js.Any.fromFunction2(value))
    }
  }
}
