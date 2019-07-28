package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCueList extends /* index */ NumberDictionary[TextTrackCue] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrackCue]] = js.native
  val length: Double = js.native
  def getCueById(id: java.lang.String): TextTrackCue = js.native
  def item(index: Double): TextTrackCue = js.native
}

@JSGlobal("TextTrackCueList")
@js.native
class TextTrackCueListCls () extends TextTrackCueList

@JSGlobal("TextTrackCueList")
@js.native
object TextTrackCueList extends Instantiable0[TextTrackCueList]

