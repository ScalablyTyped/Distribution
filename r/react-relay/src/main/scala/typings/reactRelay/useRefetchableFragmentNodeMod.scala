package typings.reactRelay

import typings.reactRelay.helpersMod.KeyType
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.std.Error
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefetchableFragmentNodeMod {
  
  @JSImport("react-relay/lib/relay-experimental/useRefetchableFragmentNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useRefetchableFragmentNode[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */](fragmentNode: ReaderFragment, parentFragmentRef: js.Any, componentDisplayName: String): // tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefetchableFragmentNode")(fragmentNode.asInstanceOf[js.Any], parentFragmentRef.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[// tslint:disable-next-line:no-unnecessary-generics
  ReturnTypeNode[TQuery, TKey, InternalOptions]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRelay.anon.Environment
    - typings.reactRelay.anon.RefetchVariables
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Environment(environment: typings.relayRuntime.relayStoreTypesMod.Environment, fragmentIdentifier: String): typings.reactRelay.anon.Environment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reset")
      __obj.asInstanceOf[typings.reactRelay.anon.Environment]
    }
    
    @scala.inline
    def RefetchVariables(refetchVariables: Variables): typings.reactRelay.anon.RefetchVariables = {
      val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("refetch")
      __obj.asInstanceOf[typings.reactRelay.anon.RefetchVariables]
    }
  }
  
  trait DebugIDandTypename extends StObject {
    
    var id: String
    
    var typename: String
  }
  object DebugIDandTypename {
    
    @scala.inline
    def apply(id: String, typename: String): DebugIDandTypename = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typename = typename.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugIDandTypename]
    }
    
    @scala.inline
    implicit class DebugIDandTypenameMutableBuilder[Self <: DebugIDandTypename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypename(value: String): Self = StObject.set(x, "typename", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalOptions
    extends StObject
       with Options {
    
    var __environment: js.UndefOr[Environment] = js.undefined
  }
  object InternalOptions {
    
    @scala.inline
    def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit class InternalOptionsMutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__environment(value: Environment): Self = StObject.set(x, "__environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__environmentUndefined: Self = StObject.set(x, "__environment", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
    }
  }
  
  type RefetchExact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any | Null], RefetchFnExact[TQuery, TOptions]]
  
  type RefetchExactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchExact[TQuery, TOptions]]
  
  type RefetchFn[TQuery /* <: OperationType */, TOptions] = RefetchFnExact[TQuery, TOptions]
  
  type RefetchFnBase[TVars, TOptions] = js.Function2[/* vars */ TVars, /* options */ js.UndefOr[TOptions], Disposable]
  
  type RefetchFnDynamic[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TOptions] = (RefetchInexactDynamicResponse[TQuery, TOptions]) & (RefetchExactDynamicResponse[TQuery, TOptions])
  
  type RefetchFnExact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[VariablesOf[TQuery], TOptions]
  
  type RefetchFnInexact[TQuery /* <: OperationType */, TOptions] = RefetchFnBase[Partial[VariablesOf[TQuery]], TOptions]
  
  type RefetchInexact[TQuery /* <: OperationType */, TOptions] = js.Function1[/* data */ js.UndefOr[js.Any], RefetchFnInexact[TQuery, TOptions]]
  
  type RefetchInexactDynamicResponse[TQuery /* <: OperationType */, TOptions] = ReturnType[RefetchInexact[TQuery, TOptions]]
  
  trait RefetchState extends StObject {
    
    var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
    
    var mirroredEnvironment: Environment
    
    var mirroredFragmentIdentifier: String
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.undefined
    
    var refetchEnvironment: js.UndefOr[Environment | Null] = js.undefined
    
    var refetchGeneration: Double
    
    var refetchVariables: js.UndefOr[Variables | Null] = js.undefined
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  }
  object RefetchState {
    
    @scala.inline
    def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String, refetchGeneration: Double): RefetchState = {
      val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any], refetchGeneration = refetchGeneration.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefetchState]
    }
    
    @scala.inline
    implicit class RefetchStateMutableBuilder[Self <: RefetchState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setMirroredEnvironment(value: Environment): Self = StObject.set(x, "mirroredEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirroredFragmentIdentifier(value: String): Self = StObject.set(x, "mirroredFragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRefetchEnvironment(value: Environment): Self = StObject.set(x, "refetchEnvironment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchEnvironmentNull: Self = StObject.set(x, "refetchEnvironment", null)
      
      @scala.inline
      def setRefetchEnvironmentUndefined: Self = StObject.set(x, "refetchEnvironment", js.undefined)
      
      @scala.inline
      def setRefetchGeneration(value: Double): Self = StObject.set(x, "refetchGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetchVariablesNull: Self = StObject.set(x, "refetchVariables", null)
      
      @scala.inline
      def setRefetchVariablesUndefined: Self = StObject.set(x, "refetchVariables", js.undefined)
      
      @scala.inline
      def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
    }
  }
  
  trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TOptions] extends StObject {
    
    def disableStoreUpdates(): Unit
    
    def enableStoreUpdates(): Unit
    
    var fragmentData: js.Any
    
    var fragmentRef: js.Any
    
    var refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  }
  object ReturnTypeNode {
    
    @scala.inline
    def apply[TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TOptions](
      disableStoreUpdates: () => Unit,
      enableStoreUpdates: () => Unit,
      fragmentData: js.Any,
      fragmentRef: js.Any,
      refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
    ): ReturnTypeNode[TQuery, TKey, TOptions] = {
      val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
    }
    
    @scala.inline
    implicit class ReturnTypeNodeMutableBuilder[Self <: ReturnTypeNode[?, ?, ?], TQuery /* <: OperationType */, TKey /* <: KeyType[js.Any] | Null */, TOptions] (val x: Self & (ReturnTypeNode[TQuery, TKey, TOptions])) extends AnyVal {
      
      @scala.inline
      def setDisableStoreUpdates(value: () => Unit): Self = StObject.set(x, "disableStoreUpdates", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableStoreUpdates(value: () => Unit): Self = StObject.set(x, "enableStoreUpdates", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFragmentData(value: js.Any): Self = StObject.set(x, "fragmentData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentRef(value: js.Any): Self = StObject.set(x, "fragmentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
}
