package typings.reactstrap.tabContentMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabContentProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeTab: js.UndefOr[Double | String] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object TabContentProps {
  @scala.inline
  def apply(): TabContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabContentProps]
  }
  @scala.inline
  implicit class TabContentPropsOps[Self <: TabContentProps] (val x: Self) extends AnyVal {
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
    def setActiveTab(value: Double | String): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveTab: Self = this.set("activeTab", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

