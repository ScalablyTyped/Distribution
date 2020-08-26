package typings.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondHookProps extends js.Object {
  var beforeRemoveFile: js.UndefOr[js.Function1[/* file */ File, Boolean]] = js.native
}

object FilePondHookProps {
  @scala.inline
  def apply(): FilePondHookProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondHookProps]
  }
  @scala.inline
  implicit class FilePondHookPropsOps[Self <: FilePondHookProps] (val x: Self) extends AnyVal {
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
    def setBeforeRemoveFile(value: /* file */ File => Boolean): Self = this.set("beforeRemoveFile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeRemoveFile: Self = this.set("beforeRemoveFile", js.undefined)
  }
  
}

