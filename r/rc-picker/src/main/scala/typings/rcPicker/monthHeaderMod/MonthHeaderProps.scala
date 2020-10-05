package typings.rcPicker.monthHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType] = js.native
  var locale: Locale = js.native
  var prefixCls: String = js.native
  var viewDate: DateType = js.native
  def onNextYear(): Unit = js.native
  def onPrevYear(): Unit = js.native
  def onYearClick(): Unit = js.native
}

object MonthHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onNextYear: () => Unit,
    onPrevYear: () => Unit,
    onYearClick: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): MonthHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onNextYear = js.Any.fromFunction0(onNextYear), onPrevYear = js.Any.fromFunction0(onPrevYear), onYearClick = js.Any.fromFunction0(onYearClick), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthHeaderProps[DateType]]
  }
  @scala.inline
  implicit class MonthHeaderPropsOps[Self <: MonthHeaderProps[_], DateType] (val x: Self with MonthHeaderProps[DateType]) extends AnyVal {
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
    def setGenerateConfig(value: GenerateConfig[DateType]): Self = this.set("generateConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnNextYear(value: () => Unit): Self = this.set("onNextYear", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPrevYear(value: () => Unit): Self = this.set("onPrevYear", js.Any.fromFunction0(value))
    @scala.inline
    def setOnYearClick(value: () => Unit): Self = this.set("onYearClick", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewDate(value: DateType): Self = this.set("viewDate", value.asInstanceOf[js.Any])
  }
  
}

