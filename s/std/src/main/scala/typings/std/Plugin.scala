package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a browser plugin. */
@js.native
trait Plugin extends /* index */ NumberDictionary[MimeType] {
  /**
    * Returns the plugin's description.
    */
  val description: java.lang.String = js.native
  /**
    * Returns the plugin library's filename, if applicable on the current platform.
    */
  val filename: java.lang.String = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  /**
    * Returns the number of MIME types, represented by MimeType objects, supported by the plugin.
    */
  val length: Double = js.native
  /**
    * Returns the plugin's name.
    */
  val name: java.lang.String = js.native
  /**
    * Returns the specified MimeType object.
    */
  def item(index: Double): MimeType | Null = js.native
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}

@JSGlobal("Plugin")
@js.native
class PluginCls () extends Plugin

@JSGlobal("Plugin")
@js.native
object Plugin extends Instantiable0[Plugin]

