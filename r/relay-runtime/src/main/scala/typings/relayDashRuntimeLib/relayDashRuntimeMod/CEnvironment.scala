package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CEnvironment[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation, TPayload] extends js.Object {
  var unstable_internal: CUnstableEnvironmentCore[TEnvironment, TFragment, TGraphQLTaggedNode, TNode, TOperation]
  /**
    * Read the results of a selector from in-memory records in the store.
    */
  def lookup(selector: CSelector[TNode]): CSnapshot[TNode]
  /**
    * Ensure that all the records necessary to fulfill the given selector are
    * retained in-memory. The records will not be eligible for garbage collection
    * until the returned reference is disposed.
    *
    * Note: This is a no-op in the classic core.
    */
  def retain(selector: CSelector[TNode]): Disposable
  /**
    * Send a query to the server with request/response semantics: the query will
    * either complete successfully (calling `onNext` and `onCompleted`) or fail
    * (calling `onError`).
    *
    * Note: Most applications should use `streamQuery` in order to
    * optionally receive updated information over time, should that feature be
    * supported by the network/server. A good rule of thumb is to use this method
    * if you would otherwise immediately dispose the `streamQuery()`
    * after receving the first `onNext` result.
    */
  def sendQuery(config: relayDashRuntimeLib.Anon_OnCompleted[TNode, TOperation, TPayload]): Disposable
  /**
    * Send a query to the server with request/subscription semantics: one or more
    * responses may be returned (via `onNext`) over time followed by either
    * the request completing (`onCompleted`) or an error (`onError`).
    *
    * Networks/servers that support subscriptions may choose to hold the
    * subscription open indefinitely such that `onCompleted` is not called.
    */
  def streamQuery(config: relayDashRuntimeLib.Anon_OnCompleted[TNode, TOperation, TPayload]): Disposable
  /**
    * Subscribe to changes to the results of a selector. The callback is called
    * when data has been committed to the store that would cause the results of
    * the snapshot's selector to change.
    */
  def subscribe(snapshot: CSnapshot[TNode], callback: js.Function1[/* snapshot */ CSnapshot[TNode], scala.Unit]): Disposable
}

