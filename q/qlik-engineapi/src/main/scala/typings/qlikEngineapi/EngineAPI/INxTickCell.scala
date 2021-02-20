package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
@js.native
trait INxTickCell extends StObject {
  
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
  implicit class INxTickCellMutableBuilder[Self <: INxTickCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQEnd(value: Double): Self = StObject.set(x, "qEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStart(value: Double): Self = StObject.set(x, "qStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
