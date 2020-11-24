package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMatchingFieldInfo...
  */
@js.native
trait INxMatchingFieldInfo extends js.Object {
  
  /**
    * Name of the field
    */
  var qName: String = js.native
  
  /**
    * List of tags
    */
  var qTags: js.Array[String] = js.native
}
object INxMatchingFieldInfo {
  
  @scala.inline
  def apply(qName: String, qTags: js.Array[String]): INxMatchingFieldInfo = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMatchingFieldInfo]
  }
  
  @scala.inline
  implicit class INxMatchingFieldInfoOps[Self <: INxMatchingFieldInfo] (val x: Self) extends AnyVal {
    
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
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
