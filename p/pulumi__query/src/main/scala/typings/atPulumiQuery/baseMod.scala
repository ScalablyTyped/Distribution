package typings.atPulumiQuery

import typings.atPulumiQuery.baseMod.IterableBase
import typings.atPulumiQuery.interfacesMod.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/query/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPulumiQuery.interfacesMod.AsyncIterator because Already inherited
  - typings.atPulumiQuery.interfacesMod.AsyncIterableIterator because Already inherited
  - typings.atPulumiQuery.interfacesMod.GroupedAsyncIterableIterator because var conflicts: `return`, `throw`. Inlined key */ @js.native
  class GroupedAsyncIterableIteratorImpl[TKey, TSource] protected () extends IterableBase[TSource] {
    def this(key: TKey, core: AsyncIterableIterator[TSource]) = this()
    val key: TKey = js.native
  }
  
  @js.native
  abstract class IterableBase[T] protected () extends AsyncIterableIterator[T] {
    def this(core: AsyncIterableIterator[T]) = this()
    val core: js.Any = js.native
  }
  
}

