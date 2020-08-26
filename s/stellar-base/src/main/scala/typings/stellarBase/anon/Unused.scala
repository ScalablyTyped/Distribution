package typings.stellarBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unused extends js.Object {
  var unused: Double = js.native
}

object Unused {
  @scala.inline
  def apply(unused: Double): Unused = {
    val __obj = js.Dynamic.literal(unused = unused.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unused]
  }
  @scala.inline
  implicit class UnusedOps[Self <: Unused] (val x: Self) extends AnyVal {
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
    def setUnused(value: Double): Self = this.set("unused", value.asInstanceOf[js.Any])
  }
  
}

