package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[js.Any]
  
  var dataMap: Id
  
  var selected: js.Array[js.Any]
  
  var show: Boolean
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[js.Any], dataMap: Id, selected: js.Array[js.Any], show: Boolean): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMap = dataMap.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataMap(value: Id): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[js.Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: js.Any*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
