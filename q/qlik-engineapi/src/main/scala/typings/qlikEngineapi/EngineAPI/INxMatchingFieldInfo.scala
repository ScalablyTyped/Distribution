package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMatchingFieldInfo...
  */
trait INxMatchingFieldInfo extends StObject {
  
  /**
    * Name of the field
    */
  var qName: String
  
  /**
    * List of tags
    */
  var qTags: js.Array[String]
}
object INxMatchingFieldInfo {
  
  inline def apply(qName: String, qTags: js.Array[String]): INxMatchingFieldInfo = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMatchingFieldInfo]
  }
  
  extension [Self <: INxMatchingFieldInfo](x: Self) {
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
  }
}
