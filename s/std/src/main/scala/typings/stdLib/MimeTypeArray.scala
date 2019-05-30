package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes. */
@js.native
trait MimeTypeArray
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Plugin] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): Plugin = js.native
  def namedItem(`type`: java.lang.String): Plugin = js.native
}

@JSGlobal("MimeTypeArray")
@js.native
class MimeTypeArrayCls () extends MimeTypeArray

@JSGlobal("MimeTypeArray")
@js.native
object MimeTypeArray
  extends org.scalablytyped.runtime.Instantiable0[MimeTypeArray]

