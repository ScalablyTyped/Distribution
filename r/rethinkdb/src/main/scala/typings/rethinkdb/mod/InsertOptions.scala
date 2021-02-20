package typings.rethinkdb.mod

import typings.rethinkdb.rethinkdbStrings.always
import typings.rethinkdb.rethinkdbStrings.error
import typings.rethinkdb.rethinkdbStrings.hard
import typings.rethinkdb.rethinkdbStrings.replace
import typings.rethinkdb.rethinkdbStrings.soft
import typings.rethinkdb.rethinkdbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOptions extends StObject {
  
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
  implicit class InsertOptionsMutableBuilder[Self <: InsertOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflict(
      value: error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any, _])
    ): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictFunction3(value: (/* id */ String, /* oldDoc */ js.Any, /* newDoc */ js.Any) => _): Self = StObject.set(x, "conflict", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConflictUndefined: Self = StObject.set(x, "conflict", js.undefined)
    
    @scala.inline
    def setDurability(value: hard | soft): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    @scala.inline
    def setReturnChanges(value: Boolean | always): Self = StObject.set(x, "returnChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnChangesUndefined: Self = StObject.set(x, "returnChanges", js.undefined)
  }
}
