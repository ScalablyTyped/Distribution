package typings.relayDashRuntime

import typings.relayDashRuntime.relayDashRuntimeMod.MutationType
import typings.relayDashRuntime.relayDashRuntimeMod.RangeOperation
import typings.relayDashRuntime.relayDashRuntimeMod.RecordState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object relayDashRuntimeStrings {
  @js.native
  sealed trait CRITICAL extends js.Object
  
  @js.native
  sealed trait ClientExtension extends js.Object
  
  @js.native
  sealed trait Condition extends js.Object
  
  @js.native
  sealed trait ConnectionField extends js.Object
  
  @js.native
  sealed trait Defer extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait EXISTENT extends RecordState
  
  @js.native
  sealed trait FIELDS_CHANGE extends MutationType
  
  @js.native
  sealed trait Fragment extends js.Object
  
  @js.native
  sealed trait FragmentReference extends js.Object
  
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
  sealed trait Literal extends js.Object
  
  @js.native
  sealed trait LocalArgument extends js.Object
  
  @js.native
  sealed trait ModuleImport extends js.Object
  
  @js.native
  sealed trait NODE_DELETE extends MutationType
  
  @js.native
  sealed trait NONEXISTENT extends RecordState
  
  @js.native
  sealed trait Operation extends js.Object
  
  @js.native
  sealed trait PageInfo extends js.Object
  
  @js.native
  sealed trait RANGE_ADD extends MutationType
  
  @js.native
  sealed trait RANGE_DELETE extends MutationType
  
  @js.native
  sealed trait REQUIRED_CHILDREN extends MutationType
  
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
  sealed trait UNKNOWN extends RecordState
  
  @js.native
  sealed trait Variable extends js.Object
  
  @js.native
  sealed trait Viewer extends js.Object
  
  @js.native
  sealed trait WARNING extends js.Object
  
  @js.native
  sealed trait append extends RangeOperation
  
  @js.native
  sealed trait clientMutationId extends js.Object
  
  @js.native
  sealed trait cursor extends js.Object
  
  @js.native
  sealed trait edges extends js.Object
  
  @js.native
  sealed trait endCursor extends js.Object
  
  @js.native
  sealed trait hasNextPage extends js.Object
  
  @js.native
  sealed trait hasPreviousPage extends js.Object
  
  @js.native
  sealed trait ignore extends RangeOperation
  
  @js.native
  sealed trait linked extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait pageInfo extends js.Object
  
  @js.native
  sealed trait pluralLinked extends js.Object
  
  @js.native
  sealed trait prepend extends RangeOperation
  
  @js.native
  sealed trait refetch extends RangeOperation
  
  @js.native
  sealed trait remove extends RangeOperation
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait startCursor extends js.Object
  
  @scala.inline
  def CRITICAL: CRITICAL = "CRITICAL".asInstanceOf[CRITICAL]
  @scala.inline
  def ClientExtension: ClientExtension = "ClientExtension".asInstanceOf[ClientExtension]
  @scala.inline
  def Condition: Condition = "Condition".asInstanceOf[Condition]
  @scala.inline
  def ConnectionField: ConnectionField = "ConnectionField".asInstanceOf[ConnectionField]
  @scala.inline
  def Defer: Defer = "Defer".asInstanceOf[Defer]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def EXISTENT: EXISTENT = "EXISTENT".asInstanceOf[EXISTENT]
  @scala.inline
  def FIELDS_CHANGE: FIELDS_CHANGE = "FIELDS_CHANGE".asInstanceOf[FIELDS_CHANGE]
  @scala.inline
  def Fragment: Fragment = "Fragment".asInstanceOf[Fragment]
  @scala.inline
  def FragmentReference: FragmentReference = "FragmentReference".asInstanceOf[FragmentReference]
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
  def Operation: Operation = "Operation".asInstanceOf[Operation]
  @scala.inline
  def PageInfo: PageInfo = "PageInfo".asInstanceOf[PageInfo]
  @scala.inline
  def RANGE_ADD: RANGE_ADD = "RANGE_ADD".asInstanceOf[RANGE_ADD]
  @scala.inline
  def RANGE_DELETE: RANGE_DELETE = "RANGE_DELETE".asInstanceOf[RANGE_DELETE]
  @scala.inline
  def REQUIRED_CHILDREN: REQUIRED_CHILDREN = "REQUIRED_CHILDREN".asInstanceOf[REQUIRED_CHILDREN]
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
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def Viewer: Viewer = "Viewer".asInstanceOf[Viewer]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  @scala.inline
  def clientMutationId: clientMutationId = "clientMutationId".asInstanceOf[clientMutationId]
  @scala.inline
  def cursor: cursor = "cursor".asInstanceOf[cursor]
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  @scala.inline
  def endCursor: endCursor = "endCursor".asInstanceOf[endCursor]
  @scala.inline
  def hasNextPage: hasNextPage = "hasNextPage".asInstanceOf[hasNextPage]
  @scala.inline
  def hasPreviousPage: hasPreviousPage = "hasPreviousPage".asInstanceOf[hasPreviousPage]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def linked: linked = "linked".asInstanceOf[linked]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def pageInfo: pageInfo = "pageInfo".asInstanceOf[pageInfo]
  @scala.inline
  def pluralLinked: pluralLinked = "pluralLinked".asInstanceOf[pluralLinked]
  @scala.inline
  def prepend: prepend = "prepend".asInstanceOf[prepend]
  @scala.inline
  def refetch: refetch = "refetch".asInstanceOf[refetch]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  @scala.inline
  def startCursor: startCursor = "startCursor".asInstanceOf[startCursor]
}

