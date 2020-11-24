package typings.reactMdCard.cardSubtitleMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardSubtitleProps extends HTMLAttributes[HTMLHeadingElement] {
  
  /**
    * Boolean if the subtitle should no longer use the secondary text color
    * within cards.
    */
  var disableSecondaryColor: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the title should not be able to line-wrap and will ellipsis long
    * text.
    */
  var noWrap: js.UndefOr[Boolean] = js.native
}
object CardSubtitleProps {
  
  @scala.inline
  def apply(): CardSubtitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardSubtitleProps]
  }
  
  @scala.inline
  implicit class CardSubtitlePropsOps[Self <: CardSubtitleProps] (val x: Self) extends AnyVal {
    
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
    def setDisableSecondaryColor(value: Boolean): Self = this.set("disableSecondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSecondaryColor: Self = this.set("disableSecondaryColor", js.undefined)
    
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
  }
}
