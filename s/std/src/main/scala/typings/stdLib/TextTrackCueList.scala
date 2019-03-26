package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackCueList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[TextTrackCue] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrackCue]]
  val length: scala.Double
  def getCueById(id: java.lang.String): TextTrackCue
  def item(index: scala.Double): TextTrackCue
}

@JSGlobal("TextTrackCueList")
@js.native
class TextTrackCueListCls () extends TextTrackCueList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[TextTrackCue]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def getCueById(id: java.lang.String): TextTrackCue = js.native
  /* CompleteClass */
  override def item(index: scala.Double): TextTrackCue = js.native
}

@JSGlobal("TextTrackCueList")
@js.native
object TextTrackCueList
  extends org.scalablytyped.runtime.Instantiable0[TextTrackCueList]

