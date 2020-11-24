package typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default 'Add <b>{term}</b>'
    */
  var addResult: String = js.native
  
  /**
    * @default '{count} selected'
    */
  var count: String = js.native
  
  /**
    * @default 'Max {maxCount} selections'
    */
  var maxSelections: String = js.native
  
  /**
    * 'No results found.'
    */
  var noResults: String = js.native
}
object Impl {
  
  @scala.inline
  def apply(addResult: String, count: String, maxSelections: String, noResults: String): Impl = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
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
    def setAddResult(value: String): Self = this.set("addResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSelections(value: String): Self = this.set("maxSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResults(value: String): Self = this.set("noResults", value.asInstanceOf[js.Any])
  }
}
