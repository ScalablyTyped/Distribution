package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLibraryDimensionDef
  */
@js.native
trait INxLibraryDimensionDef extends js.Object {
  
  /**
    * Array of dimension names.
    */
  var qFieldDefs: js.Array[String] = js.native
  
  /**
    * Array of dimension labels.
    */
  var qFieldLabels: js.Array[String] = js.native
  
  /**
    * Information about the grouping.
    */
  var qGrouping: NxGrpType = js.native
  
  /**
    * no docu
    */
  var qLabelExpression: String = js.native
}
object INxLibraryDimensionDef {
  
  @scala.inline
  def apply(
    qFieldDefs: js.Array[String],
    qFieldLabels: js.Array[String],
    qGrouping: NxGrpType,
    qLabelExpression: String
  ): INxLibraryDimensionDef = {
    val __obj = js.Dynamic.literal(qFieldDefs = qFieldDefs.asInstanceOf[js.Any], qFieldLabels = qFieldLabels.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qLabelExpression = qLabelExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLibraryDimensionDef]
  }
  
  @scala.inline
  implicit class INxLibraryDimensionDefOps[Self <: INxLibraryDimensionDef] (val x: Self) extends AnyVal {
    
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
    def setQFieldLabelsVarargs(value: String*): Self = this.set("qFieldLabels", js.Array(value :_*))
    
    @scala.inline
    def setQFieldLabels(value: js.Array[String]): Self = this.set("qFieldLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrouping(value: NxGrpType): Self = this.set("qGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLabelExpression(value: String): Self = this.set("qLabelExpression", value.asInstanceOf[js.Any])
  }
}
