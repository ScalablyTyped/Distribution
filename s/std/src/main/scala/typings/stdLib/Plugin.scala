package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[MimeType] {
  val description: java.lang.String
  val filename: java.lang.String
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[MimeType]]
  val length: scala.Double
  val name: java.lang.String
  val version: java.lang.String
  def item(index: scala.Double): MimeType
  def namedItem(`type`: java.lang.String): MimeType
}

@JSGlobal("Plugin")
@js.native
object Plugin
  extends org.scalablytyped.runtime.Instantiable0[Plugin]

