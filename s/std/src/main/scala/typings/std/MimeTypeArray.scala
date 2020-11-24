package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes. */
@js.native
trait MimeTypeArray extends /* index */ NumberDictionary[MimeType] {
  
  def item(index: Double): MimeType | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]] = js.native
  
  val length: Double = js.native
  
  def namedItem(name: java.lang.String): MimeType | Null = js.native
}
