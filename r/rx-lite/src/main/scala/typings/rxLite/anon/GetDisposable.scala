package typings.rxLite.anon

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDisposable extends js.Object {
  def getDisposable(): IDisposable = js.native
}

object GetDisposable {
  @scala.inline
  def apply(getDisposable: () => IDisposable): GetDisposable = {
    val __obj = js.Dynamic.literal(getDisposable = js.Any.fromFunction0(getDisposable))
    __obj.asInstanceOf[GetDisposable]
  }
  @scala.inline
  implicit class GetDisposableOps[Self <: GetDisposable] (val x: Self) extends AnyVal {
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
    def setGetDisposable(value: () => IDisposable): Self = this.set("getDisposable", js.Any.fromFunction0(value))
  }
  
}

