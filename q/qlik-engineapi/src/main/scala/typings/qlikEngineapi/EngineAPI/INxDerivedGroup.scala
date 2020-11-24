package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxDerivedGroup...
  */
@js.native
trait INxDerivedGroup extends js.Object {
  
  /**
    * List of the derived fields in the group.
    */
  var qFieldDefs: js.Array[String] = js.native
  
  /**
    * Grouping type.
    * The grouping should be either H or C (Grouping is mandatory for derived definitions).
    * >> Is mandatory.
    */
  var qGrouping: NxGrpType = js.native
  
  /**
    * Identifier of the group.
    */
  var qId: String = js.native
  
  /**
    * Name of the derived group.
    */
  var qName: String = js.native
}
object INxDerivedGroup {
  
  @scala.inline
  def apply(qFieldDefs: js.Array[String], qGrouping: NxGrpType, qId: String, qName: String): INxDerivedGroup = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedGroup]
  }
  
  @scala.inline
  implicit class INxDerivedGroupOps[Self <: INxDerivedGroup] (val x: Self) extends AnyVal {
    
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
    def setQFieldDefsVarargs(value: String*): Self = this.set("qFieldDefs", js.Array(value :_*))
    
    @scala.inline
    def setQFieldDefs(value: js.Array[String]): Self = this.set("qFieldDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQId(value: String): Self = this.set("qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
}
