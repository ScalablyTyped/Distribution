package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: This struct is deprecated (not recommended to use).
  */
trait INxStreamListEntry extends StObject {
  
  /**
    * Identifier of the stream
    */
  var qId: String
  
  /**
    * Name of the stream
    */
  var qName: String
}
object INxStreamListEntry {
  
  inline def apply(qId: String, qName: String): INxStreamListEntry = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStreamListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxStreamListEntry] (val x: Self) extends AnyVal {
    
    inline def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
