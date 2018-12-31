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
object TextTrackCueList
  extends org.scalablytyped.runtime.Instantiable0[TextTrackCueList]

