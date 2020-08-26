package typings.reactFlex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonFlexProps extends js.Object {
  /**
    * A value for the `align-content` css property.
    */
  var alignContent: js.UndefOr[String] = js.native
  /**
    * A value for the `align-items` css property. Defaults to `'center'`.
    */
  var alignItems: js.UndefOr[String] = js.native
  /**
    * For `flex-direction: column`.
    */
  var column: js.UndefOr[Boolean] = js.native
  /**
    * Customize the display to be `'flex'` or `'inline-flex'`.
    * Defaults to `'flex'`.
    */
  var display: js.UndefOr[String] = js.native
  /**
    * A number/string from 0 to 24 for the `flex` css property. `false` for `'none'`.
    */
  var flex: js.UndefOr[Double | String | Boolean] = js.native
  /**
    * For `display: inline-flex`.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /**
    * A value for the `justify-content` css property.
    */
  var justifyContent: js.UndefOr[String] = js.native
  /**
    * For reverse direction (eg. `flex-direction: column-reverse` or `row-reverse`).
    */
  var reverse: js.UndefOr[Boolean] = js.native
  /**
    * For `flex-direction: row`. Defaults to `true`.
    */
  var row: js.UndefOr[Boolean] = js.native
  /**
    * For custom style
    */
  var style: js.UndefOr[js.Any] = js.native
  /**
    * For `flex-wrap: wrap`. Defaults to `true`.
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object CommonFlexProps {
  @scala.inline
  def apply(): CommonFlexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonFlexProps]
  }
  @scala.inline
  implicit class CommonFlexPropsOps[Self <: CommonFlexProps] (val x: Self) extends AnyVal {
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
    def setAlignContent(value: String): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignItems(value: String): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setColumn(value: Boolean): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFlex(value: Double | String | Boolean): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setJustifyContent(value: String): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setRow(value: Boolean): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

