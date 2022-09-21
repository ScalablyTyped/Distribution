package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait INxAxisTicks extends StObject {
  
  /**
    * Name of the derived definition.
    */
  var qName: String
  
  /**
    * List of tags.
    */
  var qTags: js.Array[String]
  
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell]
}
object INxAxisTicks {
  
  inline def apply(qName: String, qTags: js.Array[String], qTicks: js.Array[INxTickCell]): INxAxisTicks = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTicks = qTicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAxisTicks]
  }
  
  extension [Self <: INxAxisTicks](x: Self) {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
    
    inline def setQTicks(value: js.Array[INxTickCell]): Self = StObject.set(x, "qTicks", value.asInstanceOf[js.Any])
    
    inline def setQTicksVarargs(value: INxTickCell*): Self = StObject.set(x, "qTicks", js.Array(value*))
  }
}
