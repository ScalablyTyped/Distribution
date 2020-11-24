package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: This struct is deprecated (not recommended to use).
  */
@js.native
trait INxStreamListEntry extends js.Object {
  
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
  implicit class INxStreamListEntryOps[Self <: INxStreamListEntry] (val x: Self) extends AnyVal {
    
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
    def setQId(value: String): Self = this.set("qId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
  }
}
