package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.Data.DataViewOptions
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data")
@js.native
object Data extends js.Object {
  @js.native
  class DataView[T /* <: SlickData */] ()
    extends typings.slickgrid.Slick.Data.DataView[T] {
    def this(options: DataViewOptions[T]) = this()
    /**
      * Returns the item at a given index.
      * @param index
      */
    /* CompleteClass */
    override def getItem(index: Double): T = js.native
    /**
      * Returns the number of data items in the set.
      */
    /* CompleteClass */
    override def getLength(): Double = js.native
  }
  
  @js.native
  class GroupItemMetadataProvider[T /* <: SlickData */] ()
    extends typings.slickgrid.Slick.Data.GroupItemMetadataProvider[T]
  
  @js.native
  object Aggregators extends js.Object {
    @js.native
    class Aggregator[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
      /* CompleteClass */
      override var field: String = js.native
      /* CompleteClass */
      override def accumulate(item: T): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
    }
    
    @js.native
    class Avg[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
      /* CompleteClass */
      override var field: String = js.native
      /* CompleteClass */
      override def accumulate(item: T): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
    }
    
    @js.native
    class Max[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
      /* CompleteClass */
      override var field: String = js.native
      /* CompleteClass */
      override def accumulate(item: T): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
    }
    
    @js.native
    class Min[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
      /* CompleteClass */
      override var field: String = js.native
      /* CompleteClass */
      override def accumulate(item: T): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
    }
    
    @js.native
    class Sum[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
      /* CompleteClass */
      override var field: String = js.native
      /* CompleteClass */
      override def accumulate(item: T): Unit = js.native
      /* CompleteClass */
      override def init(): Unit = js.native
      /* CompleteClass */
      override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
    }
    
  }
  
}

