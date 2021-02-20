package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryMessage extends StObject {
  
  var entry: js.Any = js.native
  
  var meta: js.UndefOr[js.Object] = js.native
  
  var timetoken: js.UndefOr[String | Double] = js.native
}
object HistoryMessage {
  
  @scala.inline
  def apply(entry: js.Any): HistoryMessage = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryMessage]
  }
  
  @scala.inline
  implicit class HistoryMessageMutableBuilder[Self <: HistoryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setTimetoken(value: String | Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetokenUndefined: Self = StObject.set(x, "timetoken", js.undefined)
  }
}
