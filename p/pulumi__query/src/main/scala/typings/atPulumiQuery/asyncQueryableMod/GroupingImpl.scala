package typings.atPulumiQuery.asyncQueryableMod

import typings.atPulumiQuery.interfacesMod.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atPulumiQuery.interfacesMod.AsyncQueryableGrouping because var conflicts: `return`, `throw`. Inlined  */ @JSImport("@pulumi/query/asyncQueryable", "GroupingImpl")
@js.native
class GroupingImpl[TKey, TSource] protected () extends AsyncQueryableImpl[TSource] {
  def this(key: TKey, group: AsyncIterableIterator[TSource]) = this()
  val key: TKey = js.native
}

