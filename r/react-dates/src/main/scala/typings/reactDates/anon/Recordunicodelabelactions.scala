package typings.reactDates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'unicode' | 'label' | 'action', string> */
@js.native
trait Recordunicodelabelactions extends js.Object {
  
  var action: String = js.native
  
  var label: String = js.native
  
  var unicode: String = js.native
}
object Recordunicodelabelactions {
  
  @scala.inline
  def apply(action: String, label: String, unicode: String): Recordunicodelabelactions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordunicodelabelactions]
  }
  
  @scala.inline
  implicit class RecordunicodelabelactionsOps[Self <: Recordunicodelabelactions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicode(value: String): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
}
