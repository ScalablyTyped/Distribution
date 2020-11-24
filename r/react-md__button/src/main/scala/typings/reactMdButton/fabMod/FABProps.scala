package typings.reactMdButton.fabMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FABProps extends HTMLAttributes[HTMLSpanElement] {
  
  /**
    * The position within the viewport to display the button as a floating action
    * button.
    */
  var position: js.UndefOr[FABPosition] = js.native
}
object FABProps {
  
  @scala.inline
  def apply(): FABProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FABProps]
  }
  
  @scala.inline
  implicit class FABPropsOps[Self <: FABProps] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: FABPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
}
