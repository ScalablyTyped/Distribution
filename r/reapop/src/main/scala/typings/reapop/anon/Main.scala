package typings.reapop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Main extends js.Object {
  var main: js.UndefOr[String] = js.native
  var position: js.UndefOr[js.Function1[/* position */ String, String]] = js.native
}

object Main {
  @scala.inline
  def apply(): Main = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Main]
  }
  @scala.inline
  implicit class MainOps[Self <: Main] (val x: Self) extends AnyVal {
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
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    @scala.inline
    def setPosition(value: /* position */ String => String): Self = this.set("position", js.Any.fromFunction1(value))
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

