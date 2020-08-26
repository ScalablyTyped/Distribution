package typings.reactMdBadge.badgeMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps extends HTMLAttributes[HTMLSpanElement] {
  /**
    * Boolean if the badge should still display if the children is set to `0`, or
    * `null`.  The default behavior is to render null for these cases since it
    * isn't extremely helpful to display an "empty" badge.
    */
  var disableNullOnZero: js.UndefOr[Boolean] = js.native
  /**
    * The id for the badge. This is required for a11y since the element that the
    * badge is fixed to should include this id in the `aria-describedby` list.
    */
  @JSName("id")
  var id_BadgeProps: String = js.native
  /**
    * The theme to use for the badge.
    */
  var theme: js.UndefOr[BadgeTheme] = js.native
}

object BadgeProps {
  @scala.inline
  def apply(id: String): BadgeProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
  @scala.inline
  implicit class BadgePropsOps[Self <: BadgeProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableNullOnZero(value: Boolean): Self = this.set("disableNullOnZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableNullOnZero: Self = this.set("disableNullOnZero", js.undefined)
    @scala.inline
    def setTheme(value: BadgeTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

