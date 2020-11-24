package typings.reactNativeWindows.appThemeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighContrastChangedEvent extends js.Object {
  
  var highContrastColors: IHighContrastColors = js.native
  
  var isHighContrast: Boolean = js.native
}
object IHighContrastChangedEvent {
  
  @scala.inline
  def apply(highContrastColors: IHighContrastColors, isHighContrast: Boolean): IHighContrastChangedEvent = {
    val __obj = js.Dynamic.literal(highContrastColors = highContrastColors.asInstanceOf[js.Any], isHighContrast = isHighContrast.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHighContrastChangedEvent]
  }
  
  @scala.inline
  implicit class IHighContrastChangedEventOps[Self <: IHighContrastChangedEvent] (val x: Self) extends AnyVal {
    
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
    def setHighContrastColors(value: IHighContrastColors): Self = this.set("highContrastColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighContrast(value: Boolean): Self = this.set("isHighContrast", value.asInstanceOf[js.Any])
  }
}
