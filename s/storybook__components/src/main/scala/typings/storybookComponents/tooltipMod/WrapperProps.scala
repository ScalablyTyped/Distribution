package typings.storybookComponents.tooltipMod

import typings.storybookComponents.storybookComponentsStrings.ancillary
import typings.storybookComponents.storybookComponentsStrings.border
import typings.storybookComponents.storybookComponentsStrings.critical
import typings.storybookComponents.storybookComponentsStrings.dark
import typings.storybookComponents.storybookComponentsStrings.darker
import typings.storybookComponents.storybookComponentsStrings.darkest
import typings.storybookComponents.storybookComponentsStrings.defaultText
import typings.storybookComponents.storybookComponentsStrings.gold
import typings.storybookComponents.storybookComponentsStrings.green
import typings.storybookComponents.storybookComponentsStrings.inverseText
import typings.storybookComponents.storybookComponentsStrings.light
import typings.storybookComponents.storybookComponentsStrings.lighter
import typings.storybookComponents.storybookComponentsStrings.lightest
import typings.storybookComponents.storybookComponentsStrings.medium
import typings.storybookComponents.storybookComponentsStrings.mediumdark
import typings.storybookComponents.storybookComponentsStrings.mediumlight
import typings.storybookComponents.storybookComponentsStrings.negative
import typings.storybookComponents.storybookComponentsStrings.orange
import typings.storybookComponents.storybookComponentsStrings.positive
import typings.storybookComponents.storybookComponentsStrings.primary
import typings.storybookComponents.storybookComponentsStrings.purple
import typings.storybookComponents.storybookComponentsStrings.seafoam
import typings.storybookComponents.storybookComponentsStrings.secondary
import typings.storybookComponents.storybookComponentsStrings.tertiary
import typings.storybookComponents.storybookComponentsStrings.ultraviolet
import typings.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperProps extends js.Object {
  
  var color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = js.native
  
  var hasChrome: Boolean = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var placement: String = js.native
}
object WrapperProps {
  
  @scala.inline
  def apply(
    color: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText,
    hasChrome: Boolean,
    placement: String
  ): WrapperProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
  
  @scala.inline
  implicit class WrapperPropsOps[Self <: WrapperProps] (val x: Self) extends AnyVal {
    
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
    def setColor(
      value: /* keyof @storybook/theming.@storybook/theming/dist/types.Color */ primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChrome(value: Boolean): Self = this.set("hasChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
}
