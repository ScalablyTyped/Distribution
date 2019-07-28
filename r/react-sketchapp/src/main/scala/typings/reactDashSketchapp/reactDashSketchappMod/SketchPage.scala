package typings.reactDashSketchapp.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchPage extends js.Object {
  def name(): js.Any
}

object SketchPage {
  @scala.inline
  def apply(name: () => js.Any): SketchPage = {
    val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name))
  
    __obj.asInstanceOf[SketchPage]
  }
}

