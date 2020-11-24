package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait INxTickCell extends js.Object {
  
  /*
    * End value.
    */
  var qEnd: Double = js.native
  
  /**
    * Start value.
    */
  var qStart: Double = js.native
  
  /**
    * Tick's label.
    */
  var qText: String = js.native
}
object INxTickCell {
  
  @scala.inline
  def apply(qEnd: Double, qStart: Double, qText: String): INxTickCell = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTickCell]
  }
  
  @scala.inline
  implicit class INxTickCellOps[Self <: INxTickCell] (val x: Self) extends AnyVal {
    
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
    def setQEnd(value: Double): Self = this.set("qEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStart(value: Double): Self = this.set("qStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
}
