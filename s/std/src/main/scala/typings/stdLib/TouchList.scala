package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TouchList interface represents a list of contact points with a touch surface; for example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries. */
trait TouchList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Touch] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Touch]]
  val length: scala.Double
  def item(index: scala.Double): Touch | scala.Null
}

@JSGlobal("TouchList")
@js.native
class TouchListCls () extends TouchList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[Touch]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): Touch | scala.Null = js.native
}

@JSGlobal("TouchList")
@js.native
object TouchList
  extends org.scalablytyped.runtime.Instantiable0[TouchList]

