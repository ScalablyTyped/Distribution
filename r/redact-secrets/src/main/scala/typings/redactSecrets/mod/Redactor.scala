package typings.redactSecrets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redactor extends js.Object {
  
  def forEach(obj: js.Any): Unit = js.native
  
  def map(obj: js.Any): js.Any = js.native
}
object Redactor {
  
  @scala.inline
  def apply(forEach: js.Any => Unit, map: js.Any => js.Any): Redactor = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[Redactor]
  }
  
  @scala.inline
  implicit class RedactorOps[Self <: Redactor] (val x: Self) extends AnyVal {
    
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
    def setForEach(value: js.Any => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: js.Any => js.Any): Self = this.set("map", js.Any.fromFunction1(value))
  }
}
