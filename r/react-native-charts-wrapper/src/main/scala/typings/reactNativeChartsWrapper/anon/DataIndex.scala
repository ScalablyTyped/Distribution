package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataIndex extends StObject {
  
  var dataIndex: js.UndefOr[Double] = js.native
  
  var dataSetIndex: js.UndefOr[Double] = js.native
  
  var stackIndex: js.UndefOr[Double] = js.native
  
  var x: Double = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object DataIndex {
  
  @scala.inline
  def apply(x: Double): DataIndex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  
  @scala.inline
  implicit class DataIndexMutableBuilder[Self <: DataIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    @scala.inline
    def setDataSetIndex(value: Double): Self = StObject.set(x, "dataSetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetIndexUndefined: Self = StObject.set(x, "dataSetIndex", js.undefined)
    
    @scala.inline
    def setStackIndex(value: Double): Self = StObject.set(x, "stackIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIndexUndefined: Self = StObject.set(x, "stackIndex", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
