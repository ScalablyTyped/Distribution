package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_CacheConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CEnvironment[TEnvironment, TFragment, TGraphQLTaggedNode, TReaderNode, TNormalizationNode, TRequest, TPayload, TReaderSelector] extends js.Object {
  def check(selector: CNormalizationSelector[TNormalizationNode]): Boolean
  def execute(config: Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest]): RelayObservable[TPayload]
  def lookup(selector: CReaderSelector[TReaderNode]): CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]]
  def retain(selector: CNormalizationSelector[TNormalizationNode]): Disposable
  def subscribe(
    snapshot: CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]],
    callback: js.Function1[
      /* snapshot */ CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]], 
      Unit
    ]
  ): Disposable
}

object CEnvironment {
  @scala.inline
  def apply[TEnvironment, TFragment, TGraphQLTaggedNode, TReaderNode, TNormalizationNode, TRequest, TPayload, TReaderSelector](
    check: CNormalizationSelector[TNormalizationNode] => Boolean,
    execute: Anon_CacheConfig[TReaderNode, TNormalizationNode, TRequest] => RelayObservable[TPayload],
    lookup: CReaderSelector[TReaderNode] => CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]],
    retain: CNormalizationSelector[TNormalizationNode] => Disposable,
    subscribe: (CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]], js.Function1[
      /* snapshot */ CSnapshot[TReaderNode, COperationDescriptor[TReaderNode, TNormalizationNode, TRequest]], 
      Unit
    ]) => Disposable
  ): CEnvironment[
    TEnvironment, 
    TFragment, 
    TGraphQLTaggedNode, 
    TReaderNode, 
    TNormalizationNode, 
    TRequest, 
    TPayload, 
    TReaderSelector
  ] = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), execute = js.Any.fromFunction1(execute), lookup = js.Any.fromFunction1(lookup), retain = js.Any.fromFunction1(retain), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[CEnvironment[
  TEnvironment, 
  TFragment, 
  TGraphQLTaggedNode, 
  TReaderNode, 
  TNormalizationNode, 
  TRequest, 
  TPayload, 
  TReaderSelector]]
  }
}

