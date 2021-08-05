package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait INxTickCell extends StObject {
  
  /*
    * End value.
    */
  var qEnd: Double
  
  /**
    * Start value.
    */
  var qStart: Double
  
  /**
    * Tick's label.
    */
  var qText: String
}
object INxTickCell {
  
  inline def apply(qEnd: Double, qStart: Double, qText: String): INxTickCell = {
    val __obj = js.Dynamic.literal(qEnd = qEnd.asInstanceOf[js.Any], qStart = qStart.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxTickCell]
  }
  
  extension [Self <: INxTickCell](x: Self) {
    
    inline def setQEnd(value: Double): Self = StObject.set(x, "qEnd", value.asInstanceOf[js.Any])
    
    inline def setQStart(value: Double): Self = StObject.set(x, "qStart", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
