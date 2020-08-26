package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footer extends js.Object {
  var Footer: Double = js.native
  var Loading: Double = js.native
  var Option: Double = js.native
  var Separator: Double = js.native
}

object Footer {
  @scala.inline
  def apply(Footer: Double, Loading: Double, Option: Double, Separator: Double): Footer = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footer]
  }
  @scala.inline
  implicit class FooterOps[Self <: Footer] (val x: Self) extends AnyVal {
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
    def setFooter(value: Double): Self = this.set("Footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Double): Self = this.set("Loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setOption(value: Double): Self = this.set("Option", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparator(value: Double): Self = this.set("Separator", value.asInstanceOf[js.Any])
  }
  
}

