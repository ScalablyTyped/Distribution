package typings.reactMdCard.cardActionsMod

import typings.react.mod.HTMLAttributes
import typings.reactMdCard.reactMdCardStrings.center
import typings.reactMdCard.reactMdCardStrings.end
import typings.reactMdCard.reactMdCardStrings.start
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardActionsProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * The alignment to use for the card actions. This is really just a simple
    * pass through to the `justify-content` flex property.
    */
  var align: js.UndefOr[start | end | center] = js.native
}
object CardActionsProps {
  
  @scala.inline
  def apply(): CardActionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionsProps]
  }
  
  @scala.inline
  implicit class CardActionsPropsOps[Self <: CardActionsProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: start | end | center): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
}
