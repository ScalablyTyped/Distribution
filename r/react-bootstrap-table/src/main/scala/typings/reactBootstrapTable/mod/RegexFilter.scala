package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexFilter extends _Filter {
  /**
    * Default value
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Filter type must be 'RegexFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter = js.native
}

object RegexFilter {
  @scala.inline
  def apply(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): RegexFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexFilter]
  }
  @scala.inline
  implicit class RegexFilterOps[Self <: RegexFilter] (val x: Self) extends AnyVal {
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
    def setType(value: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

