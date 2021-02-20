package typings.select2.mod

import typings.jquery.BaseJQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataParams extends StObject {
  
  var data: OptionData = js.native
  
  // TODO: must be data source
  var originalEvent: BaseJQueryEventObject = js.native
}
object DataParams {
  
  @scala.inline
  def apply(data: OptionData, originalEvent: BaseJQueryEventObject): DataParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataParams]
  }
  
  @scala.inline
  implicit class DataParamsMutableBuilder[Self <: DataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: OptionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: BaseJQueryEventObject): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
