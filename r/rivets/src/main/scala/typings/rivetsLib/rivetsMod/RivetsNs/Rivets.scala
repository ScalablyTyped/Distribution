package typings
package rivetsLib.rivetsMod.RivetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rivets extends js.Object {
  // Global sightglass adapters.
  var adapters: js.Object = js.native
  // Global binders.
  var binders: js.Object = js.native
  // Global components.
  var components: js.Object = js.native
  // Global formatters.
  var formatters: js.Object = js.native
  // Default attribute prefix.
  var prefix: java.lang.String = js.native
  // Preload data by default.
  var preloadData: scala.Boolean = js.native
  // Default sightglass root interface.
  var rootInterface: java.lang.String = js.native
  // Default template delimiters.
  var templateDelimiters: js.Array[java.lang.String] = js.native
  def bind(element: jqueryLib.JQuery[stdLib.HTMLElement], models: js.Object): View = js.native
  def bind(element: jqueryLib.JQuery[stdLib.HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: js.Array[stdLib.HTMLElement], models: js.Object): View = js.native
  def bind(element: js.Array[stdLib.HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: stdLib.HTMLElement, models: js.Object): View = js.native
  def bind(element: stdLib.HTMLElement, models: js.Object, options: js.Object): View = js.native
  def configure(): scala.Unit = js.native
  def configure(options: rivetsLib.Anon_Biding): scala.Unit = js.native
  def handler(context: js.Any, ev: stdLib.Event, biding: js.Any): scala.Unit = js.native
}

