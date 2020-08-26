package typings.randomcolor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomColorOptionsMultiple extends RandomColorOptionsSingle {
  var count: Double = js.native
}

object RandomColorOptionsMultiple {
  @scala.inline
  def apply(count: Double): RandomColorOptionsMultiple = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsMultiple]
  }
  @scala.inline
  implicit class RandomColorOptionsMultipleOps[Self <: RandomColorOptionsMultiple] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
  }
  
}

