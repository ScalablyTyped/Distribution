package typings.sentryTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends js.Object {
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var op: js.UndefOr[String] = js.native
  
  var parent_span_id: js.UndefOr[String] = js.native
  
  var span_id: String = js.native
  
  var start_timestamp: Double = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var trace_id: String = js.native
}
object Description {
  
  @scala.inline
  def apply(span_id: String, start_timestamp: Double, trace_id: String): Description = {
    val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], start_timestamp = start_timestamp.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpan_id(value: String): Self = this.set("span_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timestamp(value: Double): Self = this.set("start_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace_id(value: String): Self = this.set("trace_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
    
    @scala.inline
    def setParent_span_id(value: String): Self = this.set("parent_span_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent_span_id: Self = this.set("parent_span_id", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
