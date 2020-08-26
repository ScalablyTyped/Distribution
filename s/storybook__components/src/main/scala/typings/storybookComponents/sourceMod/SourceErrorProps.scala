package typings.storybookComponents.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceErrorProps extends js.Object {
  var error: js.UndefOr[SourceError] = js.native
}

object SourceErrorProps {
  @scala.inline
  def apply(): SourceErrorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceErrorProps]
  }
  @scala.inline
  implicit class SourceErrorPropsOps[Self <: SourceErrorProps] (val x: Self) extends AnyVal {
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
    def setError(value: SourceError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

