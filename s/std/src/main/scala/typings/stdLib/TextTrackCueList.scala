package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCueList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[TextTrackCue] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrackCue]] = js.native
  val length: scala.Double = js.native
  def getCueById(id: java.lang.String): TextTrackCue = js.native
  def item(index: scala.Double): TextTrackCue = js.native
}

@JSGlobal("TextTrackCueList")
@js.native
class TextTrackCueListCls () extends TextTrackCueList

@JSGlobal("TextTrackCueList")
@js.native
object TextTrackCueList
  extends org.scalablytyped.runtime.Instantiable0[TextTrackCueList]

