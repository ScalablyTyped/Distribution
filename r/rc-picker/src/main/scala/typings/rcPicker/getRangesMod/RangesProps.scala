package typings.rcPicker.getRangesMod

import typings.rcPicker.anon.Label
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.RangeList
import typings.rcPicker.rcPickerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangesProps extends js.Object {
  
  var components: js.UndefOr[Components] = js.native
  
  var locale: Locale = js.native
  
  var needConfirmButton: Boolean = js.native
  
  var okDisabled: js.UndefOr[Boolean] = js.native
  
  var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
  
  var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
  
  var prefixCls: String = js.native
  
  var rangeList: js.UndefOr[RangeList] = js.native
  
  var showNow: js.UndefOr[Boolean] = js.native
}
object RangesProps {
  
  @scala.inline
  def apply(locale: Locale, needConfirmButton: Boolean, prefixCls: String): RangesProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangesProps]
  }
  
  @scala.inline
  implicit class RangesPropsOps[Self <: RangesProps] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedConfirmButton(value: Boolean): Self = this.set("needConfirmButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setOkDisabled(value: Boolean): Self = this.set("okDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkDisabled: Self = this.set("okDisabled", js.undefined)
    
    @scala.inline
    def setOnNowFunction0(value: () => Unit): Self = this.set("onNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNow(value: js.Function0[Unit] | `false`): Self = this.set("onNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnNow: Self = this.set("onNow", js.undefined)
    
    @scala.inline
    def setOnNowNull: Self = this.set("onNow", null)
    
    @scala.inline
    def setOnOkFunction0(value: () => Unit): Self = this.set("onOk", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOk(value: js.Function0[Unit] | `false`): Self = this.set("onOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    
    @scala.inline
    def setOnOkNull: Self = this.set("onOk", null)
    
    @scala.inline
    def setRangeListVarargs(value: Label*): Self = this.set("rangeList", js.Array(value :_*))
    
    @scala.inline
    def setRangeList(value: RangeList): Self = this.set("rangeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeList: Self = this.set("rangeList", js.undefined)
    
    @scala.inline
    def setShowNow(value: Boolean): Self = this.set("showNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNow: Self = this.set("showNow", js.undefined)
  }
}
