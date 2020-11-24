package typings.reactIntl.componentsRelativeMod

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeUnit
import typings.formatjsIntl.srcTypesMod.CustomFormatConfig
import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/relative-time.IntlRelativeTimeFormatOptions */ @js.native
trait Props extends CustomFormatConfig {
  
  var children: js.UndefOr[js.Function1[/* value */ String, ReactChild]] = js.native
  
  var unit: js.UndefOr[RelativeTimeUnit] = js.native
  
  var updateIntervalInSeconds: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: /* value */ String => ReactChild): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setUnit(value: RelativeTimeUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUpdateIntervalInSeconds(value: Double): Self = this.set("updateIntervalInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateIntervalInSeconds: Self = this.set("updateIntervalInSeconds", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
