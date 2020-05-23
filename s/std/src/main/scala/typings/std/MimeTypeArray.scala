package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes. */
@js.native
trait MimeTypeArray extends /* index */ NumberDictionary[MimeType] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  val length: Double = js.native
  def item(index: Double): MimeType | Null = js.native
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}

