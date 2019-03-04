package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select2 extends js.Object {
  @JSName("$container")
  var $container: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]
  @JSName("$dropdown")
  var $dropdown: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]
  @JSName("$results")
  var $results: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]
  @JSName("$selection")
  var $selection: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement]
  var dropdown: js.Any
  var id: java.lang.String
  var options: select2Lib.Anon_Options
  var results: js.Any
  var selection: js.Any
}

object Select2 {
  @scala.inline
  def apply(
    $container: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement],
    $dropdown: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement],
    $results: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement],
    $selection: select2Lib.select2Mod.Global.JQuery[stdLib.HTMLElement],
    dropdown: js.Any,
    id: java.lang.String,
    options: select2Lib.Anon_Options,
    results: js.Any,
    selection: js.Any
  ): Select2 = {
    val __obj = js.Dynamic.literal($container = $container, $dropdown = $dropdown, $results = $results, $selection = $selection, dropdown = dropdown, id = id, options = options, results = results, selection = selection)
  
    __obj.asInstanceOf[Select2]
  }
}

