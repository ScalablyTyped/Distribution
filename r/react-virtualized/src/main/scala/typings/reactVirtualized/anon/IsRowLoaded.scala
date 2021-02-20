package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps
import typings.reactVirtualized.mod.IndexRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRowLoaded extends StObject {
  
  var children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, ReactNode]] = js.native
  
  var isRowLoaded: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, Boolean]] = js.native
  
  var loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]] = js.native
  
  var minimumBatchSize: Validator[Double] = js.native
  
  var rowCount: Validator[Double] = js.native
  
  var threshold: Validator[Double] = js.native
}
object IsRowLoaded {
  
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, ReactNode]],
    isRowLoaded: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, Boolean]],
    loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]],
    minimumBatchSize: Validator[Double],
    rowCount: Validator[Double],
    threshold: Validator[Double]
  ): IsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isRowLoaded = isRowLoaded.asInstanceOf[js.Any], loadMoreRows = loadMoreRows.asInstanceOf[js.Any], minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRowLoaded]
  }
  
  @scala.inline
  implicit class IsRowLoadedMutableBuilder[Self <: IsRowLoaded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowLoaded(value: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, Boolean]]): Self = StObject.set(x, "isRowLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMoreRows(value: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]]): Self = StObject.set(x, "loadMoreRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumBatchSize(value: Validator[Double]): Self = StObject.set(x, "minimumBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCount(value: Validator[Double]): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Validator[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
