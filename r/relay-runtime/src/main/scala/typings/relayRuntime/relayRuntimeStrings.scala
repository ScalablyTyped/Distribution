package typings.relayRuntime

import typings.relayRuntime.getPaginationVariablesMod.Direction
import typings.relayRuntime.readerNodeMod.RequiredFieldAction
import typings.relayRuntime.relayDeclarativeMutationConfigMod.MutationTypes
import typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeOperations
import typings.relayRuntime.relayModernQueryExecutorMod.ActiveState
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.FetchQueryFetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayRuntimeStrings {
  
  @js.native
  sealed trait ActorChange extends StObject
  inline def ActorChange: ActorChange = "ActorChange".asInstanceOf[ActorChange]
  
  @js.native
  sealed trait AliasedFragmentSpread extends StObject
  inline def AliasedFragmentSpread: AliasedFragmentSpread = "AliasedFragmentSpread".asInstanceOf[AliasedFragmentSpread]
  
  @js.native
  sealed trait AliasedInlineFragmentSpread extends StObject
  inline def AliasedInlineFragmentSpread: AliasedInlineFragmentSpread = "AliasedInlineFragmentSpread".asInstanceOf[AliasedInlineFragmentSpread]
  
  @js.native
  sealed trait CRITICAL extends StObject
  inline def CRITICAL: CRITICAL = "CRITICAL".asInstanceOf[CRITICAL]
  
  @js.native
  sealed trait ClientComponent extends StObject
  inline def ClientComponent: ClientComponent = "ClientComponent".asInstanceOf[ClientComponent]
  
  @js.native
  sealed trait ClientEdgeToClientObject extends StObject
  inline def ClientEdgeToClientObject: ClientEdgeToClientObject = "ClientEdgeToClientObject".asInstanceOf[ClientEdgeToClientObject]
  
  @js.native
  sealed trait ClientEdgeToServerObject extends StObject
  inline def ClientEdgeToServerObject: ClientEdgeToServerObject = "ClientEdgeToServerObject".asInstanceOf[ClientEdgeToServerObject]
  
  @js.native
  sealed trait ClientExtension extends StObject
  inline def ClientExtension: ClientExtension = "ClientExtension".asInstanceOf[ClientExtension]
  
  @js.native
  sealed trait Condition extends StObject
  inline def Condition: Condition = "Condition".asInstanceOf[Condition]
  
  @js.native
  sealed trait Connection extends StObject
  inline def Connection: Connection = "Connection".asInstanceOf[Connection]
  
  @js.native
  sealed trait Defer extends StObject
  inline def Defer: Defer = "Defer".asInstanceOf[Defer]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait FlightField extends StObject
  inline def FlightField: FlightField = "FlightField".asInstanceOf[FlightField]
  
  @js.native
  sealed trait Fragment extends StObject
  inline def Fragment: Fragment = "Fragment".asInstanceOf[Fragment]
  
  @js.native
  sealed trait FragmentRefs extends StObject
  inline def FragmentRefs: FragmentRefs = "FragmentRefs".asInstanceOf[FragmentRefs]
  
  @js.native
  sealed trait FragmentSpread extends StObject
  inline def FragmentSpread: FragmentSpread = "FragmentSpread".asInstanceOf[FragmentSpread]
  
  @js.native
  sealed trait InlineDataFragment extends StObject
  inline def InlineDataFragment: InlineDataFragment = "InlineDataFragment".asInstanceOf[InlineDataFragment]
  
  @js.native
  sealed trait InlineDataFragmentSpread extends StObject
  inline def InlineDataFragmentSpread: InlineDataFragmentSpread = "InlineDataFragmentSpread".asInstanceOf[InlineDataFragmentSpread]
  
  @js.native
  sealed trait InlineFragment extends StObject
  inline def InlineFragment: InlineFragment = "InlineFragment".asInstanceOf[InlineFragment]
  
  @js.native
  sealed trait LOG
    extends StObject
       with RequiredFieldAction
  inline def LOG: LOG = "LOG".asInstanceOf[LOG]
  
  @js.native
  sealed trait LinkedField extends StObject
  inline def LinkedField: LinkedField = "LinkedField".asInstanceOf[LinkedField]
  
  @js.native
  sealed trait LinkedHandle extends StObject
  inline def LinkedHandle: LinkedHandle = "LinkedHandle".asInstanceOf[LinkedHandle]
  
  @js.native
  sealed trait ListValue extends StObject
  inline def ListValue: ListValue = "ListValue".asInstanceOf[ListValue]
  
  @js.native
  sealed trait Literal extends StObject
  inline def Literal: Literal = "Literal".asInstanceOf[Literal]
  
  @js.native
  sealed trait LocalArgument extends StObject
  inline def LocalArgument: LocalArgument = "LocalArgument".asInstanceOf[LocalArgument]
  
  @js.native
  sealed trait ModuleImport extends StObject
  inline def ModuleImport: ModuleImport = "ModuleImport".asInstanceOf[ModuleImport]
  
  @js.native
  sealed trait NODE_DELETE
    extends StObject
       with MutationTypes
  inline def NODE_DELETE: NODE_DELETE = "NODE_DELETE".asInstanceOf[NODE_DELETE]
  
  @js.native
  sealed trait NONE
    extends StObject
       with RequiredFieldAction
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait ObjectValue extends StObject
  inline def ObjectValue: ObjectValue = "ObjectValue".asInstanceOf[ObjectValue]
  
  @js.native
  sealed trait Operation extends StObject
  inline def Operation: Operation = "Operation".asInstanceOf[Operation]
  
  @js.native
  sealed trait PageInfo extends StObject
  inline def PageInfo: PageInfo = "PageInfo".asInstanceOf[PageInfo]
  
  @js.native
  sealed trait RANGE_ADD
    extends StObject
       with MutationTypes
  inline def RANGE_ADD: RANGE_ADD = "RANGE_ADD".asInstanceOf[RANGE_ADD]
  
  @js.native
  sealed trait RANGE_DELETE
    extends StObject
       with MutationTypes
  inline def RANGE_DELETE: RANGE_DELETE = "RANGE_DELETE".asInstanceOf[RANGE_DELETE]
  
  @js.native
  sealed trait RelayLiveResolver extends StObject
  inline def RelayLiveResolver: RelayLiveResolver = "RelayLiveResolver".asInstanceOf[RelayLiveResolver]
  
  @js.native
  sealed trait RelayResolver extends StObject
  inline def RelayResolver: RelayResolver = "RelayResolver".asInstanceOf[RelayResolver]
  
  @js.native
  sealed trait Request extends StObject
  inline def Request: Request = "Request".asInstanceOf[Request]
  
  @js.native
  sealed trait RequiredField extends StObject
  inline def RequiredField: RequiredField = "RequiredField".asInstanceOf[RequiredField]
  
  @js.native
  sealed trait RootArgument extends StObject
  inline def RootArgument: RootArgument = "RootArgument".asInstanceOf[RootArgument]
  
  @js.native
  sealed trait ScalarField extends StObject
  inline def ScalarField: ScalarField = "ScalarField".asInstanceOf[ScalarField]
  
  @js.native
  sealed trait ScalarHandle extends StObject
  inline def ScalarHandle: ScalarHandle = "ScalarHandle".asInstanceOf[ScalarHandle]
  
  @js.native
  sealed trait SplitOperation extends StObject
  inline def SplitOperation: SplitOperation = "SplitOperation".asInstanceOf[SplitOperation]
  
  @js.native
  sealed trait Stream extends StObject
  inline def Stream: Stream = "Stream".asInstanceOf[Stream]
  
  @js.native
  sealed trait THROW
    extends StObject
       with RequiredFieldAction
  inline def THROW: THROW = "THROW".asInstanceOf[THROW]
  
  @js.native
  sealed trait TypeDiscriminator extends StObject
  inline def TypeDiscriminator: TypeDiscriminator = "TypeDiscriminator".asInstanceOf[TypeDiscriminator]
  
  @js.native
  sealed trait UpdatableQuery extends StObject
  inline def UpdatableQuery: UpdatableQuery = "UpdatableQuery".asInstanceOf[UpdatableQuery]
  
  @js.native
  sealed trait Variable extends StObject
  inline def Variable: Variable = "Variable".asInstanceOf[Variable]
  
  @js.native
  sealed trait WARNING extends StObject
  inline def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait aborted extends StObject
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait active
    extends StObject
       with ActiveState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait append
    extends StObject
       with RangeOperations
  inline def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait available extends StObject
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait backward
    extends StObject
       with Direction
  inline def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait clientMutationId extends StObject
  inline def clientMutationId: clientMutationId = "clientMutationId".asInstanceOf[clientMutationId]
  
  @js.native
  sealed trait complete extends StObject
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait cursor extends StObject
  inline def cursor: cursor = "cursor".asInstanceOf[cursor]
  
  @js.native
  sealed trait defer_ extends StObject
  inline def defer_ : defer_ = "defer".asInstanceOf[defer_]
  
  @js.native
  sealed trait edges extends StObject
  inline def edges: edges = "edges".asInstanceOf[edges]
  
  @js.native
  sealed trait endCursor extends StObject
  inline def endCursor: endCursor = "endCursor".asInstanceOf[endCursor]
  
  @js.native
  sealed trait entrypointDotrootDotconsume extends StObject
  inline def entrypointDotrootDotconsume: entrypointDotrootDotconsume = "entrypoint.root.consume".asInstanceOf[entrypointDotrootDotconsume]
  
  @js.native
  sealed trait error_ extends StObject
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait executeDotasyncDotmodule extends StObject
  inline def executeDotasyncDotmodule: executeDotasyncDotmodule = "execute.async.module".asInstanceOf[executeDotasyncDotmodule]
  
  @js.native
  sealed trait executeDotcomplete extends StObject
  inline def executeDotcomplete: executeDotcomplete = "execute.complete".asInstanceOf[executeDotcomplete]
  
  @js.native
  sealed trait executeDoterror extends StObject
  inline def executeDoterror: executeDoterror = "execute.error".asInstanceOf[executeDoterror]
  
  @js.native
  sealed trait executeDotflightDotpayload_deserialize extends StObject
  inline def executeDotflightDotpayload_deserialize: executeDotflightDotpayload_deserialize = "execute.flight.payload_deserialize".asInstanceOf[executeDotflightDotpayload_deserialize]
  
  @js.native
  sealed trait executeDotnext extends StObject
  inline def executeDotnext: executeDotnext = "execute.next".asInstanceOf[executeDotnext]
  
  @js.native
  sealed trait executeDotstart extends StObject
  inline def executeDotstart: executeDotstart = "execute.start".asInstanceOf[executeDotstart]
  
  @js.native
  sealed trait forward
    extends StObject
       with Direction
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait full
    extends StObject
       with RenderPolicy
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait hasNextPage extends StObject
  inline def hasNextPage: hasNextPage = "hasNextPage".asInstanceOf[hasNextPage]
  
  @js.native
  sealed trait hasPreviousPage extends StObject
  inline def hasPreviousPage: hasPreviousPage = "hasPreviousPage".asInstanceOf[hasPreviousPage]
  
  @js.native
  sealed trait inactive
    extends StObject
       with ActiveState
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait linked extends StObject
  inline def linked: linked = "linked".asInstanceOf[linked]
  
  @js.native
  sealed trait missing extends StObject
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait missing_fieldDotlog extends StObject
  inline def missing_fieldDotlog: missing_fieldDotlog = "missing_field.log".asInstanceOf[missing_fieldDotlog]
  
  @js.native
  sealed trait missing_fieldDotthrow extends StObject
  inline def missing_fieldDotthrow: missing_fieldDotthrow = "missing_field.throw".asInstanceOf[missing_fieldDotthrow]
  
  @js.native
  sealed trait `network-only`
    extends StObject
       with FetchPolicy
       with FetchQueryFetchPolicy
  inline def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @js.native
  sealed trait networkDotcomplete extends StObject
  inline def networkDotcomplete: networkDotcomplete = "network.complete".asInstanceOf[networkDotcomplete]
  
  @js.native
  sealed trait networkDoterror extends StObject
  inline def networkDoterror: networkDoterror = "network.error".asInstanceOf[networkDoterror]
  
  @js.native
  sealed trait networkDotinfo extends StObject
  inline def networkDotinfo: networkDotinfo = "network.info".asInstanceOf[networkDotinfo]
  
  @js.native
  sealed trait networkDotnext extends StObject
  inline def networkDotnext: networkDotnext = "network.next".asInstanceOf[networkDotnext]
  
  @js.native
  sealed trait networkDotstart extends StObject
  inline def networkDotstart: networkDotstart = "network.start".asInstanceOf[networkDotstart]
  
  @js.native
  sealed trait networkDotunsubscribe extends StObject
  inline def networkDotunsubscribe: networkDotunsubscribe = "network.unsubscribe".asInstanceOf[networkDotunsubscribe]
  
  @js.native
  sealed trait next extends StObject
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait node extends StObject
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait pageInfo_ extends StObject
  inline def pageInfo_ : pageInfo_ = "pageInfo".asInstanceOf[pageInfo_]
  
  @js.native
  sealed trait partial
    extends StObject
       with RenderPolicy
  inline def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait pluralLinked extends StObject
  inline def pluralLinked: pluralLinked = "pluralLinked".asInstanceOf[pluralLinked]
  
  @js.native
  sealed trait prepend
    extends StObject
       with RangeOperations
  inline def prepend: prepend = "prepend".asInstanceOf[prepend]
  
  @js.native
  sealed trait queryresourceDotfetch extends StObject
  inline def queryresourceDotfetch: queryresourceDotfetch = "queryresource.fetch".asInstanceOf[queryresourceDotfetch]
  
  @js.native
  sealed trait queryresourceDotretain extends StObject
  inline def queryresourceDotretain: queryresourceDotretain = "queryresource.retain".asInstanceOf[queryresourceDotretain]
  
  @js.native
  sealed trait relay_resolverDoterror extends StObject
  inline def relay_resolverDoterror: relay_resolverDoterror = "relay_resolver.error".asInstanceOf[relay_resolverDoterror]
  
  @js.native
  sealed trait scalar extends StObject
  inline def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @js.native
  sealed trait stale extends StObject
  inline def stale: stale = "stale".asInstanceOf[stale]
  
  @js.native
  sealed trait startCursor extends StObject
  inline def startCursor: startCursor = "startCursor".asInstanceOf[startCursor]
  
  @js.native
  sealed trait `store-and-network`
    extends StObject
       with FetchPolicy
  inline def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @js.native
  sealed trait `store-only`
    extends StObject
       with FetchPolicy
  inline def `store-only`: `store-only` = "store-only".asInstanceOf[`store-only`]
  
  @js.native
  sealed trait `store-or-network`
    extends StObject
       with FetchPolicy
       with FetchQueryFetchPolicy
  inline def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
  
  @js.native
  sealed trait storeDotgc extends StObject
  inline def storeDotgc: storeDotgc = "store.gc".asInstanceOf[storeDotgc]
  
  @js.native
  sealed trait storeDotnotifyDotcomplete extends StObject
  inline def storeDotnotifyDotcomplete: storeDotnotifyDotcomplete = "store.notify.complete".asInstanceOf[storeDotnotifyDotcomplete]
  
  @js.native
  sealed trait storeDotnotifyDotstart extends StObject
  inline def storeDotnotifyDotstart: storeDotnotifyDotstart = "store.notify.start".asInstanceOf[storeDotnotifyDotstart]
  
  @js.native
  sealed trait storeDotnotifyDotsubscription extends StObject
  inline def storeDotnotifyDotsubscription: storeDotnotifyDotsubscription = "store.notify.subscription".asInstanceOf[storeDotnotifyDotsubscription]
  
  @js.native
  sealed trait storeDotpublish extends StObject
  inline def storeDotpublish: storeDotpublish = "store.publish".asInstanceOf[storeDotpublish]
  
  @js.native
  sealed trait storeDotrestore extends StObject
  inline def storeDotrestore: storeDotrestore = "store.restore".asInstanceOf[storeDotrestore]
  
  @js.native
  sealed trait storeDotsnapshot extends StObject
  inline def storeDotsnapshot: storeDotsnapshot = "store.snapshot".asInstanceOf[storeDotsnapshot]
  
  @js.native
  sealed trait stream_ extends StObject
  inline def stream_ : stream_ = "stream".asInstanceOf[stream_]
  
  @js.native
  sealed trait suspenseDotfragment extends StObject
  inline def suspenseDotfragment: suspenseDotfragment = "suspense.fragment".asInstanceOf[suspenseDotfragment]
  
  @js.native
  sealed trait suspenseDotquery extends StObject
  inline def suspenseDotquery: suspenseDotquery = "suspense.query".asInstanceOf[suspenseDotquery]
}
