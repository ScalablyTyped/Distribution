package typings.rcUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockRestore extends js.Object {
  def mockRestore(): Unit = js.native
}

object MockRestore {
  @scala.inline
  def apply(mockRestore: () => Unit): MockRestore = {
    val __obj = js.Dynamic.literal(mockRestore = js.Any.fromFunction0(mockRestore))
    __obj.asInstanceOf[MockRestore]
  }
  @scala.inline
  implicit class MockRestoreOps[Self <: MockRestore] (val x: Self) extends AnyVal {
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
    def setMockRestore(value: () => Unit): Self = this.set("mockRestore", js.Any.fromFunction0(value))
  }
  
}

