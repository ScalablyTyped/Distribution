package typings.reactRelay

import typings.reactRelay.anon.OnComplete
import typings.reactRelay.helpersMod.KeyType
import typings.reactRelay.helpersMod.KeyTypeData
import typings.reactRelay.useLoadMoreFunctionMod.LoadMoreFn
import typings.reactRelay.useRefetchableFragmentNodeMod.Options
import typings.reactRelay.useRefetchableFragmentNodeMod.RefetchFnDynamic
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBlockingPaginationFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any]).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  inline def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]]]
  inline def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, js.Any]]]
  inline def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useBlockingPaginationFragment")(fragmentInput.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, js.Any]) | Null]]
  
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TFragmentData] extends StObject {
    
    var data: TFragmentData
    
    var hasNext: Boolean
    
    var hasPrevious: Boolean
    
    var loadNext: LoadMoreFn[TQuery]
    
    var loadPrevious: LoadMoreFn[TQuery]
    
    var refetch: RefetchFnDynamic[TQuery, TKey, Options]
  }
  object ReturnTypeNode {
    
    inline def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TFragmentData](
      data: TFragmentData,
      hasNext: Boolean,
      hasPrevious: Boolean,
      loadNext: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
      loadPrevious: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable,
      refetch: RefetchFnDynamic[TQuery, TKey, Options]
    ): ReturnTypeNode[TQuery, TKey, TFragmentData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any], loadNext = js.Any.fromFunction2(loadNext), loadPrevious = js.Any.fromFunction2(loadPrevious), refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TFragmentData]]
    }
    
    extension [Self <: ReturnTypeNode[?, ?, ?], TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TFragmentData](x: Self & (ReturnTypeNode[TQuery, TKey, TFragmentData])) {
      
      inline def setData(value: TFragmentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
      
      inline def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      
      inline def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadNext", js.Any.fromFunction2(value))
      
      inline def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadPrevious", js.Any.fromFunction2(value))
      
      inline def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
