package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedFieldsData...
  */
@js.native
trait INxDerivedFieldsData extends js.Object {
  
  /**
    * Name of the derived definition.
    */
  var qDerivedDefinitionName: String = js.native
  
  /**
    * List of the derived fields.
    */
  var qFieldDefs: js.Array[INxDerivedField] = js.native
  
  /**
    * List of the derived groups.
    */
  var qGroupDefs: js.Array[INxDerivedGroup] = js.native
  
  /**
    * List of tags on the derived fields.
    */
  var qTags: js.Array[String] = js.native
}
object INxDerivedFieldsData {
  
  @scala.inline
  def apply(
    qDerivedDefinitionName: String,
    qFieldDefs: js.Array[INxDerivedField],
    qGroupDefs: js.Array[INxDerivedGroup],
    qTags: js.Array[String]
  ): INxDerivedFieldsData = {
    val __obj = js.Dynamic.literal(qDerivedDefinitionName = qDerivedDefinitionName.asInstanceOf[js.Any], qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGroupDefs = qGroupDefs.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldsData]
  }
  
  @scala.inline
  implicit class INxDerivedFieldsDataOps[Self <: INxDerivedFieldsData] (val x: Self) extends AnyVal {
    
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
    def setQDerivedDefinitionName(value: String): Self = this.set("qDerivedDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldDefsVarargs(value: INxDerivedField*): Self = this.set("qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQFieldDefs(value: js.Array[INxDerivedField]): Self = this.set("qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGroupDefsVarargs(value: INxDerivedGroup*): Self = this.set("qGroupDefs", js.Array(value :_*))
    
    @scala.inline
    def setQGroupDefs(value: js.Array[INxDerivedGroup]): Self = this.set("qGroupDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = this.set("qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = this.set("qTags", value.asInstanceOf[js.Any])
  }
}
