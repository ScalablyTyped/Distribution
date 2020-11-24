package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends SparqlQuery {
  
  var prefixes: StringDictionary[String] = js.native
  
  var `type`: update = js.native
  
  var updates: js.Array[UpdateOperation] = js.native
}
object Update {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], `type`: update, updates: js.Array[UpdateOperation]): Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    
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
    def setPrefixes(value: StringDictionary[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: UpdateOperation*): Self = this.set("updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: js.Array[UpdateOperation]): Self = this.set("updates", value.asInstanceOf[js.Any])
  }
}
