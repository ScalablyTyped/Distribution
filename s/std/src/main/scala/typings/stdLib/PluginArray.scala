package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginArray
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Plugin] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
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

