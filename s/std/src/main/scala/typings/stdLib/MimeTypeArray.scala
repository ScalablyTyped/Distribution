package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MimeTypeArray interface returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes. */
trait MimeTypeArray
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Plugin] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Plugin]]
  val length: scala.Double
  def item(index: scala.Double): Plugin
  def namedItem(`type`: java.lang.String): Plugin
}

@JSGlobal("MimeTypeArray")
@js.native
class MimeTypeArrayCls () extends MimeTypeArray {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[Plugin]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): Plugin = js.native
  /* CompleteClass */
  override def namedItem(`type`: java.lang.String): Plugin = js.native
}

@JSGlobal("MimeTypeArray")
@js.native
object MimeTypeArray
  extends org.scalablytyped.runtime.Instantiable0[MimeTypeArray]

