package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRectList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[ClientRect] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[ClientRect]]
  val length: scala.Double
  def item(index: scala.Double): ClientRect
}

@JSGlobal("ClientRectList")
@js.native
class ClientRectListCls () extends ClientRectList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[ClientRect]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): ClientRect = js.native
}

@JSGlobal("ClientRectList")
@js.native
object ClientRectList
  extends org.scalablytyped.runtime.Instantiable0[ClientRectList]

