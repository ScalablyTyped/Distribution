package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlProps extends SvgProps {
  var `override`: js.UndefOr[SvgProps] = js.native
  var xml: String | Null = js.native
}

object XmlProps {
  @scala.inline
  def apply(): XmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlProps]
  }
  @scala.inline
  implicit class XmlPropsOps[Self <: XmlProps] (val x: Self) extends AnyVal {
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
    def setXml(value: String): Self = this.set("xml", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlNull: Self = this.set("xml", null)
  }
  
}

