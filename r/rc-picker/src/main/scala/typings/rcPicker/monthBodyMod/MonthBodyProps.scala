package typings.rcPicker.monthBodyMod

import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Locale
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthBodyProps[DateType] extends js.Object {
  
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
  
  var generateConfig: GenerateConfig[DateType] = js.native
  
  var locale: Locale = js.native
  
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  
  def onSelect(value: DateType): Unit = js.native
  
  var prefixCls: String = js.native
  
  var value: js.UndefOr[DateType | Null] = js.native
  
  var viewDate: DateType = js.native
}
object MonthBodyProps {
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: DateType => Unit,
    prefixCls: String,
    viewDate: DateType
  ): MonthBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthBodyProps[DateType]]
  }
  
  @scala.inline
  implicit class MonthBodyPropsOps[Self <: MonthBodyProps[_], DateType] (val x: Self with MonthBodyProps[DateType]) extends AnyVal {
    
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
    def setOnSelect(value: DateType => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDate(value: DateType): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDate(value: /* date */ DateType => Boolean): Self = this.set("disabledDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("disabledDate", js.undefined)
    
    @scala.inline
    def setMonthCellRender(value: (DateType, /* locale */ Locale) => ReactNode): Self = this.set("monthCellRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMonthCellRender: Self = this.set("monthCellRender", js.undefined)
    
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
