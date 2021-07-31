package typings.pulumiQuery

import typings.pulumiQuery.interfacesMod.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pulumiQuery.interfacesMod.AsyncIterator because Already inherited
  - typings.pulumiQuery.interfacesMod.AsyncIterableIterator because Already inherited
  - typings.pulumiQuery.interfacesMod.GroupedAsyncIterableIterator because var conflicts: `return`, `throw`. Inlined key */ @JSImport("@pulumi/query/base", "GroupedAsyncIterableIteratorImpl")
  @js.native
  class GroupedAsyncIterableIteratorImpl[TKey, TSource] protected () extends IterableBase[TSource] {
    def this(key: TKey, core: AsyncIterableIterator[TSource]) = this()
    
    val key: TKey = js.native
  }
  
  @JSImport("@pulumi/query/base", "IterableBase")
  @js.native
  abstract class IterableBase[T] protected ()
    extends StObject
       with AsyncIterableIterator[T] {
    def this(core: AsyncIterableIterator[T]) = this()
    
    val core: js.Any = js.native
  }
}
