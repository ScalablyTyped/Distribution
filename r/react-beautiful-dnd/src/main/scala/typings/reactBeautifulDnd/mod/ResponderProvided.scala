package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderProvided extends js.Object {
  
  var announce: Announce = js.native
}
object ResponderProvided {
  
  @scala.inline
  def apply(announce: /* message */ String => Unit): ResponderProvided = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce))
    __obj.asInstanceOf[ResponderProvided]
  }
  
  @scala.inline
  implicit class ResponderProvidedOps[Self <: ResponderProvided] (val x: Self) extends AnyVal {
    
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
    def setAnnounce(value: /* message */ String => Unit): Self = this.set("announce", js.Any.fromFunction1(value))
  }
}
