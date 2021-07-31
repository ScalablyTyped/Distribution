package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailListListData extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object EmailListListData {
  
  @scala.inline
  def apply(): EmailListListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailListListData]
  }
  
  @scala.inline
  implicit class EmailListListDataMutableBuilder[Self <: EmailListListData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
