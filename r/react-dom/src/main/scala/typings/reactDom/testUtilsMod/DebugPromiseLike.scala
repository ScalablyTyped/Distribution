package typings.reactDom.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugPromiseLike extends js.Object {
  // the actual then() in here is 0-ary, but that doesn't count as a PromiseLike.
  def `then`(
    onfulfilled: js.Function1[/* value */ scala.Nothing, scala.Nothing],
    onrejected: js.Function1[/* reason */ scala.Nothing, scala.Nothing]
  ): scala.Nothing = js.native
}

object DebugPromiseLike {
  @scala.inline
  def apply(
    `then`: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
  ): DebugPromiseLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[DebugPromiseLike]
  }
  @scala.inline
  implicit class DebugPromiseLikeOps[Self <: DebugPromiseLike] (val x: Self) extends AnyVal {
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
    def setThen(
      value: (js.Function1[/* value */ scala.Nothing, scala.Nothing], js.Function1[/* reason */ scala.Nothing, scala.Nothing]) => scala.Nothing
    ): Self = this.set("then", js.Any.fromFunction2(value))
  }
  
}

