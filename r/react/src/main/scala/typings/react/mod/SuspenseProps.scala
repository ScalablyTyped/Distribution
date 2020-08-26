package typings.react.mod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuspenseProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[ReactNode] | Null = js.native
}

object SuspenseProps {
  @scala.inline
  def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  @scala.inline
  implicit class SuspensePropsOps[Self <: SuspenseProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFallback(value: NonNullable[ReactNode]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackNull: Self = this.set("fallback", null)
  }
  
}

