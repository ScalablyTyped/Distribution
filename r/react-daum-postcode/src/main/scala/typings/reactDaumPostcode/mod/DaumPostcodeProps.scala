package typings.reactDaumPostcode.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaumPostcodeProps extends js.Object {
  var alwaysShowEngAddr: js.UndefOr[Boolean] = js.native
  var animation: js.UndefOr[Boolean] = js.native
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoMapping: js.UndefOr[Boolean] = js.native
  var autoResize: js.UndefOr[Boolean] = js.native
  var defaultQuery: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[ReactElement] = js.native
  var focusContent: js.UndefOr[Boolean] = js.native
  var focusInput: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hideEngBtn: js.UndefOr[Boolean] = js.native
  var hideMapBtn: js.UndefOr[Boolean] = js.native
  var maxSuggestItems: js.UndefOr[Double] = js.native
  var pleaseReadGuide: js.UndefOr[Double] = js.native
  var pleaseReadGuideTimer: js.UndefOr[Double] = js.native
  var scriptUrl: js.UndefOr[String] = js.native
  var shorthand: js.UndefOr[Boolean] = js.native
  var showMoreHName: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var submitMode: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[js.Object] = js.native
  var useSuggest: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var zonecodeOnly: js.UndefOr[Boolean] = js.native
  def onComplete(data: AddressData): Unit = js.native
}

object DaumPostcodeProps {
  @scala.inline
  def apply(onComplete: AddressData => Unit): DaumPostcodeProps = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete))
    __obj.asInstanceOf[DaumPostcodeProps]
  }
  @scala.inline
  implicit class DaumPostcodePropsOps[Self <: DaumPostcodeProps] (val x: Self) extends AnyVal {
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
    def setOnComplete(value: AddressData => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setAlwaysShowEngAddr(value: Boolean): Self = this.set("alwaysShowEngAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowEngAddr: Self = this.set("alwaysShowEngAddr", js.undefined)
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setAutoMapping(value: Boolean): Self = this.set("autoMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMapping: Self = this.set("autoMapping", js.undefined)
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    @scala.inline
    def setDefaultQuery(value: String): Self = this.set("defaultQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultQuery: Self = this.set("defaultQuery", js.undefined)
    @scala.inline
    def setErrorMessage(value: ReactElement): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setFocusContent(value: Boolean): Self = this.set("focusContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusContent: Self = this.set("focusContent", js.undefined)
    @scala.inline
    def setFocusInput(value: Boolean): Self = this.set("focusInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusInput: Self = this.set("focusInput", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideEngBtn(value: Boolean): Self = this.set("hideEngBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEngBtn: Self = this.set("hideEngBtn", js.undefined)
    @scala.inline
    def setHideMapBtn(value: Boolean): Self = this.set("hideMapBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideMapBtn: Self = this.set("hideMapBtn", js.undefined)
    @scala.inline
    def setMaxSuggestItems(value: Double): Self = this.set("maxSuggestItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSuggestItems: Self = this.set("maxSuggestItems", js.undefined)
    @scala.inline
    def setPleaseReadGuide(value: Double): Self = this.set("pleaseReadGuide", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePleaseReadGuide: Self = this.set("pleaseReadGuide", js.undefined)
    @scala.inline
    def setPleaseReadGuideTimer(value: Double): Self = this.set("pleaseReadGuideTimer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePleaseReadGuideTimer: Self = this.set("pleaseReadGuideTimer", js.undefined)
    @scala.inline
    def setScriptUrl(value: String): Self = this.set("scriptUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptUrl: Self = this.set("scriptUrl", js.undefined)
    @scala.inline
    def setShorthand(value: Boolean): Self = this.set("shorthand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShorthand: Self = this.set("shorthand", js.undefined)
    @scala.inline
    def setShowMoreHName(value: Boolean): Self = this.set("showMoreHName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMoreHName: Self = this.set("showMoreHName", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubmitMode(value: Boolean): Self = this.set("submitMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitMode: Self = this.set("submitMode", js.undefined)
    @scala.inline
    def setTheme(value: js.Object): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUseSuggest(value: Boolean): Self = this.set("useSuggest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSuggest: Self = this.set("useSuggest", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZonecodeOnly(value: Boolean): Self = this.set("zonecodeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZonecodeOnly: Self = this.set("zonecodeOnly", js.undefined)
  }
  
}

