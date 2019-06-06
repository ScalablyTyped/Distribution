package typings
package atPulumiQueryLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atPulumiQueryLib.interfacesMod.GroupedAsyncIterableIterator because var conflicts: `return`, `throw`. Inlined key */ @JSImport("@pulumi/query/base", "GroupedAsyncIterableIteratorImpl")
@js.native
class GroupedAsyncIterableIteratorImpl[TKey, TSource] protected () extends IterableBase[TSource] {
  def this(key: TKey, core: atPulumiQueryLib.interfacesMod.AsyncIterableIterator[TSource]) = this()
  val key: TKey = js.native
}

