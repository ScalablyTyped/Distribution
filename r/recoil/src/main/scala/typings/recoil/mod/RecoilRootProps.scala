package typings.recoil.mod

import typings.recoil.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecoilRootProps extends js.Object {
  var initializeState: js.UndefOr[js.Function1[/* options */ Set, Unit]] = js.native
}

object RecoilRootProps {
  @scala.inline
  def apply(): RecoilRootProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoilRootProps]
  }
  @scala.inline
  implicit class RecoilRootPropsOps[Self <: RecoilRootProps] (val x: Self) extends AnyVal {
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
    def setInitializeState(value: /* options */ Set => Unit): Self = this.set("initializeState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitializeState: Self = this.set("initializeState", js.undefined)
  }
  
}

