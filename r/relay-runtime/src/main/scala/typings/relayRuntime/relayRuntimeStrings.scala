package typings.relayRuntime

import typings.relayRuntime.relayDeclarativeMutationConfigMod.MutationTypes
import typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeOperations
import typings.relayRuntime.relayRecordStateMod.RecordState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object relayRuntimeStrings {
  @js.native
  sealed trait CRITICAL extends js.Object
  
  @js.native
  sealed trait ClientExtension extends js.Object
  
  @js.native
  sealed trait Condition extends js.Object
  
  @js.native
  sealed trait Connection extends js.Object
  
  @js.native
  sealed trait Defer extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait EXISTENT extends RecordState
  
  @js.native
  sealed trait Fragment extends js.Object
  
  @js.native
  sealed trait FragmentRefs extends js.Object
  
  @js.native
  sealed trait FragmentSpread extends js.Object
  
  @js.native
  sealed trait InlineDataFragment extends js.Object
  
  @js.native
  sealed trait InlineDataFragmentSpread extends js.Object
  
  @js.native
  sealed trait InlineFragment extends js.Object
  
  @js.native
  sealed trait LinkedField extends js.Object
  
  @js.native
  sealed trait LinkedHandle extends js.Object
  
  @js.native
  sealed trait ListValue extends js.Object
  
  @js.native
  sealed trait Literal extends js.Object
  
  @js.native
  sealed trait LocalArgument extends js.Object
  
  @js.native
  sealed trait ModuleImport extends js.Object
  
  @js.native
  sealed trait NODE_DELETE extends MutationTypes
  
  @js.native
  sealed trait NONEXISTENT extends RecordState
  
  @js.native
  sealed trait ObjectValue extends js.Object
  
  @js.native
  sealed trait Operation extends js.Object
  
  @js.native
  sealed trait PageInfo extends js.Object
  
  @js.native
  sealed trait RANGE_ADD extends MutationTypes
  
  @js.native
  sealed trait RANGE_DELETE extends MutationTypes
  
  @js.native
  sealed trait Request extends js.Object
  
  @js.native
  sealed trait RootArgument extends js.Object
  
  @js.native
  sealed trait ScalarField extends js.Object
  
  @js.native
  sealed trait ScalarHandle extends js.Object
  
  @js.native
  sealed trait SplitOperation extends js.Object
  
  @js.native
  sealed trait Stream extends js.Object
  
  @js.native
  sealed trait TypeDiscriminator extends js.Object
  
  @js.native
  sealed trait UNKNOWN extends RecordState
  
  @js.native
  sealed trait Variable extends js.Object
  
  @js.native
  sealed trait WARNING extends js.Object
  
  @js.native
  sealed trait aborted extends js.Object
  
  @js.native
  sealed trait append extends RangeOperations
  
  @js.native
  sealed trait available extends js.Object
  
  @js.native
  sealed trait clientMutationId extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait cursor extends js.Object
  
  @js.native
  sealed trait defer_ extends js.Object
  
  @js.native
  sealed trait edges extends js.Object
  
  @js.native
  sealed trait endCursor extends js.Object
  
  @js.native
  sealed trait error_ extends js.Object
  
  @js.native
  sealed trait executeDotcomplete extends js.Object
  
  @js.native
  sealed trait executeDoterror extends js.Object
  
  @js.native
  sealed trait executeDotinfo extends js.Object
  
  @js.native
  sealed trait executeDotnext extends js.Object
  
  @js.native
  sealed trait executeDotstart extends js.Object
  
  @js.native
  sealed trait executeDotunsubscribe extends js.Object
  
  @js.native
  sealed trait hasNextPage extends js.Object
  
  @js.native
  sealed trait hasPreviousPage extends js.Object
  
  @js.native
  sealed trait linked extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait pageInfo_ extends js.Object
  
  @js.native
  sealed trait pluralLinked extends js.Object
  
  @js.native
  sealed trait prepend extends RangeOperations
  
  @js.native
  sealed trait queryresourceDotfetch extends js.Object
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait stale extends js.Object
  
  @js.native
  sealed trait startCursor extends js.Object
  
  @js.native
  sealed trait stream_ extends js.Object
  
  @scala.inline
  def CRITICAL: CRITICAL = "CRITICAL".asInstanceOf[CRITICAL]
  @scala.inline
  def ClientExtension: ClientExtension = "ClientExtension".asInstanceOf[ClientExtension]
  @scala.inline
  def Condition: Condition = "Condition".asInstanceOf[Condition]
  @scala.inline
  def Connection: Connection = "Connection".asInstanceOf[Connection]
  @scala.inline
  def Defer: Defer = "Defer".asInstanceOf[Defer]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def EXISTENT: EXISTENT = "EXISTENT".asInstanceOf[EXISTENT]
  @scala.inline
  def Fragment: Fragment = "Fragment".asInstanceOf[Fragment]
  @scala.inline
  def FragmentRefs: FragmentRefs = "FragmentRefs".asInstanceOf[FragmentRefs]
  @scala.inline
  def FragmentSpread: FragmentSpread = "FragmentSpread".asInstanceOf[FragmentSpread]
  @scala.inline
  def InlineDataFragment: InlineDataFragment = "InlineDataFragment".asInstanceOf[InlineDataFragment]
  @scala.inline
  def InlineDataFragmentSpread: InlineDataFragmentSpread = "InlineDataFragmentSpread".asInstanceOf[InlineDataFragmentSpread]
  @scala.inline
  def InlineFragment: InlineFragment = "InlineFragment".asInstanceOf[InlineFragment]
  @scala.inline
  def LinkedField: LinkedField = "LinkedField".asInstanceOf[LinkedField]
  @scala.inline
  def LinkedHandle: LinkedHandle = "LinkedHandle".asInstanceOf[LinkedHandle]
  @scala.inline
  def ListValue: ListValue = "ListValue".asInstanceOf[ListValue]
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  @scala.inline
  def LocalArgument: LocalArgument = "LocalArgument".asInstanceOf[LocalArgument]
  @scala.inline
  def ModuleImport: ModuleImport = "ModuleImport".asInstanceOf[ModuleImport]
  @scala.inline
  def NODE_DELETE: NODE_DELETE = "NODE_DELETE".asInstanceOf[NODE_DELETE]
  @scala.inline
  def NONEXISTENT: NONEXISTENT = "NONEXISTENT".asInstanceOf[NONEXISTENT]
  @scala.inline
  def ObjectValue: ObjectValue = "ObjectValue".asInstanceOf[ObjectValue]
  @scala.inline
  def Operation: Operation = "Operation".asInstanceOf[Operation]
  @scala.inline
  def PageInfo: PageInfo = "PageInfo".asInstanceOf[PageInfo]
  @scala.inline
  def RANGE_ADD: RANGE_ADD = "RANGE_ADD".asInstanceOf[RANGE_ADD]
  @scala.inline
  def RANGE_DELETE: RANGE_DELETE = "RANGE_DELETE".asInstanceOf[RANGE_DELETE]
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  @scala.inline
  def RootArgument: RootArgument = "RootArgument".asInstanceOf[RootArgument]
  @scala.inline
  def ScalarField: ScalarField = "ScalarField".asInstanceOf[ScalarField]
  @scala.inline
  def ScalarHandle: ScalarHandle = "ScalarHandle".asInstanceOf[ScalarHandle]
  @scala.inline
  def SplitOperation: SplitOperation = "SplitOperation".asInstanceOf[SplitOperation]
  @scala.inline
  def Stream: Stream = "Stream".asInstanceOf[Stream]
  @scala.inline
  def TypeDiscriminator: TypeDiscriminator = "TypeDiscriminator".asInstanceOf[TypeDiscriminator]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def clientMutationId: clientMutationId = "clientMutationId".asInstanceOf[clientMutationId]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def cursor: cursor = "cursor".asInstanceOf[cursor]
  @scala.inline
  def defer_ : defer_ = "defer".asInstanceOf[defer_]
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  @scala.inline
  def endCursor: endCursor = "endCursor".asInstanceOf[endCursor]
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  @scala.inline
  def executeDotcomplete: executeDotcomplete = "execute.complete".asInstanceOf[executeDotcomplete]
  @scala.inline
  def executeDoterror: executeDoterror = "execute.error".asInstanceOf[executeDoterror]
  @scala.inline
  def executeDotinfo: executeDotinfo = "execute.info".asInstanceOf[executeDotinfo]
  @scala.inline
  def executeDotnext: executeDotnext = "execute.next".asInstanceOf[executeDotnext]
  @scala.inline
  def executeDotstart: executeDotstart = "execute.start".asInstanceOf[executeDotstart]
  @scala.inline
  def executeDotunsubscribe: executeDotunsubscribe = "execute.unsubscribe".asInstanceOf[executeDotunsubscribe]
  @scala.inline
  def hasNextPage: hasNextPage = "hasNextPage".asInstanceOf[hasNextPage]
  @scala.inline
  def hasPreviousPage: hasPreviousPage = "hasPreviousPage".asInstanceOf[hasPreviousPage]
  @scala.inline
  def linked: linked = "linked".asInstanceOf[linked]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def pageInfo_ : pageInfo_ = "pageInfo".asInstanceOf[pageInfo_]
  @scala.inline
  def pluralLinked: pluralLinked = "pluralLinked".asInstanceOf[pluralLinked]
  @scala.inline
  def prepend: prepend = "prepend".asInstanceOf[prepend]
  @scala.inline
  def queryresourceDotfetch: queryresourceDotfetch = "queryresource.fetch".asInstanceOf[queryresourceDotfetch]
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  @scala.inline
  def stale: stale = "stale".asInstanceOf[stale]
  @scala.inline
  def startCursor: startCursor = "startCursor".asInstanceOf[startCursor]
  @scala.inline
  def stream_ : stream_ = "stream".asInstanceOf[stream_]
}

