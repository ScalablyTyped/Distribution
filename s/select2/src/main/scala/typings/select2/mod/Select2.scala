package typings.select2.mod

import typings.select2.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select2 extends StObject {
  
  @JSName("$container")
  var $container: JQuery[HTMLElement]
  
  @JSName("$dropdown")
  var $dropdown: JQuery[HTMLElement]
  
  @JSName("$results")
  var $results: JQuery[HTMLElement]
  
  @JSName("$selection")
  var $selection: JQuery[HTMLElement]
  
  var dropdown: js.Any
  
  var id: String
  
  var options: typings.select2.anon.Options
  
  var results: js.Any
  
  var selection: js.Any
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
  implicit class Select2MutableBuilder[Self <: Select2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dropdown(value: JQuery[HTMLElement]): Self = StObject.set(x, "$dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$results(value: JQuery[HTMLElement]): Self = StObject.set(x, "$results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$selection(value: JQuery[HTMLElement]): Self = StObject.set(x, "$selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: js.Any): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.select2.anon.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: js.Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
