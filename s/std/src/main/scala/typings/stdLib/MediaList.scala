package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[java.lang.String]]
  val length: scala.Double
  var mediaText: java.lang.String
  def appendMedium(medium: java.lang.String): scala.Unit
  def deleteMedium(medium: java.lang.String): scala.Unit
  def item(index: scala.Double): java.lang.String | scala.Null
}

@JSGlobal("MediaList")
@js.native
class MediaListCls () extends MediaList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[java.lang.String]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override var mediaText: java.lang.String = js.native
  /* CompleteClass */
  override def appendMedium(medium: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def deleteMedium(medium: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def item(index: scala.Double): java.lang.String | scala.Null = js.native
}

@JSGlobal("MediaList")
@js.native
object MediaList
  extends org.scalablytyped.runtime.Instantiable0[MediaList]

