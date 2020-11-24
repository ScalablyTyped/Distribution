package typings.rcPicker.yearHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YearHeaderProps[DateType] extends js.Object {
  
  var generateConfig: GenerateConfig[DateType] = js.native
  
  def onDecadeClick(): Unit = js.native
  
  def onNextDecade(): Unit = js.native
  
  def onPrevDecade(): Unit = js.native
  
  var prefixCls: String = js.native
  
  var value: js.UndefOr[DateType | Null] = js.native
  
  var viewDate: DateType = js.native
}
object YearHeaderProps {
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onDecadeClick: () => Unit,
    onNextDecade: () => Unit,
    onPrevDecade: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onDecadeClick = js.Any.fromFunction0(onDecadeClick), onNextDecade = js.Any.fromFunction0(onNextDecade), onPrevDecade = js.Any.fromFunction0(onPrevDecade), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
  
  @scala.inline
  implicit class YearHeaderPropsOps[Self <: YearHeaderProps[_], DateType] (val x: Self with YearHeaderProps[DateType]) extends AnyVal {
    
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
    def setOnDecadeClick(value: () => Unit): Self = this.set("onDecadeClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNextDecade(value: () => Unit): Self = this.set("onNextDecade", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrevDecade(value: () => Unit): Self = this.set("onPrevDecade", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDate(value: DateType): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DateType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
