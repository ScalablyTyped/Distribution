package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondErrorDescription extends js.Object {
  var main: String = js.native
  var sub: String = js.native
}

object FilePondErrorDescription {
  @scala.inline
  def apply(main: String, sub: String): FilePondErrorDescription = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePondErrorDescription]
  }
  @scala.inline
  implicit class FilePondErrorDescriptionOps[Self <: FilePondErrorDescription] (val x: Self) extends AnyVal {
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
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
  }
  
}

