package typings.reactCoinhive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authedmine extends js.Object {
  var authedmine: String = js.native
  var coinhive: String = js.native
}

object Authedmine {
  @scala.inline
  def apply(authedmine: String, coinhive: String): Authedmine = {
    val __obj = js.Dynamic.literal(authedmine = authedmine.asInstanceOf[js.Any], coinhive = coinhive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authedmine]
  }
  @scala.inline
  implicit class AuthedmineOps[Self <: Authedmine] (val x: Self) extends AnyVal {
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
    def setAuthedmine(value: String): Self = this.set("authedmine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoinhive(value: String): Self = this.set("coinhive", value.asInstanceOf[js.Any])
  }
  
}

