package typings.samchon.collectionsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.tstl.IteratoranyanyanyanyConstructor
import typings.tstl.IteratoranyanyanyanyCreate
import typings.tstl.entryMod.Entry
import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapElementListMod.MapElementList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/collections", "TreeMapCollection")
@js.native
class TreeMapCollection[Key, T] ()
  extends typings.ecol.treeMapCollectionMod.TreeMapCollection[Key, T]

@JSImport("samchon/collections", "TreeMapCollection")
@js.native
object TreeMapCollection extends js.Object {
  @js.native
  class IteratorCls[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _, 
    IteratoranyanyanyanyConstructor, 
    typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Source */ _
    ]
  ] */] ()
    extends typings.ecol.mod.TreeMapCollection.IteratorCls[Key, T, Unique, Source]
  
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
    typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
      js.Object, 
      js.Object, 
      Boolean, 
      MapContainer[
        /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
        IteratoranyanyanyanyCreate, 
        typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
        ]
      ]
    ]
  ] = js.native
  @js.native
  object Iterator
    extends Instantiable0[
          typings.tstl.mapElementListMod.MapElementList.Iterator[
            js.Object, 
            js.Object, 
            Boolean, 
            MapContainer[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
              IteratoranyanyanyanyConstructor, 
              typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
                /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
                /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
                /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
                /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
              ]
            ]
          ]
        ] {
    /**
      * @internal
      */
    def create[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source], 
        typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, Unique, Source]
      ] */](
      list: MapElementList[Key, T, Unique, Source],
      prev: typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source],
      next: typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source],
      `val`: Entry[Key, T]
    ): typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source] = js.native
  }
  
}

