package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Topics extends js.Object {
  
  var topics: js.Array[java.lang.String] = js.native
  
  var types: js.Array[java.lang.String] = js.native
}
object Topics {
  
  @scala.inline
  def apply(topics: js.Array[java.lang.String], types: js.Array[java.lang.String]): Topics = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topics]
  }
  
  @scala.inline
  implicit class TopicsOps[Self <: Topics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTopicsVarargs(value: java.lang.String*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[java.lang.String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: java.lang.String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[java.lang.String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
