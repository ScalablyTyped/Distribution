package typings.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomShapes extends js.Object {
  def init(sigma: Sigma): Unit = js.native
}

object CustomShapes {
  @scala.inline
  def apply(init: Sigma => Unit): CustomShapes = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[CustomShapes]
  }
  @scala.inline
  implicit class CustomShapesOps[Self <: CustomShapes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInit(value: Sigma => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
  
}

