package typings.storybookComponents.tooltipLinkListMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.storybookComponents.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps, 'onClick'> ]: @storybook/components.@storybook/components/dist/tooltip/ListItem.ListItemProps[P]} */ @js.native
trait Link extends js.Object {
  
  var id: String = js.native
  
  var isGatsby: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps, Unit]
  ] = js.native
}
object Link {
  
  @scala.inline
  def apply(id: String): Link = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGatsby(value: Boolean): Self = this.set("isGatsby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGatsby: Self = this.set("isGatsby", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* event */ SyntheticEvent[Element, Event], /* item */ ListItemProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
}
