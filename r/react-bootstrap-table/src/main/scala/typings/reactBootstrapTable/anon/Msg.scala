package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.EditValidatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Msg extends StObject {
  
  /**
    * A text message explaining the validation result.
    */
  var msg: String = js.native
  
  /**
    * A text title explaining the validation result.
    */
  var title: String = js.native
  
  /**
    * One of 'success' or 'error'
    */
  var `type`: EditValidatorType = js.native
}
object Msg {
  
  @scala.inline
  def apply(msg: String, title: String, `type`: EditValidatorType): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  @scala.inline
  implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EditValidatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
