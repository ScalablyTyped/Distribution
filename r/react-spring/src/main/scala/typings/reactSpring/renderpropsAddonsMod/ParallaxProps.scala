package typings.reactSpring.renderpropsAddonsMod

import typings.react.mod.Ref
import typings.reactSpring.renderpropsUniversalMod.SpringConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallaxProps extends js.Object {
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ String, SpringConfig])] = js.native
  var horizontal: js.UndefOr[Boolean] = js.native
  var pages: Double = js.native
  var ref: js.UndefOr[Ref[Parallax]] = js.native
  var scrolling: js.UndefOr[Boolean] = js.native
}

object ParallaxProps {
  @scala.inline
  def apply(pages: Double): ParallaxProps = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxProps]
  }
  @scala.inline
  implicit class ParallaxPropsOps[Self <: ParallaxProps] (val x: Self) extends AnyVal {
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
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFunction1(value: /* key */ String => SpringConfig): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ Parallax | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[Parallax]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setScrolling(value: Boolean): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
  }
  
}

