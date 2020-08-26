package typings.rcSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
  var options: OptionsType = js.native
}

object Options {
  @scala.inline
  def apply[/* <: js.Array[js.Object] */ OptionsType](options: OptionsType): Options[OptionsType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[OptionsType]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], /* <: js.Array[js.Object] */ OptionsType] (val x: Self with Options[OptionsType]) extends AnyVal {
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
    def setOptions(value: OptionsType): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

