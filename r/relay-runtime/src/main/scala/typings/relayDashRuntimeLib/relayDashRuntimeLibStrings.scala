package typings
package relayDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object relayDashRuntimeLibStrings {
  @js.native
  sealed trait CRITICAL extends js.Object
  
  @js.native
  sealed trait Defer extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait EXISTENT
    extends relayDashRuntimeLib.relayDashRuntimeMod.RecordState
  
  @js.native
  sealed trait FIELDS_CHANGE
    extends relayDashRuntimeLib.relayDashRuntimeMod.MutationType
  
  @js.native
  sealed trait FragmentReference extends js.Object
  
  @js.native
  sealed trait NODE_DELETE
    extends relayDashRuntimeLib.relayDashRuntimeMod.MutationType
  
  @js.native
  sealed trait NONEXISTENT
    extends relayDashRuntimeLib.relayDashRuntimeMod.RecordState
  
  @js.native
  sealed trait PageInfo extends js.Object
  
  @js.native
  sealed trait RANGE_ADD
    extends relayDashRuntimeLib.relayDashRuntimeMod.MutationType
  
  @js.native
  sealed trait RANGE_DELETE
    extends relayDashRuntimeLib.relayDashRuntimeMod.MutationType
  
  @js.native
  sealed trait REQUIRED_CHILDREN
    extends relayDashRuntimeLib.relayDashRuntimeMod.MutationType
  
  @js.native
  sealed trait UNKNOWN
    extends relayDashRuntimeLib.relayDashRuntimeMod.RecordState
  
  @js.native
  sealed trait Viewer extends js.Object
  
  @js.native
  sealed trait WARNING extends js.Object
  
  @js.native
  sealed trait append
    extends relayDashRuntimeLib.relayDashRuntimeMod.RangeOperation
  
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
  sealed trait ignore
    extends relayDashRuntimeLib.relayDashRuntimeMod.RangeOperation
  
  @js.native
  sealed trait linked extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait pageInfo extends js.Object
  
  @js.native
  sealed trait pluralLinked extends js.Object
  
  @js.native
  sealed trait prepend
    extends relayDashRuntimeLib.relayDashRuntimeMod.RangeOperation
  
  @js.native
  sealed trait refetch
    extends relayDashRuntimeLib.relayDashRuntimeMod.RangeOperation
  
  @js.native
  sealed trait remove
    extends relayDashRuntimeLib.relayDashRuntimeMod.RangeOperation
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait startCursor extends js.Object
  
  @scala.inline
  def CRITICAL: CRITICAL = "CRITICAL".asInstanceOf[CRITICAL]
  @scala.inline
  def Defer: Defer = "Defer".asInstanceOf[Defer]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def EXISTENT: EXISTENT = "EXISTENT".asInstanceOf[EXISTENT]
  @scala.inline
  def FIELDS_CHANGE: FIELDS_CHANGE = "FIELDS_CHANGE".asInstanceOf[FIELDS_CHANGE]
  @scala.inline
  def FragmentReference: FragmentReference = "FragmentReference".asInstanceOf[FragmentReference]
  @scala.inline
  def NODE_DELETE: NODE_DELETE = "NODE_DELETE".asInstanceOf[NODE_DELETE]
  @scala.inline
  def NONEXISTENT: NONEXISTENT = "NONEXISTENT".asInstanceOf[NONEXISTENT]
  @scala.inline
  def PageInfo: PageInfo = "PageInfo".asInstanceOf[PageInfo]
  @scala.inline
  def RANGE_ADD: RANGE_ADD = "RANGE_ADD".asInstanceOf[RANGE_ADD]
  @scala.inline
  def RANGE_DELETE: RANGE_DELETE = "RANGE_DELETE".asInstanceOf[RANGE_DELETE]
  @scala.inline
  def REQUIRED_CHILDREN: REQUIRED_CHILDREN = "REQUIRED_CHILDREN".asInstanceOf[REQUIRED_CHILDREN]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
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

