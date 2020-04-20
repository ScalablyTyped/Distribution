package typings.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPage extends js.Object {
  def layers(): js.Array[SketchLayer]
  def name(): NSString
  def setName(name: String): Unit
}

object SketchPage {
  @scala.inline
  def apply(layers: () => js.Array[SketchLayer], name: () => NSString, setName: String => Unit): SketchPage = {
    val __obj = js.Dynamic.literal(layers = js.Any.fromFunction0(layers), name = js.Any.fromFunction0(name), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SketchPage]
  }
}

