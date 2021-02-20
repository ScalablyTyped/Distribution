package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: This struct is deprecated (not recommended to use).
  */
@js.native
trait INxStreamListEntry extends StObject {
  
  /**
    * Identifier of the stream
    */
  var qId: String = js.native
  
  /**
    * Name of the stream
    */
  var qName: String = js.native
}
object INxStreamListEntry {
  
  @scala.inline
  def apply(qId: String, qName: String): INxStreamListEntry = {
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStreamListEntry]
  }
  
  @scala.inline
  implicit class INxStreamListEntryMutableBuilder[Self <: INxStreamListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQId(value: String): Self = StObject.set(x, "qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
