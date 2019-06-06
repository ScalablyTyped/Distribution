package typings
package atPulumiQueryLib.asyncQueryableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atPulumiQueryLib.interfacesMod.AsyncQueryableGrouping because var conflicts: `return`, `throw`. Inlined  */ @JSImport("@pulumi/query/asyncQueryable", "GroupingImpl")
@js.native
class GroupingImpl[TKey, TSource] protected () extends AsyncQueryableImpl[TSource] {
  def this(key: TKey, group: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource]) = this()
  val key: TKey = js.native
}

