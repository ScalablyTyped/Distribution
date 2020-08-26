package typings.reactFadeIn.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FadeInProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  /**
    * Default: 50. Delay between each child's animation in milliseconds.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Default: 400. Duration of each child's animation in milliseconds.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
}

object FadeInProps {
  @scala.inline
  def apply(): FadeInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FadeInProps]
  }
  @scala.inline
  implicit class FadeInPropsOps[Self <: FadeInProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
  
}

