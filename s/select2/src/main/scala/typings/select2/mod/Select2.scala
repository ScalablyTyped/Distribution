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
  
  var dropdown: Any
  
  var id: String
  
  var options: typings.select2.anon.Options
  
  var results: Any
  
  var selection: Any
}
object Select2 {
  
  inline def apply(
    $container: JQuery[HTMLElement],
    $dropdown: JQuery[HTMLElement],
    $results: JQuery[HTMLElement],
    $selection: JQuery[HTMLElement],
    dropdown: Any,
    id: String,
    options: typings.select2.anon.Options,
    results: Any,
    selection: Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container.asInstanceOf[js.Any], $dropdown = $dropdown.asInstanceOf[js.Any], $results = $results.asInstanceOf[js.Any], $selection = $selection.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select2]
  }
  
  extension [Self <: Select2](x: Self) {
    
    inline def set$container(value: JQuery[HTMLElement]): Self = StObject.set(x, "$container", value.asInstanceOf[js.Any])
    
    inline def set$dropdown(value: JQuery[HTMLElement]): Self = StObject.set(x, "$dropdown", value.asInstanceOf[js.Any])
    
    inline def set$results(value: JQuery[HTMLElement]): Self = StObject.set(x, "$results", value.asInstanceOf[js.Any])
    
    inline def set$selection(value: JQuery[HTMLElement]): Self = StObject.set(x, "$selection", value.asInstanceOf[js.Any])
    
    inline def setDropdown(value: Any): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.select2.anon.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Any): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
