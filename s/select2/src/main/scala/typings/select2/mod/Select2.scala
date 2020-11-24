package typings.select2.mod

import typings.select2.mod.global.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2 extends js.Object {
  
  @JSName("$container")
  var $container: JQuery[HTMLElement] = js.native
  
  @JSName("$dropdown")
  var $dropdown: JQuery[HTMLElement] = js.native
  
  @JSName("$results")
  var $results: JQuery[HTMLElement] = js.native
  
  @JSName("$selection")
  var $selection: JQuery[HTMLElement] = js.native
  
  var dropdown: js.Any = js.native
  
  var id: String = js.native
  
  var options: typings.select2.anon.Options = js.native
  
  var results: js.Any = js.native
  
  var selection: js.Any = js.native
}
object Select2 {
  
  @scala.inline
  def apply(
    $container: JQuery[HTMLElement],
    $dropdown: JQuery[HTMLElement],
    $results: JQuery[HTMLElement],
    $selection: JQuery[HTMLElement],
    dropdown: js.Any,
    id: String,
    options: typings.select2.anon.Options,
    results: js.Any,
    selection: js.Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container.asInstanceOf[js.Any], $dropdown = $dropdown.asInstanceOf[js.Any], $results = $results.asInstanceOf[js.Any], $selection = $selection.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select2]
  }
  
  @scala.inline
  implicit class Select2Ops[Self <: Select2] (val x: Self) extends AnyVal {
    
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
    def set$container(value: JQuery[HTMLElement]): Self = this.set("$container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dropdown(value: JQuery[HTMLElement]): Self = this.set("$dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$results(value: JQuery[HTMLElement]): Self = this.set("$results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$selection(value: JQuery[HTMLElement]): Self = this.set("$selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: js.Any): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.select2.anon.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Any): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
}
