package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriProps extends SvgProps {
  var `override`: js.UndefOr[SvgProps] = js.native
  var uri: String | Null = js.native
}

object UriProps {
  @scala.inline
  def apply(): UriProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriProps]
  }
  @scala.inline
  implicit class UriPropsOps[Self <: UriProps] (val x: Self) extends AnyVal {
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
    def setOverride(value: SvgProps): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setUriNull: Self = this.set("uri", null)
  }
  
}

