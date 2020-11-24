package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait INxAxisTicks extends js.Object {
  
  /**
    * Name of the derived definition.
    */
  var qName: String = js.native
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
  
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell] = js.native
}
object INxAxisTicks {
  
  @scala.inline
  def apply(qName: String, qTags: js.Array[String], qTicks: js.Array[INxTickCell]): INxAxisTicks = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTicks = qTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisTicks]
  }
  
  @scala.inline
  implicit class INxAxisTicksOps[Self <: INxAxisTicks] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setQTicksVarargs(value: INxTickCell*): Self = this.set("qTicks", js.Array(value :_*))
    
    @scala.inline
    def setQTicks(value: js.Array[INxTickCell]): Self = this.set("qTicks", value.asInstanceOf[js.Any])
  }
}
