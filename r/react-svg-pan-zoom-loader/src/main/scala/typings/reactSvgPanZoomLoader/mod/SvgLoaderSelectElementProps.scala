package typings.reactSvgPanZoomLoader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgLoaderSelectElementProps
  extends /* prop */ StringDictionary[js.Any] {
  var children: js.UndefOr[String] = js.native
  var selector: String = js.native
}

object SvgLoaderSelectElementProps {
  @scala.inline
  def apply(selector: String): SvgLoaderSelectElementProps = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgLoaderSelectElementProps]
  }
  @scala.inline
  implicit class SvgLoaderSelectElementPropsOps[Self <: SvgLoaderSelectElementProps] (val x: Self) extends AnyVal {
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: String): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

