package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DerivedFieldsInTableData...
  */
@js.native
trait IDerivedFieldsInTableData extends js.Object {
  
  /**
    * Is set to true is the derived field is in use.
    */
  var qActive: Boolean = js.native
  
  /**
    * Name of the derived definition.
    */
  var qDefinitionName: String = js.native
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String] = js.native
}
object IDerivedFieldsInTableData {
  
  @scala.inline
  def apply(qActive: Boolean, qDefinitionName: String, qTags: js.Array[String]): IDerivedFieldsInTableData = {
    val __obj = js.Dynamic.literal(qActive = qActive.asInstanceOf[js.Any], qDefinitionName = qDefinitionName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDerivedFieldsInTableData]
  }
  
  @scala.inline
  implicit class IDerivedFieldsInTableDataOps[Self <: IDerivedFieldsInTableData] (val x: Self) extends AnyVal {
    
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
    def setQActive(value: Boolean): Self = this.set("qActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDefinitionName(value: String): Self = this.set("qDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
