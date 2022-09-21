package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents ros message definition data.
  */
trait RosMsgDefinition extends StObject {
  
  var definitions: js.Array[RosMsgField]
  
  var name: js.UndefOr[String] = js.undefined
}
object RosMsgDefinition {
  
  inline def apply(definitions: js.Array[RosMsgField]): RosMsgDefinition = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosMsgDefinition]
  }
  
  extension [Self <: RosMsgDefinition](x: Self) {
    
    inline def setDefinitions(value: js.Array[RosMsgField]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsVarargs(value: RosMsgField*): Self = StObject.set(x, "definitions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
