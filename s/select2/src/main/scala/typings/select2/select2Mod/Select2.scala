package typings.select2.select2Mod

import typings.select2.Anon_Options
import typings.select2.select2Mod.Global.JQuery
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
  var options: Anon_Options
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
    options: Anon_Options,
    results: js.Any,
    selection: js.Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container, $dropdown = $dropdown, $results = $results, $selection = $selection, dropdown = dropdown, id = id, options = options, results = results, selection = selection)
  
    __obj.asInstanceOf[Select2]
  }
}

