package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounces extends js.Object {
  var bounces: Boolean = js.native
}

object Bounces {
  @scala.inline
  def apply(bounces: Boolean): Bounces = {
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounces]
  }
  @scala.inline
  implicit class BouncesOps[Self <: Bounces] (val x: Self) extends AnyVal {
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
    def setBounces(value: Boolean): Self = this.set("bounces", value.asInstanceOf[js.Any])
  }
  
}

