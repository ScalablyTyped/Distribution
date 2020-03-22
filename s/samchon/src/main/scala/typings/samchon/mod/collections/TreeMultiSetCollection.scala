package typings.samchon.mod.collections

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.tstl.IteratoranyanyanyConstructor
import typings.tstl.IteratoranyanyanyCreate
import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.setElementListMod.SetElementList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "collections.TreeMultiSetCollection")
@js.native
class TreeMultiSetCollection[T] ()
  extends typings.ecol.treeMultiSetCollectionMod.TreeMultiSetCollection[T]

@JSImport("samchon", "collections.TreeMultiSetCollection")
@js.native
object TreeMultiSetCollection extends js.Object {
  @js.native
  class IteratorCls[Key, Unique /* <: Boolean */, Source /* <: SetContainer[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _, 
    IteratoranyanyanyConstructor, 
    typings.tstl.setElementListMod.SetElementList.ReverseIterator[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Source */ _
    ]
  ] */] ()
    extends typings.samchon.collectionsMod.TreeMultiSetCollection.IteratorCls[Key, Unique, Source]
  
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
      Iterator[
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
  val ReverseIterator: Instantiable0[
    typings.tstl.setElementListMod.SetElementList.ReverseIterator[
      js.Object, 
      Boolean, 
      SetContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        IteratoranyanyanyCreate, 
        typings.tstl.setElementListMod.SetElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  @js.native
  object Iterator
    extends Instantiable0[
          typings.tstl.setElementListMod.SetElementList.Iterator[
            js.Object, 
            Boolean, 
            SetContainer[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
              IteratoranyanyanyConstructor, 
              typings.tstl.setElementListMod.SetElementList.ReverseIterator[
                /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
                /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
                /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
              ]
            ]
          ]
        ] {
    /**
      * @internal
      */
    def create[Key, Unique /* <: Boolean */, Source /* <: SetContainer[
        Key, 
        Unique, 
        Source, 
        typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source], 
        typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, Unique, Source]
      ] */](
      list: SetElementList[Key, Unique, Source],
      prev: typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source],
      next: typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source],
      `val`: Key
    ): typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source] = js.native
  }
  
}

