package typings.reactstrap.inputGroupAddonMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputGroupAddonProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var addonType: prepend | append = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object InputGroupAddonProps {
  @scala.inline
  def apply(addonType: prepend | append): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupAddonProps]
  }
  @scala.inline
  implicit class InputGroupAddonPropsOps[Self <: InputGroupAddonProps] (val x: Self) extends AnyVal {
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
    def setAddonType(value: prepend | append): Self = this.set("addonType", value.asInstanceOf[js.Any])
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

