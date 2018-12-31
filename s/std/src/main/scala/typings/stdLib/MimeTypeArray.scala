package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object MimeTypeArray
  extends org.scalablytyped.runtime.Instantiable0[MimeTypeArray]

