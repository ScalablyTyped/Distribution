package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a browser plugin. */
@js.native
trait Plugin
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[MimeType] {
  val description: java.lang.String = js.native
  val filename: java.lang.String = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  val length: scala.Double = js.native
  val name: java.lang.String = js.native
  val version: java.lang.String = js.native
  def item(index: scala.Double): MimeType = js.native
  def namedItem(`type`: java.lang.String): MimeType = js.native
}

@JSGlobal("Plugin")
@js.native
class PluginCls () extends Plugin

@JSGlobal("Plugin")
@js.native
object Plugin
  extends org.scalablytyped.runtime.Instantiable0[Plugin]

