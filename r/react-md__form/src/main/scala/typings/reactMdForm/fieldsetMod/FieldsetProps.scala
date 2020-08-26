package typings.reactMdForm.fieldsetMod

import typings.react.mod.CSSProperties
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLFieldSetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsetProps extends FieldsetHTMLAttributes[HTMLFieldSetElement] {
  /**
    * The legend to display. This is required since a fieldset loses most of its'
    * benefit for accessibility without a legend.
    */
  var legend: ReactNode = js.native
  /**
    * An optional classname to apply to the legend.
    */
  var legendClassName: js.UndefOr[String] = js.native
  /**
    * Boolean if the legend should only be styled to be visible for screen
    * readers.
    */
  var legendSROnly: js.UndefOr[Boolean] = js.native
  /**
    * An optional style to apply to the legend element.
    */
  var legendStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Boolean if the fieldset should remove the default browser styles of margin,
    * padding, and border.
    */
  var unstyled: js.UndefOr[Boolean] = js.native
}

object FieldsetProps {
  @scala.inline
  def apply(): FieldsetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsetProps]
  }
  @scala.inline
  implicit class FieldsetPropsOps[Self <: FieldsetProps] (val x: Self) extends AnyVal {
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
    def setLegend(value: ReactNode): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLegendClassName(value: String): Self = this.set("legendClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendClassName: Self = this.set("legendClassName", js.undefined)
    @scala.inline
    def setLegendSROnly(value: Boolean): Self = this.set("legendSROnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendSROnly: Self = this.set("legendSROnly", js.undefined)
    @scala.inline
    def setLegendStyle(value: CSSProperties): Self = this.set("legendStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendStyle: Self = this.set("legendStyle", js.undefined)
    @scala.inline
    def setUnstyled(value: Boolean): Self = this.set("unstyled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnstyled: Self = this.set("unstyled", js.undefined)
  }
  
}

