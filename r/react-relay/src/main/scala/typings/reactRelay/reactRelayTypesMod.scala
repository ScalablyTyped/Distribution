package typings.reactRelay

import typings.reactRelay.reactRelayStrings.`network-only`
import typings.reactRelay.reactRelayStrings.`store-or-network`
import typings.relayRuntime.libNetworkRelayObservableMod.Observer
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.relayRuntime.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRelayTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends relay-runtime.relay-runtime._RefType<infer U> ? relay-runtime.relay-runtime._FragmentRefs<U> : T extends std.ReadonlyArray<relay-runtime.relay-runtime._RefType<infer U>> ? std.ReadonlyArray<relay-runtime.relay-runtime._FragmentRefs<U>> : T
    }}}
    */
  @js.native
  trait FragmentOrRegularProp[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: react-relay.react-relay/ReactRelayTypes.FragmentOrRegularProp<T[K]>}
    }}}
    */
  @js.native
  trait MappedFragmentProps[T] extends StObject
  
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit])
  
  trait RefetchOptions extends StObject {
    
    var fetchPolicy: js.UndefOr[`store-or-network` | `network-only`] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object RefetchOptions {
    
    inline def apply(): RefetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefetchOptions]
    }
    
    extension [Self <: RefetchOptions](x: Self) {
      
      inline def setFetchPolicy(value: `store-or-network` | `network-only`): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait RelayPaginationProp extends StObject {
    
    val environment: Environment = js.native
    
    def hasMore(): Boolean = js.native
    
    def isLoading(): Boolean = js.native
    
    def loadMore(pageSize: Double): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: Null, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: Unit, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
    def loadMore(pageSize: Double, observerOrCallback: ObserverOrCallback, options: RefetchOptions): js.UndefOr[Disposable | Null] = js.native
    
    var refetch: Unit = js.native
    
    def refetchConnection(totalCount: Double): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: Null, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: Unit, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback): js.UndefOr[Disposable | Null] = js.native
    def refetchConnection(totalCount: Double, observerOrCallback: ObserverOrCallback, refetchVariables: Variables): js.UndefOr[Disposable | Null] = js.native
  }
  
  trait RelayProp extends StObject {
    
    var environment: Environment
    
    // ensures no RelayRefetchProp is used with a fragment container
    var hasMore: Unit
    
    var refetch: Unit
  }
  object RelayProp {
    
    inline def apply(environment: Environment, hasMore: Unit, refetch: Unit): RelayProp = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayProp]
    }
    
    extension [Self <: RelayProp](x: Self) {
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setHasMore(value: Unit): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setRefetch(value: Unit): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayRefetchProp extends StObject {
    
    var environment: Environment = js.native
    
    var hasMore: Unit = js.native
    
    def refetch(refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables]): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback
    ): Disposable = js.native
    def refetch(
      refetchVariables: js.Function1[/* fragmentVariables */ Variables, Variables],
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Null, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Null,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Unit, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Unit,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: Null,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: Unit,
      options: RefetchOptions
    ): Disposable = js.native
    def refetch(refetchVariables: Variables, renderVariables: Variables, observerOrCallback: ObserverOrCallback): Disposable = js.native
    def refetch(
      refetchVariables: Variables,
      renderVariables: Variables,
      observerOrCallback: ObserverOrCallback,
      options: RefetchOptions
    ): Disposable = js.native
  }
}
