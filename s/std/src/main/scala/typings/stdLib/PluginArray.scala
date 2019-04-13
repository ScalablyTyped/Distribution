package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The PluginArray interface is used to store a list of Plugin objects describing the available plugins; it's returned by the window.navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem("name") methods. */
@js.native
trait PluginArray
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Plugin] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): Plugin = js.native
  def namedItem(name: java.lang.String): Plugin = js.native
  def refresh(): scala.Unit = js.native
  def refresh(reload: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("PluginArray")
@js.native
class PluginArrayCls () extends PluginArray

@JSGlobal("PluginArray")
@js.native
object PluginArray
  extends org.scalablytyped.runtime.Instantiable0[PluginArray]

