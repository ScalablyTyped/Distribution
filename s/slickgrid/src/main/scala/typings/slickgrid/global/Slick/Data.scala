package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.Data.DataViewOptions
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Slick.Data")
@js.native
object Data extends js.Object {
  
  @js.native
  object Aggregators extends js.Object {
    
    @js.native
    class Aggregator[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
    
    @js.native
    class Avg[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
    
    @js.native
    class Max[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
    
    @js.native
    class Min[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
    
    @js.native
    class Sum[T] ()
      extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
  }
  
  @js.native
  class DataView[T /* <: SlickData */] ()
    extends typings.slickgrid.Slick.Data.DataView[T] {
    def this(options: DataViewOptions[T]) = this()
  }
  
  @js.native
  class GroupItemMetadataProvider[T /* <: SlickData */] ()
    extends typings.slickgrid.Slick.Data.GroupItemMetadataProvider[T]
}
