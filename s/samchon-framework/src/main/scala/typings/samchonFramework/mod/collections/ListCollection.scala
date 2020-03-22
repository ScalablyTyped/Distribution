package typings.samchonFramework.mod.collections

import org.scalablytyped.runtime.Instantiable3
import typings.tstl.icontainerMod.IContainer
import typings.tstl.ipointerMod.IPointer
import typings.tstl.listMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "collections.ListCollection")
@js.native
class ListCollection[T] ()
  extends typings.ecol.listCollectionMod.ListCollection[T]

@JSImport("samchon-framework", "collections.ListCollection")
@js.native
object ListCollection extends js.Object {
  /**
    * Iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class Iterator[T] protected ()
    extends typings.samchon.mod.collections.ListCollection.Iterator[T]
  
  /**
    * Reverse iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class ReverseIterator[T] ()
    extends typings.ecol.listCollectionMod.ListCollection.ReverseIterator[T]
  
  val Event: Instantiable3[
    /* type */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
    typings.ecol.collectionEventMod.CollectionEvent[
      js.Object, 
      IContainer[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      typings.tstl.icontainerMod.IContainer.Iterator[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      typings.tstl.icontainerMod.IContainer.ReverseIterator[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ]
    ]
  ] = js.native
  /* static members */
  @js.native
  object Iterator extends js.Object {
    /**
      * @internal
      */
    def _Set_source_ptr[T](it: typings.tstl.listMod.List.Iterator[T], ptr: IPointer[List[T]]): Unit = js.native
    /**
      * @internal
      */
    def create[T](
      sourcePtr: IPointer[List[T]],
      prev: typings.tstl.listMod.List.Iterator[T],
      next: typings.tstl.listMod.List.Iterator[T],
      value: T
    ): typings.tstl.listMod.List.Iterator[T] = js.native
  }
  
}

