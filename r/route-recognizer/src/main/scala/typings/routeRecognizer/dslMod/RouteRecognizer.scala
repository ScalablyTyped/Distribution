package typings.routeRecognizer.dslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteRecognizer extends js.Object {
  var delegate: js.UndefOr[Delegate] = js.native
  def add(routes: js.Array[Route]): Unit = js.native
}

object RouteRecognizer {
  @scala.inline
  def apply(add: js.Array[Route] => Unit): RouteRecognizer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[RouteRecognizer]
  }
  @scala.inline
  implicit class RouteRecognizerOps[Self <: RouteRecognizer] (val x: Self) extends AnyVal {
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
    def setAdd(value: js.Array[Route] => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setDelegate(value: Delegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
  }
  
}

