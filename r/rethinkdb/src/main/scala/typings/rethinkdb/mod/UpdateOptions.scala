package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateOptions extends js.Object {
  
  var durability: js.UndefOr[hard | soft] = js.native
  
  var nonAtomic: js.UndefOr[Boolean] = js.native
  
  var returnChanges: js.UndefOr[Boolean] = js.native
}
object UpdateOptions {
  
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setDurability(value: hard | soft): Self = this.set("durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurability: Self = this.set("durability", js.undefined)
    
    @scala.inline
    def setNonAtomic(value: Boolean): Self = this.set("nonAtomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonAtomic: Self = this.set("nonAtomic", js.undefined)
    
    @scala.inline
    def setReturnChanges(value: Boolean): Self = this.set("returnChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnChanges: Self = this.set("returnChanges", js.undefined)
  }
}
