package typings.storybookAddonCentered.anon

import typings.storybookAddonCentered.storybookAddonCenteredStrings.`0`
import typings.storybookAddonCentered.storybookAddonCenteredStrings.auto
import typings.storybookAddonCentered.storybookAddonCenteredStrings.center
import typings.storybookAddonCentered.storybookAddonCenteredStrings.fixed
import typings.storybookAddonCentered.storybookAddonCenteredStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignItems extends js.Object {
  
  val alignItems: center = js.native
  
  val bottom: `0` = js.native
  
  val display: flex = js.native
  
  val left: `0` = js.native
  
  val overflow: auto = js.native
  
  val position: fixed = js.native
  
  val right: `0` = js.native
  
  val top: `0` = js.native
}
object AlignItems {
  
  @scala.inline
  def apply(
    alignItems: center,
    bottom: `0`,
    display: flex,
    left: `0`,
    overflow: auto,
    position: fixed,
    right: `0`,
    top: `0`
  ): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  
  @scala.inline
  implicit class AlignItemsOps[Self <: AlignItems] (val x: Self) extends AnyVal {
    
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
    def setAlignItems(value: center): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: `0`): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: flex): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: `0`): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: auto): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: fixed): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: `0`): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: `0`): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}
