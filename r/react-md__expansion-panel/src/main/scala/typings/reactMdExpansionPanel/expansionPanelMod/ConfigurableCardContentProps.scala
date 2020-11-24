package typings.reactMdExpansionPanel.expansionPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/card.@react-md/card.CardContentProps, 'disablePadding' | 'disableSecondaryColor' | 'disableParagraphMargin'> */
@js.native
trait ConfigurableCardContentProps extends js.Object {
  
  var disablePadding: js.UndefOr[Boolean] = js.native
  
  var disableParagraphMargin: js.UndefOr[Boolean] = js.native
  
  var disableSecondaryColor: js.UndefOr[Boolean] = js.native
}
object ConfigurableCardContentProps {
  
  @scala.inline
  def apply(): ConfigurableCardContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurableCardContentProps]
  }
  
  @scala.inline
  implicit class ConfigurableCardContentPropsOps[Self <: ConfigurableCardContentProps] (val x: Self) extends AnyVal {
    
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
    def setDisablePadding(value: Boolean): Self = this.set("disablePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePadding: Self = this.set("disablePadding", js.undefined)
    
    @scala.inline
    def setDisableParagraphMargin(value: Boolean): Self = this.set("disableParagraphMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableParagraphMargin: Self = this.set("disableParagraphMargin", js.undefined)
    
    @scala.inline
    def setDisableSecondaryColor(value: Boolean): Self = this.set("disableSecondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSecondaryColor: Self = this.set("disableSecondaryColor", js.undefined)
  }
}
