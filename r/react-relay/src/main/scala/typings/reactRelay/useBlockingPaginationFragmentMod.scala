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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBlockingPaginationFragmentMod {
  
  @JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  @JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, _]] = js.native
  @JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, KeyTypeData[TKey, _]] = js.native
  @JSImport("react-relay/lib/relay-experimental/useBlockingPaginationFragment", "useBlockingPaginationFragment")
  @js.native
  def useBlockingPaginationFragment[TQuery /* <: OperationType */, TKey /* <: KeyType[_] */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: Null, componentDisplayName: String): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, (KeyTypeData[TKey, _]) | Null] = js.native
  
  @js.native
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] extends StObject {
    
    var data: TFragmentData = js.native
    
    var hasNext: Boolean = js.native
    
    var hasPrevious: Boolean = js.native
    
    var loadNext: LoadMoreFn[TQuery] = js.native
    
    var loadPrevious: LoadMoreFn[TQuery] = js.native
    
    var refetch: RefetchFnDynamic[TQuery, TKey, Options] = js.native
  }
  object ReturnTypeNode {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData](
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
    
    @scala.inline
    implicit class ReturnTypeNodeMutableBuilder[Self <: ReturnTypeNode[_, _, _], TQuery /* <: OperationType */, TKey /* <: KeyType[_] | Null */, TFragmentData] (val x: Self with (ReturnTypeNode[TQuery, TKey, TFragmentData])) extends AnyVal {
      
      @scala.inline
      def setData(value: TFragmentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNext(value: Boolean): Self = StObject.set(x, "hasNext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPrevious(value: Boolean): Self = StObject.set(x, "hasPrevious", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadNext(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadNext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadPrevious(value: (/* count */ Double, /* options */ js.UndefOr[OnComplete[TQuery]]) => Disposable): Self = StObject.set(x, "loadPrevious", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefetch(value: RefetchFnDynamic[TQuery, TKey, Options]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
