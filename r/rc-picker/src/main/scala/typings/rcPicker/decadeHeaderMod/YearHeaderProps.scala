package typings.rcPicker.decadeHeaderMod

import typings.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YearHeaderProps[DateType] extends js.Object {
  
  var generateConfig: GenerateConfig[DateType] = js.native
  
  def onNextDecades(): Unit = js.native
  
  def onPrevDecades(): Unit = js.native
  
  var prefixCls: String = js.native
  
  var viewDate: DateType = js.native
}
object YearHeaderProps {
  
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onNextDecades: () => Unit,
    onPrevDecades: () => Unit,
    prefixCls: String,
    viewDate: DateType
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], onNextDecades = js.Any.fromFunction0(onNextDecades), onPrevDecades = js.Any.fromFunction0(onPrevDecades), prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
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
    def setOnNextDecades(value: () => Unit): Self = this.set("onNextDecades", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrevDecades(value: () => Unit): Self = this.set("onPrevDecades", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDate(value: DateType): Self = this.set("viewDate", value.asInstanceOf[js.Any])
  }
}
