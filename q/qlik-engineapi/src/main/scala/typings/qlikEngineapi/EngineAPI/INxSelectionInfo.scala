package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSelectionInfo...
  */
@js.native
trait INxSelectionInfo extends js.Object {
  
  /**
    * Is set to true if the visualization is in selection mode.
    * For more information about the selection mode
    */
  var qInSelections: Boolean = js.native
  
  /**
    * Is set to true if the visualization is in selection mode
    * and if some selections have been made while in selection mode.
    */
  var qMadeSelections: Boolean = js.native
}
object INxSelectionInfo {
  
  @scala.inline
  def apply(qInSelections: Boolean, qMadeSelections: Boolean): INxSelectionInfo = {
    val __obj = js.Dynamic.literal(qInSelections = qInSelections.asInstanceOf[js.Any], qMadeSelections = qMadeSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSelectionInfo]
  }
  
  @scala.inline
  implicit class INxSelectionInfoOps[Self <: INxSelectionInfo] (val x: Self) extends AnyVal {
    
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
    def setQInSelections(value: Boolean): Self = this.set("qInSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMadeSelections(value: Boolean): Self = this.set("qMadeSelections", value.asInstanceOf[js.Any])
  }
}
