package typings.relayRuntime

import typings.relayRuntime.relayDeclarativeMutationConfigMod.MutationTypes
import typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeOperations
import typings.relayRuntime.relayRecordStateMod.RecordState
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.FetchQueryFetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayRuntimeStrings {
  
  @js.native
  sealed trait CRITICAL extends StObject
  @scala.inline
  def CRITICAL: CRITICAL = "CRITICAL".asInstanceOf[CRITICAL]
  
  @js.native
  sealed trait ClientExtension extends StObject
  @scala.inline
  def ClientExtension: ClientExtension = "ClientExtension".asInstanceOf[ClientExtension]
  
  @js.native
  sealed trait Condition extends StObject
  @scala.inline
  def Condition: Condition = "Condition".asInstanceOf[Condition]
  
  @js.native
  sealed trait Connection extends StObject
  @scala.inline
  def Connection: Connection = "Connection".asInstanceOf[Connection]
  
  @js.native
  sealed trait Defer extends StObject
  @scala.inline
  def Defer: Defer = "Defer".asInstanceOf[Defer]
  
  @js.native
  sealed trait ERROR extends StObject
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EXISTENT
    extends StObject
       with RecordState
  @scala.inline
  def EXISTENT: EXISTENT = "EXISTENT".asInstanceOf[EXISTENT]
  
  @js.native
  sealed trait Fragment extends StObject
  @scala.inline
  def Fragment: Fragment = "Fragment".asInstanceOf[Fragment]
  
  @js.native
  sealed trait FragmentRefs extends StObject
  @scala.inline
  def FragmentRefs: FragmentRefs = "FragmentRefs".asInstanceOf[FragmentRefs]
  
  @js.native
  sealed trait FragmentSpread extends StObject
  @scala.inline
  def FragmentSpread: FragmentSpread = "FragmentSpread".asInstanceOf[FragmentSpread]
  
  @js.native
  sealed trait InlineDataFragment extends StObject
  @scala.inline
  def InlineDataFragment: InlineDataFragment = "InlineDataFragment".asInstanceOf[InlineDataFragment]
  
  @js.native
  sealed trait InlineDataFragmentSpread extends StObject
  @scala.inline
  def InlineDataFragmentSpread: InlineDataFragmentSpread = "InlineDataFragmentSpread".asInstanceOf[InlineDataFragmentSpread]
  
  @js.native
  sealed trait InlineFragment extends StObject
  @scala.inline
  def InlineFragment: InlineFragment = "InlineFragment".asInstanceOf[InlineFragment]
  
  @js.native
  sealed trait LinkedField extends StObject
  @scala.inline
  def LinkedField: LinkedField = "LinkedField".asInstanceOf[LinkedField]
  
  @js.native
  sealed trait LinkedHandle extends StObject
  @scala.inline
  def LinkedHandle: LinkedHandle = "LinkedHandle".asInstanceOf[LinkedHandle]
  
  @js.native
  sealed trait ListValue extends StObject
  @scala.inline
  def ListValue: ListValue = "ListValue".asInstanceOf[ListValue]
  
  @js.native
  sealed trait Literal extends StObject
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  
  @js.native
  sealed trait LocalArgument extends StObject
  @scala.inline
  def LocalArgument: LocalArgument = "LocalArgument".asInstanceOf[LocalArgument]
  
  @js.native
  sealed trait ModuleImport extends StObject
  @scala.inline
  def ModuleImport: ModuleImport = "ModuleImport".asInstanceOf[ModuleImport]
  
  @js.native
  sealed trait NODE_DELETE
    extends StObject
       with MutationTypes
  @scala.inline
  def NODE_DELETE: NODE_DELETE = "NODE_DELETE".asInstanceOf[NODE_DELETE]
  
  @js.native
  sealed trait NONEXISTENT
    extends StObject
       with RecordState
  @scala.inline
  def NONEXISTENT: NONEXISTENT = "NONEXISTENT".asInstanceOf[NONEXISTENT]
  
  @js.native
  sealed trait ObjectValue extends StObject
  @scala.inline
  def ObjectValue: ObjectValue = "ObjectValue".asInstanceOf[ObjectValue]
  
  @js.native
  sealed trait Operation extends StObject
  @scala.inline
  def Operation: Operation = "Operation".asInstanceOf[Operation]
  
  @js.native
  sealed trait PageInfo extends StObject
  @scala.inline
  def PageInfo: PageInfo = "PageInfo".asInstanceOf[PageInfo]
  
  @js.native
  sealed trait RANGE_ADD
    extends StObject
       with MutationTypes
  @scala.inline
  def RANGE_ADD: RANGE_ADD = "RANGE_ADD".asInstanceOf[RANGE_ADD]
  
  @js.native
  sealed trait RANGE_DELETE
    extends StObject
       with MutationTypes
  @scala.inline
  def RANGE_DELETE: RANGE_DELETE = "RANGE_DELETE".asInstanceOf[RANGE_DELETE]
  
  @js.native
  sealed trait Request extends StObject
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  
  @js.native
  sealed trait RootArgument extends StObject
  @scala.inline
  def RootArgument: RootArgument = "RootArgument".asInstanceOf[RootArgument]
  
  @js.native
  sealed trait ScalarField extends StObject
  @scala.inline
  def ScalarField: ScalarField = "ScalarField".asInstanceOf[ScalarField]
  
  @js.native
  sealed trait ScalarHandle extends StObject
  @scala.inline
  def ScalarHandle: ScalarHandle = "ScalarHandle".asInstanceOf[ScalarHandle]
  
  @js.native
  sealed trait SplitOperation extends StObject
  @scala.inline
  def SplitOperation: SplitOperation = "SplitOperation".asInstanceOf[SplitOperation]
  
  @js.native
  sealed trait Stream extends StObject
  @scala.inline
  def Stream: Stream = "Stream".asInstanceOf[Stream]
  
  @js.native
  sealed trait TypeDiscriminator extends StObject
  @scala.inline
  def TypeDiscriminator: TypeDiscriminator = "TypeDiscriminator".asInstanceOf[TypeDiscriminator]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with RecordState
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait Variable extends StObject
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  
  @js.native
  sealed trait WARNING extends StObject
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait aborted extends StObject
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait append
    extends StObject
       with RangeOperations
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  
  @js.native
  sealed trait available extends StObject
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait clientMutationId extends StObject
  @scala.inline
  def clientMutationId: clientMutationId = "clientMutationId".asInstanceOf[clientMutationId]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait cursor extends StObject
  @scala.inline
  def cursor: cursor = "cursor".asInstanceOf[cursor]
  
  @js.native
  sealed trait defer_ extends StObject
  @scala.inline
  def defer_ : defer_ = "defer".asInstanceOf[defer_]
  
  @js.native
  sealed trait edges extends StObject
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  
  @js.native
  sealed trait endCursor extends StObject
  @scala.inline
  def endCursor: endCursor = "endCursor".asInstanceOf[endCursor]
  
  @js.native
  sealed trait entrypointDotrootDotconsume extends StObject
  @scala.inline
  def entrypointDotrootDotconsume: entrypointDotrootDotconsume = "entrypoint.root.consume".asInstanceOf[entrypointDotrootDotconsume]
  
  @js.native
  sealed trait error_ extends StObject
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait executeDotcomplete extends StObject
  @scala.inline
  def executeDotcomplete: executeDotcomplete = "execute.complete".asInstanceOf[executeDotcomplete]
  
  @js.native
  sealed trait executeDoterror extends StObject
  @scala.inline
  def executeDoterror: executeDoterror = "execute.error".asInstanceOf[executeDoterror]
  
  @js.native
  sealed trait executeDotinfo extends StObject
  @scala.inline
  def executeDotinfo: executeDotinfo = "execute.info".asInstanceOf[executeDotinfo]
  
  @js.native
  sealed trait executeDotnext extends StObject
  @scala.inline
  def executeDotnext: executeDotnext = "execute.next".asInstanceOf[executeDotnext]
  
  @js.native
  sealed trait executeDotstart extends StObject
  @scala.inline
  def executeDotstart: executeDotstart = "execute.start".asInstanceOf[executeDotstart]
  
  @js.native
  sealed trait executeDotunsubscribe extends StObject
  @scala.inline
  def executeDotunsubscribe: executeDotunsubscribe = "execute.unsubscribe".asInstanceOf[executeDotunsubscribe]
  
  @js.native
  sealed trait full
    extends StObject
       with RenderPolicy
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait hasNextPage extends StObject
  @scala.inline
  def hasNextPage: hasNextPage = "hasNextPage".asInstanceOf[hasNextPage]
  
  @js.native
  sealed trait hasPreviousPage extends StObject
  @scala.inline
  def hasPreviousPage: hasPreviousPage = "hasPreviousPage".asInstanceOf[hasPreviousPage]
  
  @js.native
  sealed trait linked extends StObject
  @scala.inline
  def linked: linked = "linked".asInstanceOf[linked]
  
  @js.native
  sealed trait missing extends StObject
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait missing_fieldDotlog extends StObject
  @scala.inline
  def missing_fieldDotlog: missing_fieldDotlog = "missing_field.log".asInstanceOf[missing_fieldDotlog]
  
  @js.native
  sealed trait missing_fieldDotthrow extends StObject
  @scala.inline
  def missing_fieldDotthrow: missing_fieldDotthrow = "missing_field.throw".asInstanceOf[missing_fieldDotthrow]
  
  @js.native
  sealed trait `network-only`
    extends StObject
       with FetchPolicy
       with FetchQueryFetchPolicy
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  
  @js.native
  sealed trait node extends StObject
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait pageInfo_ extends StObject
  @scala.inline
  def pageInfo_ : pageInfo_ = "pageInfo".asInstanceOf[pageInfo_]
  
  @js.native
  sealed trait partial
    extends StObject
       with RenderPolicy
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait pluralLinked extends StObject
  @scala.inline
  def pluralLinked: pluralLinked = "pluralLinked".asInstanceOf[pluralLinked]
  
  @js.native
  sealed trait prepend
    extends StObject
       with RangeOperations
  @scala.inline
  def prepend: prepend = "prepend".asInstanceOf[prepend]
  
  @js.native
  sealed trait queryresourceDotfetch extends StObject
  @scala.inline
  def queryresourceDotfetch: queryresourceDotfetch = "queryresource.fetch".asInstanceOf[queryresourceDotfetch]
  
  @js.native
  sealed trait queryresourceDotretain extends StObject
  @scala.inline
  def queryresourceDotretain: queryresourceDotretain = "queryresource.retain".asInstanceOf[queryresourceDotretain]
  
  @js.native
  sealed trait scalar extends StObject
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @js.native
  sealed trait stale extends StObject
  @scala.inline
  def stale: stale = "stale".asInstanceOf[stale]
  
  @js.native
  sealed trait startCursor extends StObject
  @scala.inline
  def startCursor: startCursor = "startCursor".asInstanceOf[startCursor]
  
  @js.native
  sealed trait `store-and-network`
    extends StObject
       with FetchPolicy
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  
  @js.native
  sealed trait `store-only`
    extends StObject
       with FetchPolicy
  @scala.inline
  def `store-only`: `store-only` = "store-only".asInstanceOf[`store-only`]
  
  @js.native
  sealed trait `store-or-network`
    extends StObject
       with FetchPolicy
       with FetchQueryFetchPolicy
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
  
  @js.native
  sealed trait storeDotgc extends StObject
  @scala.inline
  def storeDotgc: storeDotgc = "store.gc".asInstanceOf[storeDotgc]
  
  @js.native
  sealed trait storeDotnotifyDotcomplete extends StObject
  @scala.inline
  def storeDotnotifyDotcomplete: storeDotnotifyDotcomplete = "store.notify.complete".asInstanceOf[storeDotnotifyDotcomplete]
  
  @js.native
  sealed trait storeDotnotifyDotstart extends StObject
  @scala.inline
  def storeDotnotifyDotstart: storeDotnotifyDotstart = "store.notify.start".asInstanceOf[storeDotnotifyDotstart]
  
  @js.native
  sealed trait storeDotpublish extends StObject
  @scala.inline
  def storeDotpublish: storeDotpublish = "store.publish".asInstanceOf[storeDotpublish]
  
  @js.native
  sealed trait storeDotrestore extends StObject
  @scala.inline
  def storeDotrestore: storeDotrestore = "store.restore".asInstanceOf[storeDotrestore]
  
  @js.native
  sealed trait storeDotsnapshot extends StObject
  @scala.inline
  def storeDotsnapshot: storeDotsnapshot = "store.snapshot".asInstanceOf[storeDotsnapshot]
  
  @js.native
  sealed trait stream_ extends StObject
  @scala.inline
  def stream_ : stream_ = "stream".asInstanceOf[stream_]
}
