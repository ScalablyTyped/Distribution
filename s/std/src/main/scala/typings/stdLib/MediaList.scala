package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  val length: scala.Double = js.native
  var mediaText: java.lang.String = js.native
  def appendMedium(medium: java.lang.String): scala.Unit = js.native
  def deleteMedium(medium: java.lang.String): scala.Unit = js.native
  def item(index: scala.Double): java.lang.String | scala.Null = js.native
}

@JSGlobal("MediaList")
@js.native
class MediaListCls () extends MediaList

@JSGlobal("MediaList")
@js.native
object MediaList
  extends org.scalablytyped.runtime.Instantiable0[MediaList]

