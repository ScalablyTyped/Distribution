package typings.primereact.passwordMod

import org.scalablytyped.runtime.StringDictionary
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordProps
  extends AllHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement]
     with /* key */ StringDictionary[js.Any] {
  var feedback: js.UndefOr[Boolean] = js.native
  var mediumLabel: js.UndefOr[String] = js.native
  var promptLabel: js.UndefOr[String] = js.native
  var strongLabel: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var weakLabel: js.UndefOr[String] = js.native
}

object PasswordProps {
  @scala.inline
  def apply(): PasswordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProps]
  }
  @scala.inline
  implicit class PasswordPropsOps[Self <: PasswordProps] (val x: Self) extends AnyVal {
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
    def setFeedback(value: Boolean): Self = this.set("feedback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedback: Self = this.set("feedback", js.undefined)
    @scala.inline
    def setMediumLabel(value: String): Self = this.set("mediumLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediumLabel: Self = this.set("mediumLabel", js.undefined)
    @scala.inline
    def setPromptLabel(value: String): Self = this.set("promptLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptLabel: Self = this.set("promptLabel", js.undefined)
    @scala.inline
    def setStrongLabel(value: String): Self = this.set("strongLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrongLabel: Self = this.set("strongLabel", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    @scala.inline
    def setWeakLabel(value: String): Self = this.set("weakLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeakLabel: Self = this.set("weakLabel", js.undefined)
  }
  
}

