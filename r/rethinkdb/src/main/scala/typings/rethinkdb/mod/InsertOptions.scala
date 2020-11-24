package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.always
import typings.rethinkdb.rethinkdbStrings.error
import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.replace
import typings.rethinkdb.rethinkdbStrings.soft
import typings.rethinkdb.rethinkdbStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOptions extends js.Object {
  
  var conflict: js.UndefOr[
    error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _])
  ] = js.native
  
  var durability: js.UndefOr[hard | soft] = js.native
  
  var returnChanges: js.UndefOr[Boolean | always] = js.native
}
object InsertOptions {
  
  @scala.inline
  def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  
  @scala.inline
  implicit class InsertOptionsOps[Self <: InsertOptions] (val x: Self) extends AnyVal {
    
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
    def setConflictFunction3(value: (/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any) => _): Self = this.set("conflict", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConflict(
      value: error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _])
    ): Self = this.set("conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflict: Self = this.set("conflict", js.undefined)
    
    @scala.inline
    def setDurability(value: hard | soft): Self = this.set("durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurability: Self = this.set("durability", js.undefined)
    
    @scala.inline
    def setReturnChanges(value: Boolean | always): Self = this.set("returnChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnChanges: Self = this.set("returnChanges", js.undefined)
  }
}
