package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.Asterisk
import typings.sparqljs.sparqljsStrings.Exclamationmark
import typings.sparqljs.sparqljsStrings.Plussign
import typings.sparqljs.sparqljsStrings.Slash
import typings.sparqljs.sparqljsStrings.Verticalline
import typings.sparqljs.sparqljsStrings.^
import typings.sparqljs.sparqljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPath extends js.Object {
  
  var items: js.Array[IriTerm | PropertyPath] = js.native
  
  var pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark = js.native
  
  var `type`: path = js.native
}
object PropertyPath {
  
  @scala.inline
  def apply(
    items: js.Array[IriTerm | PropertyPath],
    pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark,
    `type`: path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
  
  @scala.inline
  implicit class PropertyPathOps[Self <: PropertyPath] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: (IriTerm | PropertyPath)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IriTerm | PropertyPath]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathType(value: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark): Self = this.set("pathType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: path): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
