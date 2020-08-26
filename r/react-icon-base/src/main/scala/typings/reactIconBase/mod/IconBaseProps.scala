package typings.reactIconBase.mod

import typings.react.mod.ClassAttributes
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconBaseProps
  extends SVGAttributes[ReactSVGElement]
     with ClassAttributes[ReactSVGElement] {
  var size: js.UndefOr[String | Double] = js.native
  @JSName("style")
  var style_IconBaseProps: js.UndefOr[js.Any] = js.native
}

object IconBaseProps {
  @scala.inline
  def apply(): IconBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconBaseProps]
  }
  @scala.inline
  implicit class IconBasePropsOps[Self <: IconBaseProps] (val x: Self) extends AnyVal {
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
    def setSize(value: String | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

