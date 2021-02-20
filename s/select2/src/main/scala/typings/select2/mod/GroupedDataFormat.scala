package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupedDataFormat extends StObject {
  
  var children: js.UndefOr[js.Array[DataFormat]] = js.native
  
  var id: js.UndefOr[scala.Nothing] = js.native
  
  var text: String = js.native
}
object GroupedDataFormat {
  
  @scala.inline
  def apply(text: String): GroupedDataFormat = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedDataFormat]
  }
  
  @scala.inline
  implicit class GroupedDataFormatMutableBuilder[Self <: GroupedDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DataFormat]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DataFormat*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
