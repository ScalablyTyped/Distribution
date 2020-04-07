package typings.select2.mod

import typings.select2.AnonOptions
import typings.select2.mod._Global_.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select2 extends js.Object {
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
  var options: AnonOptions
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
    options: AnonOptions,
    results: js.Any,
    selection: js.Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container.asInstanceOf[js.Any], $dropdown = $dropdown.asInstanceOf[js.Any], $results = $results.asInstanceOf[js.Any], $selection = $selection.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Select2]
  }
}

