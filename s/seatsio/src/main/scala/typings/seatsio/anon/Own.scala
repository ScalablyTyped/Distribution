package typings.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Own extends js.Object {
  
  var own: String = js.native
  
  var parent: js.UndefOr[String] = js.native
  
  var section: js.UndefOr[String] = js.native
}
object Own {
  
  @scala.inline
  def apply(own: String): Own = {
    val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
    __obj.asInstanceOf[Own]
  }
  
  @scala.inline
  implicit class OwnOps[Self <: Own] (val x: Self) extends AnyVal {
    
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
    def setOwn(value: String): Self = this.set("own", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
}
